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
        printf("\n3 to display queue");
        printf("\n4 to exit program");
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
            display(&q);
            break;

        case 4:
            exit(0);
            break;
        default:
            printf("\ninvalid choice");
            continue;
        }
    }
}