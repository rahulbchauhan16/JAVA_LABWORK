#include <stdio.h>
int main()
{
    int n, i, count = 0;
    printf("Enter number:");
    scanf("%d", &n);
    if (n == 0)
    {
        count = 1;
    }
    else
    {
        if (n < 0)
        {
            n = -n;
        }
        for (; n > 0; n /= 10)
        {
            count++;
        }
    }
    printf("No of digits entered = %d", count);

    return 0;
}