#include <stdio.h>
void table(int);
int main()
{
    int n;
    printf("Enter num:");
    scanf("%d", &n);
    table(n);
}
void table(int x)
{
    int i, ans;
    for (i = 1; i <= 10; i++)
    {
        ans = x * i;
        printf("%d x %d = %d\n", x, i, ans);
    }
}