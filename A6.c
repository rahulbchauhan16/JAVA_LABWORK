#include <stdio.h>
int main()
{
    int n, i, sum = 0;
    printf("Enter num:");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        if (i % 2 != 0)
        {
            printf("%d\n", i);
            sum += i;
        }
    }
    printf("Sum=%d", sum);
}