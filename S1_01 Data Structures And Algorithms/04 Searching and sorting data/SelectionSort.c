#include <stdio.h>
void selection_sort(int a[], int n)
{

    int i, j;
    int pos;
    int small;
    int temp;
    for (i = 0; i < n - 1; i++)
    {
        small = a[i];
        pos = i;
        for (j = i + 1; j < n; j++)
            if (a[j] < small)
            {
                small = a[j];
                pos = j;
            }

        // "swapping a[il and a [pos ]"
        temp = a[pos];
        a[pos] = a[i];
        a[i] = temp;
    }
}

int main()
{
    int i, n, a[20];
    printf("\nenter the no of elements to sort : ");
    scanf("%d", &n);
    printf("\nenter the array elements : ");

    for (i = 0; i < n; i++)
    {

        scanf("%d", &a[i]);
    }
    selection_sort(a, n);
    printf("The sorted elements are : ");
    for (i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\n");
}
