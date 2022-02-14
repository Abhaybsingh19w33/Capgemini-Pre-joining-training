#include <stdio.h>
#include <stdlib.h>

#define QUEUE_SIZE 5

struct queue
{
    int items[QUEUE_SIZE];
    int front;
    int rear;
};

typedef struct queue QUEUE;

int insert_front(int item, QUEUE *q)
{

    if (q->front == 0 && q->rear == -1)
    {
        q->items[++(q->rear)] = item; // inserting at the first location if there is no element in the queue
        // this is at the initial setup of the queue
    }
    else if (q->front != 0)
    {
        // any other position rather than first position
        q->items[--(q->front)] = item;
    }
    else
    {
        // if first position is already filled then item can not be inserted
        printf("\nInsertion at the front end not possible");
    }
}

int delete_rear(QUEUE *q)
{

    if (q->front > q->rear)
    {
        printf("\nQueue is empty, deletion at rear end is not possible");
        return 0;
    }

    printf("The element deleted is %d\n", q->items[q->rear]);

    (q->rear)++;

    if (q->front > q->rear)
    {
        q->front = 0;
        q->rear = -1;
    }
}

int insert_rear(int item, QUEUE *q)
{
    if (q->rear == QUEUE_SIZE - 1)
    {
        printf("\nQueue full, insertion at the rear end not possible");
        return 0;
    }

    (q->rear)++;

    q->items[q->rear] = item;
}

int delete_front(QUEUE *q)
{
    if (q->front > q->rear)
    {
        printf("\nQueue is empty, deletion not possible");
        return 0;
    }

    printf("the element deleted is %d\n", q->items[q->front]);

    (q->front)++;

    if (q->front > q->rear)
    {
        q->front = 0;
        q->rear = -1;
    }
}

int display(QUEUE *q)
{
    int i;

    if (q->front > q->rear)
    {
        printf("\nQueue is empty, cannot display the contents");
        return 0;
    }

    printf("\nThe queue contents are:");
    for (i = q->front; i <= q->rear; i++)
    {
        printf("%d\t", q->items[i]);
    }
}

int main()
{
    QUEUE q;

    // q.front = 0;
    // q.rear = -1;

    int input, item;

    // for (;;)
    while (1)
    {
        printf("\n1 to insert rear");
        printf("\n2 to delete front");
        printf("\n3 to insert front");
        printf("\n4 to delete rear");
        printf("\n5 to display queue");
        printf("\n6 to exit program");
        printf("\nEnter the choice : ");
        scanf("%d", &input);
        switch ((input))
        {
        case 1:
            printf("\nEnter the item to be inserted : ");
            scanf("%d", &item);
            insert_rear(item, &q);
            display(&q);
            break;
        case 2:
            delete_front(&q);
            display(&q);
            break;
        case 3:
            printf("\nEnter the item to be inserted : ");
            scanf("%d", &item);
            insert_front(item, &q);
            display(&q);
            break;
        case 4:
            delete_rear(&q);
            display(&q);
            break;
        case 5:
            display(&q);
            break;
        case 6:
            exit(0);
            break;
        default:
            printf("\ninvalid choice");
            continue;
        }
    }
}