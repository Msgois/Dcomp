#include <stdio.h>

int main(){
float m3,custo;
printf("Digite o m3 e o custo");
scanf("%f%f",&m3,&custo);
printf("%.2f",m3*1000*custo);
printf("%.2f",m3*1000*custo*0.8);
printf("%.2f",m3*1000*custo+m3*1000*custo*0.8);
}
