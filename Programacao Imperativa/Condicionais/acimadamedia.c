#include <stdio.h>

int main(){
float a,b,c;
printf("Digite 3 numero");
scanf("%f%f%f",&a,&b,&c);
if(a>(a+b+c)/3 && b>(a+b+c)/3 && c>(a+b+c)/3){
    printf("%d",3);
}else if((a>(a+b+c)/3 && b>(a+b+c)/3 && c<(a+b+c)/3) || (a>(a+b+c)/3 && c>(a+b+c)/3 && b<(a+b+c)/3) || (c>(a+b+c)/3 && b>(a+b+c)/3 && a<(a+b+c)/3)){
    printf("%d",2);
}else if((a>(a+b+c)/3 && b<(a+b+c)/3 && c<(a+b+c)/3) || (a>(a+b+c)/3 && c<(a+b+c)/3 && b<(a+b+c)/3) || (c>(a+b+c)/3 && b<(a+b+c)/3 && a<(a+b+c)/3)){
printf("%d",1);
}else{
    printf("%d",0);
}
}

