#include <stdio.h>
#include <stdlib.h>
int cmpfunc(const void *a, const void *b)
{
    printf("\n%d %d %d\n", *(int *)a, *(int *)b, (*(int *)a - *(int *)b));
    // printf("\n",(int*)a, " " , (int*) b , " ", (*(int *)a - *(int *)b),"\n");
    return (*(int *)a - *(int *)b);
}

int main()
{
    int i;
    int int_array[] = {99, 66, 10, 21, 250};

    printf("\nArray before sorting : ");
    for (i = 0; i < 5; i++)
    {
        printf("%d ", int_array[i]);
    }
    printf("\n");

    qsort(int_array, 5, sizeof(int), cmpfunc);

    printf("\nArray after sorting : ");
    for (i = 0; i < 5; i++)
    {
        printf("%d ", int_array[i]);
    }
    printf("\n");
}
