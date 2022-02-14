#include <stdio.h>
int linear_search(int key, int a[], int n)
{
    int i;
    for (i = 0; i < n; i++)
    {
        if (a[i] == key)
            return i + 1;
    }
    return 0;
}

int main()
{
    int i, n, key, position, a[20];
    printf("Enter the no of elements in the array: \n");
    scanf("%d", &n);
    printf("Enter the key element to be searched\n");
    scanf("%d", &key);
    printf("Enter the array values : \n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    position = linear_search(key, a, n);
    if (position == 0)
    {
        printf("search unsuccessful\n");
    }
    else
    {
        printf("Key element %d found at location %d\n", key, position);
    }
}