#include <stdio.h>
int main()
{
    char str[100], ch;
    int count = 0, i;
    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);
    printf("Enter character to count: ");
    scanf("%c", &ch);
    for (i = 0; str[i] != '\0'; i++)
    {
        if (str[i] == ch)
            count++;
    }

    printf("'%c' occurs %d times in the string.\n", ch, count);

    return 0;
}