#include <stdio.h>

int main(void) {
    int a_math, a_eng;
    int b_math, b_eng;

    scanf("%d %d", &a_math, &a_eng);
    scanf("%d %d", &b_math, &b_eng);

    if (a_math > b_math && a_eng > b_eng)
        printf("1");
    else
        printf("0");

    return 0;
}