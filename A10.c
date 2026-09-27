#include <stdio.h>
int main()
{
    int x, y, i, ans = 1;
    printf("Enter num:");
    scanf("%d", &x);
    printf("Enter power:");
    scanf("%d", &y);
    for (i = 1; i <= y; i++)
    {
        ans *= x;
    }
    printf("Ans = %d", ans);
    return 0;
}