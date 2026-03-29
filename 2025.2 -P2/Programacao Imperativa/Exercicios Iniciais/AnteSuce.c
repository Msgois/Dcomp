#include <stdio.h>

int main(){

int numero;

printf("Digite um numero para descobrir seu antecessor e sucessor:\n");
scanf("%d",&numero);
printf("\nO antecessor e %d\nO sucessor e %d",numero-1,numero+1);

return 0;
}
