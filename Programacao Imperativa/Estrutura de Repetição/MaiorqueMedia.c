#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
//Tem q fazer um programa pra pegar notas
//e mostrar aquelas q são maiores q a media
//da turma, para de ler quando digitar .
{
  char stringnotas[100];
  float floatnotas[10], maioresnotas[10];
  float media=0.0,notaaux=0.0,totalnotas=0.0;
  int i=0,a=0,j=0;
   fgets(stringnotas,100,stdin);

  while(strcmp(stringnotas,".\n")!=0){
      /* Enquanto notas não for ".", ele vai continuar rodando
      oq tem dentro do while*/

      notaaux=atof(stringnotas);

      floatnotas[i]=notaaux;
  i++;
  fgets(stringnotas,100,stdin);

  }
    for(a=0;a<i;a++){
    totalnotas+=floatnotas[a];
  }
  if(i>0){
    media=(totalnotas/(i));
  }
  a=0;
  for(j=0;j<i;j++){
    if(floatnotas[j]>media){
        maioresnotas[a]=floatnotas[j];
        a++;
    }
  }
    for(j=0;j<a;j++){

     printf("%2.f\n",(maioresnotas[j]));
  }
}
