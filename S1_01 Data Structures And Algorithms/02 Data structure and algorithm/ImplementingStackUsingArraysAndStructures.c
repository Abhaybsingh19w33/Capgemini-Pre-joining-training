#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define STACK_SIZE 5

typedef struct _STACK {
    int items[STACK_SIZE];
    int top;
}stack;

int push(int item, stack *s)
{
    if (s -> top == STACK_SIZE - 1)
    {
        printf("\nStack full");
        return 0;
    }

    // increment the stack pointer and then insert
    s-> top ++;
    s->items[s->top] = item;
    return 0;
}

int pop(stack *s)
{
    int item;

    if (s->top == -1)
    {
        printf("\nStack empty");
        return 0;
    }

    // pop the element and decrement the stack pointer
    item = s->items[s->top];
    s->top--;
    return item;
}

int display(stack *s)
{
    int i;
    if (s->top == -1)
    {
        printf("Stack empty");
        return 0;
    }

    printf("Contents of the stack are : ");
    for (i = 0; i <= (s-> top); i++)
    {
        printf("%d ", s->items[i]);
    }
    printf("\n");
    return 0;
}

int main()
{
    // int top;
    // int s[STACK_SIZE];

    stack s;

    // NODE root = NULL, temp = NULL;

    int input, item;

    s.top = -1;

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
            push(item, &s);
            break;
        case 2:
            item = pop(&s);
            if (item != 0) // if 0 is returned then the stack is empty
            {
                printf("item %d is poped from the stack", item);
            }
            break;
        case 3:
            display(&s);
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
