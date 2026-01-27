#include <stdio.h>
int main(){
int rodadasiniciais;
int NumeroescolhidoA;
int NumeroescolhidoB;
int pontuacaoA=0,pontuacaoB=0;
int rodadasdojogo;

scanf("%d",&rodadasiniciais);
/*Vai gerar um scan, o usuario vai digitar o numero de rodadas
que quer jogar, o scan vai guardar esse numero na variavel rodadasiniciais*/

while(rodadasiniciais!=0){
/* É necessário o uso de 2 while, pq o while ele sempre retorna pra cima,
então o externo é usado pra controlar se o usuario digirou o numero 0, ou nào,
quando acaba o 2 while(interno),o mesmo le um scan e volta pra cima, lendo se
o usuario digitou 0 ou algum valor positivo*/

    rodadasdojogo= rodadasiniciais;//Passando o valor digitado pra dentro de uma variavel
    pontuacaoA=0;
    pontuacaoB=0;
    while(rodadasdojogo!=0){
    /*Aqui esta o while q realmente é o funcionamento das rodadas
    , quando a rodadasdojogo chega a zero, a gnt sai do while e da de cara com o scan
    pra ler um novo valor digitado pelo usuario*/

    scanf("%d%d",&NumeroescolhidoA,&NumeroescolhidoB);
    if(NumeroescolhidoA>NumeroescolhidoB){
       pontuacaoA++;
    }else if(NumeroescolhidoB>NumeroescolhidoA){
    pontuacaoB++;
    }
rodadasdojogo--;
}
printf("%d %d\n",pontuacaoA,pontuacaoB);
scanf("%d",&rodadasiniciais);
}
}


