#include <stdio.h>
int main()
{
    int n, i, sum = 0;
    printf("Enter number:");
    scanf("%d", &n);
    while (n > 0)
    {
        sum += n % 10;
        n /= 10;
    }
    printf("Ans = %d", sum);
    return 0;
}