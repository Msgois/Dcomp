
#include <stdio.h>

int main(){
char nome[50];
char atracao[50];
printf("Digite o seu nome e sua atracao favorita");
fgets(nome,50,stdin);
fgets(atracao,50,stdin);
printf("\nBemVindo %s! Aguardamos voce na %s",nome,atracao);
return 0;
}
