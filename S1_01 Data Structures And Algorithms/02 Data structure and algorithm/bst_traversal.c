#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct node
{
    int info;
    struct node *llink;
    struct node *rlink;
};
typedef struct node *NODE;

NODE insert(int item, NODE root)
{
    NODE temp, cur, prev;
    temp = (NODE)malloc(sizeof(struct node));

    if(temp == NULL ){
        printf("\nOut of memory");
    }

    temp->info = item;
    temp->llink = NULL;
    temp->rlink = NULL;

    if (root == NULL)
    {
        return temp;
    }
    prev = NULL;
    cur = root;

    while (cur != NULL)
    {
        prev = cur;
        cur = (item < cur->info) ? cur->llink : cur->rlink;
    }

    if (item < prev->info)
    {
        prev->llink = temp;
    }
    else
    {
        prev->rlink = temp;
    }

    return root;
}

NODE search(int item, NODE root)
{
    if (root == NULL || item == root->info)
    {
        return root;
    }

    if (item < root->info)
    {
        return search(item, root->llink);
    }

    return search(item, root->rlink);
}

int main()
{
    NODE root = NULL, temp = NULL;

    int choice, item, flag;

    while (1)
    {
        printf("\n1 Insert");
        printf("\n2 Search");
        printf("\n3 Exit");
        printf("\nEnter the choice : ");
        scanf("%d", &choice);
        switch ((choice))
        {
        case 1:
            printf("\nEnter the item to be inserted : ");
            scanf("%d", &item);
            root = insert(item, root);
            break;
        case 2:
            if (root == NULL)
            {
                printf("tree is empty\n");
            }
            else
            {
                printf("Enter the item to be searched:");
                scanf("%d", &item);

                temp = search(item, root);
                if (temp == NULL)
                {
                    printf("\nSearch Unsuccessful");
                }
                else
                {
                    printf("\nSearch successful");
                }
                printf("\n");
            }
            break;
        case 3:
            exit(0);
            break;
        default:
            printf("\nInvalid choice");
            continue;
        }
    }
}
