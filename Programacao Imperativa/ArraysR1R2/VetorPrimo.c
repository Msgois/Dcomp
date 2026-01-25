#include <stdio.h>

int main() {
  int vetor[10];
  int i, j, divisores;
  for (i = 0; i < 10; i++) {
    scanf("%d", &vetor[i]);
    /*scanf("%d", &numerodigitado);
    vetor[i] = numerodigitado; OUTRA FORMA DE FAZER*/
  }
  for (i = 0; i < 10; i++) {
    divisores = 0;
    for (j = 1; j <= vetor[i]; j++) {
      if (vetor[i] % j == 0) {
        divisores++;
      }
    }
    if (divisores == 2) {
      printf("%d", vetor[i]);
    }
  }
}