#include <stdio.h>

int main() {
  int vetor[10];
  int i, numerodigitado;

  for (i = 0; i < 10; i++) {
    scanf("%d", &vetor[i]);
    /*scanf("%d", &numerodigitado);
    vetor[i] = numerodigitado; OUTRA FORMA DE FAZERS*/
  }
  for (i = 0; i < 10; i++) {  // Ordem Normal
    printf("%d\n", vetor[i]);
  }
  printf("---------------------\n");

  for (i = 9; i >= 0; i--) {  // Ordem Invertida
    printf("%d\n", vetor[i]);
  }
}