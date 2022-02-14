// this program is only for single digit operations
// do not enter two or more digit value

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

#define STACK_SIZE 20

typedef struct _STACK
{
    double items[STACK_SIZE];
    int top;
} stack;

int push(double item, stack *s)
{
    if (s->top == STACK_SIZE - 1)
    {
        printf("\nStack full");
        return 0;
    }

    // increment the stack pointer and then insert
    (s->top)++;
    s->items[s->top] = item;
    return 0;
}

double pop(stack *s)
{
    double item;

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

double op(char symbol, double op1, double op2)
{
    switch (symbol)
    {
    case '+':
        return op1 + op2;
    case '-':
        return op1 - op2;
    case '*':
        return op1 * op2;
    case '/':
        return op1 / op2;
    case '^':
        return pow(op1, op2);
    default:
        printf("Invalid operator");
        exit(0);
    }
}

int isDigit(char symbol)
{
    return (symbol >= '0' && symbol <= '9');
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
    for (i = 0; i <= (s->top); i++)
    {
        printf("%d ", s->items[i]);
    }
    printf("\n");
    return 0;
}

int main()
{

    int i;
    double result, op1, op2;
    char symbol, postfix[20];
    stack s;
    s.top = -1;
    printf("Enter the post fix expression: ");
    scanf("%s", postfix);

    for (i = 0; i < strlen(postfix); i++)
    {
        symbol = postfix[i];
        if (isDigit(symbol))
        {
            // char to be converted to int
            // storing ascii value of the symbol
            push(symbol - '0', &s);
        }
        else
        {
            op2 = pop(&s);
            op1 = pop(&s);
            result = op(symbol, op1, op2);
            push(result, &s);
        }
    }
    result = pop(&s);
    printf("The final result of the postfix expression is %f\n", result);
    return 0;
}
