#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct node
{
    int info;
    struct node *link;
};
typedef struct node *NODE;

NODE insert_front(int item, NODE first)
{
    NODE newnode;
    newnode = (NODE)malloc(sizeof(struct node));
    if (newnode == NULL)
    {
        printf("Out of memory\n");
        exit(1);
    }
    newnode->info = item;
    newnode->link = first;
    return newnode;
}

NODE insert_rear(int item, NODE first)
{
    NODE newnode;
    NODE last;
    newnode = (NODE)malloc(sizeof(struct node));
    if (newnode == NULL)
    {
        printf("Out of memory\n");
        exit(1);
    }
    newnode->info = item;
    newnode->link = NULL;
    if (first == NULL)
        return newnode;

    last = first;
    while (last->link != NULL)
    {
        last = last->link;
    }

    last->link = newnode;

    return first;
}

NODE delete_front(NODE first)
{
    NODE temp;
    if (first == NULL)
    {
        printf("\nList empty");
        return first;
    }

    temp = first;
    first = first->link;
    printf("The item deleted is %d\n", temp->info);
    free(temp);
    return first;
}

NODE delete_rear(NODE first)
{
    NODE last;
    NODE pred;
    if (first == NULL)
    {
        printf("\nList empty");
        return 0;
    }

    if (first->link == NULL)
    {
        printf("The item to be deleted is %d\n", first->info);
        free(first);
        first = NULL;
        return first;
    }

    pred = NULL;

    last = first;
    while (last->link != NULL)
    {
        pred = last;
        last = last->link;
    }

    printf("The item to be deleted is %d\n", last->info);
    free(last);
    pred->link = NULL;
    return first;
}

int display(NODE first)
{
    NODE temp;
    if (first == NULL)
    {
        printf("\nList Empty");
        return 0;
    }
    printf("\nThe contents of the linked list are : ");
    temp = first;
    while (temp != NULL)
    {
        printf("%d\t", temp->info);
        temp = temp->link;
    }
}

int main()
{
    NODE first = NULL;

    int input, item;

    while (1)
    {
        printf("\n1 to insert front");
        printf("\n2 to insert rear");
        printf("\n3 to delete front");
        printf("\n4 to delete rear");
        printf("\n5 to display the list content");
        printf("\n6 to exit program");
        printf("\nEnter the choice : ");
        scanf("%d", &input);
        switch ((input))
        {
        case 1:
            printf("\nEnter the item to be inserted : ");
            scanf("%d", &item);
            first = insert_front(item, first);
            display(first);
            break;
        case 2:
            printf("\nEnter the item to be inserted : ");
            scanf("%d", &item);
            first = insert_rear(item, first);
            display(first);
            break;
        case 3:
            first = delete_front(first);
            display(first);
            break;
        case 4:
            first = delete_rear(first);
            display(first);
            break;
        case 5:
            display(first);
            break;
        case 6:
            exit(0);
            break;
        default:
            printf("\nInvalid choice");
            continue;
        }
    }
}
