#include <stdio.h>
#include <string.h>
#include <ctype.h>
int main(){
char texto[1000];
char letra;
int i=0, numerovogais=0, numeropalavras=0;
fgets(texto,1000,stdin);
if(strcmp(texto,"FIM\n")==0){
    printf("texto vazio");
}
while(strcmp(texto,"FIM\n")!=0){

    while(texto[i] != '\0'){
     letra= tolower(texto[i]);
        if(letra== 'a'){
            numerovogais++;
        }   else if(letra== 'e'){
            numerovogais++;
        }        else if(letra== 'i'){
            numerovogais++;
        }        else if(letra== 'o'){
            numerovogais++;
        }        else if(letra== 'u'){
            numerovogais++;
        } else if((letra== ' ')||(letra=='\n')){
            if((texto[i]!= texto[i+1]&& texto[i]!=texto[i-1])||(texto[i]!=texto[i-1] && texto[i]==texto[i+1])){
        numeropalavras++;
    }
    }
    i++;
}
fgets(texto,1000,stdin);
  }
  if(numeropalavras>0){
  printf("%.2f",(float)numerovogais/numeropalavras);
}}
