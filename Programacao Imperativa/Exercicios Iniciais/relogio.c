 #include <stdio.h>

 int main(){
int seg;
printf("Digite os segundos");
 scanf("%d",&seg);
float h=(float)seg/60/60;
float m= (h-(int)h)*60;
float s= (m-(int)m)*60;
printf("\n%.0f:%.0f:%.0f",h,m,s);



 }

