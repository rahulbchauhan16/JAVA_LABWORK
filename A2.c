#include <stdio.h>
int main()
{
    char str[100], upper[100], lower[100];
    int i;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);

    for (i = 0; str[i] != '\0'; i++)
    {
        char ch = str[i];
        if (ch >= 'a' && ch <= 'z')
        {
            upper[i] = ch - 32;
        }
        else
        {
            upper[i] = ch;
        }
        if (ch >= 'A' && ch <= 'Z')
        {
            lower[i] = ch + 32;
        }
        else
        {
            lower[i] = ch;
        }
    }
    upper[i] = '\0';
    lower[i] = '\0';

    printf("Uppercase: %s\n", upper);
    printf("Lowercase: %s", lower);

    return 0;
}