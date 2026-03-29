#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int** MatrizDinamica(int N) {
  int controleexterno, controleinterno;
  int** matriz1 = malloc(N * (sizeof(int*)));
  for (controleexterno = 0; controleexterno < N; controleexterno++) {
    matriz1[controleexterno] = malloc(N * (sizeof(int)));
  }
  for (controleexterno = 0; controleexterno < N; controleexterno++) {
    for (controleinterno = 0; controleinterno < N; controleinterno++) {
      if (controleinterno == controleinterno) {
        matriz1[controleexterno][controleinterno] = 1;
      } else {
        matriz1[controleexterno][controleinterno] = 0;
      }
    }
  }
  return matriz1;
}