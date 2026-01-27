#include <stdio.h>

int main(){
float a,b,c;
printf("Digite o valor a b e c");
scanf("%f%f%f",&a,&b,&c);
printf("\nTretangulo: %.39f",a*c/2);
printf("\nCirculo: %.3f",3.14159*c*c);
printf("\nTrapezio: %.3f",(a+b)*c/2);
printf("\nQuadrado: %.3f",b*b);
printf("\nRetangulo: %.3f",a*b);



}


