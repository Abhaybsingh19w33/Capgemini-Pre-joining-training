#include <stdio.h>
int count = 0;
int towerofHanoi(int n, char source, char temp, char destination)
{
    if (n == 1)
    {
        printf("move disk 1 from %c to %c\n", source, destination);
        count++;
        return 0;
    }

    towerofHanoi(n - 1, source, destination, temp);
    printf("move disk %d from %c to %c\n", n, source, destination);
    count++;
    towerofHanoi(n - 1, temp, source, destination);
    return 0;
}

int main()
{
    int n;
    printf("enter no of discs: ");
    scanf("%d", &n);
    towerofHanoi(n, 'A', 'B', 'C');
    printf("Total moves is:%d\n", count);
    return 0;
}