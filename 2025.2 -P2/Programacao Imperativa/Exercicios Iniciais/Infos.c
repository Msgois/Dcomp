#include <stdio.h>
#include <stdlib.h>

int main()
{
     int idade;
    char nome[50];
    char sexo;
    float altura;

    printf("Digite seu nome\n", nome);
    scanf("%49s", &nome);
    printf("Digite sua idade\n", idade);
    scanf("%d", &idade);
    printf("Digite sua altura\n", altura);
    scanf("%f", &altura);
    printf("Digite seu sexo\n", sexo);
    scanf(" %c", &sexo);

    printf("Os valores digitados são\n%s\n%d\n%.2f\n%c",nome,idade,altura,sexo);
    return 0;
}
