// this program is only for single digit operations
// do not enter two or more digit value

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

#define STACK_SIZE 25

typedef struct _STACK
{
    char items[STACK_SIZE];
    int top;
} stack;

char push(char item, stack *s)
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

char pop(stack *s)
{
    char item;

    if (s->top == -1)
    {
        printf("\nStack empty");
        return -1;
    }

    // pop the element and decrement the stack pointer
    item = s->items[s->top];
    s->top--;
    return item;
}

char op(char symbol, char op1, char op2)
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
        return -1;
    }

    printf("Contents of the stack are : ");
    for (i = 0; i <= (s->top); i++)
    {
        printf("%d ", s->items[i]);
    }
    printf("\n");
    return 0;
}

int inputprecendence(char symbol)
{
    switch (symbol)
    {

    case '+':
    case '-':
        return 1;
    case '*':
    case '/':
        return 3;
    case '$':
        return 6;
    // case '+':
    // case '-':
    //     return 1;
    case '(':
        return 9;
    case ')':
        return 0;
    default:
        return 7;
    }
}

int stackPrecedence(char symbol)
{
    switch (symbol)
    {

    case '+':
    case '-':
        return 2;
    case '*':
    case '/':
        return 4;
    case '$':
        return 5;
    // case '+':
    // case '-':
    //     return 1;
    case '(':
        return 0;
    case '#':
        return -1;
    default:
        return 8;
    }
}

void infix_postfix(char *infix, char *postfix)
{

    int i, j;
    stack s;
    char symbol;
    s.top = -1;
    push('#', &s);
    for (i = j = 0; i < strlen(infix); i++)
    {
        symbol = infix[i];
        while (stackPrecedence(s.items[s.top]) > inputprecendence(symbol))
        {
            postfix[j++] = pop(&s);
        }

        if (stackPrecedence(s.items[s.top]) != inputprecendence(symbol))
        {
            push(symbol, &s);
        }
        else
        {
            pop(&s);
        }
    }

    while (s.items[s.top] != '#')
    {
        postfix[j++] = pop(&s);
    }
    postfix[j++] = '\0';
}

int main()
{
    char infix[30], postfix[30];
    printf("enter the infix expression: ");
    scanf("%s", infix);
    infix_postfix(infix, postfix);
    printf("\nThe postfix expression is:%s\n", postfix);
    return 0;
}
