#include <stdio.h>

int main()
{
    char str1[200], str2[100];
    int i, j, len1 = 0;

    printf("Enter first string: ");
    fgets(str1, sizeof(str1), stdin);

    printf("Enter second string: ");
    fgets(str2, sizeof(str2), stdin);
    while (str1[len1] != '\0' && str1[len1] != '\n')
    {
        len1++;
    }
    i = len1;
    j = 0;
    while (str2[j] != '\0' && str2[j] != '\n')
    {
        str1[i] = str2[j];
        i++;
        j++;
    }
    str1[i] = '\0';
    printf("Merged string: %s\n", str1);

    return 0;
}