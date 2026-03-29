#include <stdio.h>
#include <math.h>

int main(){
char escolha;
int a,b,c;
printf("Digite qual tipo de media vc quer fazer \nA-ARITMETICA\nH-HARMONICA\nG-GEOMETRICA");
scanf(" %c",&escolha);
printf("\nAgora digite os 3 numeros");
scanf("%d%d%d",&a,&b,&c);
switch(escolha){
    case 'A': printf("%f",((float)a+b+c)/3);
    break;
    case 'H': printf("%f",((float)3/(1.0f/a+1.0f/b+1.0f/c)));
    break;
    case 'G': printf("%f",pow((float)(a*b*c),1.0f/3.0f));
    break;
}
}
