#include <stdio.h>

int main(){
int num;
printf("Digite o valor a ser decomposto");
scanf("%d",&num);
printf("\n%d Notas de 100",num/100);
num %=100;
printf("\n%d Notas de 50",num/50);
num %=50;
printf("\n%d Notas de 20",num/20);
num %=20;
printf("\n%d Notas de 10",num/10);
num %=10;
printf("\n%d Notas de 5",num/5);
num %=5;
printf("\n%d Notas de 2",num/2);
num %=2;
printf("\n%d Notas de 1",num/1);

}

