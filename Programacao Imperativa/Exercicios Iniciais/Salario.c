#include <stdio.h>

int main(){
float salario;
float aumento;

printf("Digite o seu salario e o respectivo aumento em porcentagem:");
scanf("%f%f",&salario,&aumento);
printf("\n Seu salario teve um aumento de %.1f passando para \n%.1f",aumento,salario*(1+aumento/100));
return 0;

}
