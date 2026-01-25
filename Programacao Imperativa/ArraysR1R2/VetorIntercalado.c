#include <stdio.h>

int main() {
  int vetor1[5], vetor2[5], vetor3[10];
  int i, j = 0;
  printf("Vetor 1\n");
  for (i = 0; i < 5; i++) {
    scanf("%d", &vetor1[i]);
  }

  printf("Vetor 2\n");
  for (i = 0; i < 5; i++) {
    scanf("%d", &vetor2[i]);
  }

  for (i = 0; i < 9; i += 2) {
    vetor3[i] = vetor1[j];
    j++;
  }
  j = 0;
  for (i = 1; i < 10; i += 2) {
    vetor3[i] = vetor2[j];
    j++;
  }

  for (i = 0; i < 10; i++) {
    printf("%d", vetor3[i]);
  }
}