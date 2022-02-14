#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define STACK_SIZE 10

int push(int item, int *top, int s[])
{
    if (*top == STACK_SIZE - 1)
    {
        printf("\nStack full");
        return 0;
    }

    // increment the stack pointer and then insert
    s[++(*top)] = item;
    return 0;
}

int pop(int *top, int s[])
{
    int item;

    if (*top == -1)
    {
        printf("\nStack empty");
        return 0;
    }

    // pop the element and decrement the stack pointer
    item = s[(*top)--];
    return item;
}

int display(int *top, int s[])
{
    int i;
    if (*top == -1)
    {
        printf("Stack empty");
        return 0;
    }

    printf("Contents of the stack are : ");
    for (i = 0; i <= (*top); i++)
    {
        printf("%d ", s[i]);
    }
    printf("\n");
    return 0;
}

int main()
{
    int top;
    int s[STACK_SIZE];

    // NODE root = NULL, temp = NULL;

    int input, item;

    top = -1;

    while (1)
    {
        printf("\n1 Push");
        printf("\n2 Pop");
        printf("\n3 Display stack contents");
        printf("\n4 Exit");
        printf("\nEnter the choice : ");
        scanf("%d", &input);
        switch ((input))
        {
        case 1:
            printf("\nEnter the item to be pushed : ");
            scanf("%d", &item);
            push(item, &top, s);
            break;
        case 2:
            item = pop(&top, s);
            if (item != 0) // if 0 is returned then the stack is empty
            {
                printf("item %d is poped from the stack", item);
            }
            break;
        case 3:
            display(&top, s);
            break;
        case 4:
            exit(0);
            break;
        default:
            printf("\nInvalid choice");
            continue;
        }
    }
}
