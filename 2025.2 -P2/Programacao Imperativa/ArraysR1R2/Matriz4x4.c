#include <stdio.h>

int main() {
  int matriz1[4][4], matriz2[4][4];
  int controleexterno, controleinterno, numero, auxiliador;

  for (controleexterno = 0; controleexterno < 4; controleexterno++) {
    for (controleinterno = 0; controleinterno < 4; controleinterno++) {
      scanf("%d", &numero);
      matriz1[controleexterno][controleinterno] = numero;
    }
  }
  printf("Formada a Matriz4x4\n");
  for (controleexterno = 0; controleexterno < 4; controleexterno++) {
    for (controleinterno = 0; controleinterno < 4; controleinterno++) {
      matriz2[controleexterno][controleinterno] =
          matriz1[controleexterno][controleinterno];
    }
  }
  printf("Iniciando a Troca da Linha 1 pela 4\n");
  for (controleexterno = 0; controleexterno < 4; controleexterno += 3) {
    for (controleinterno = 0; controleinterno < 4; controleinterno++) {
      matriz2[controleexterno][controleinterno] =
          matriz1[controleexterno][controleinterno];
    }
  }
  for (controleexterno = 0; controleexterno < 4; controleexterno++) {
    printf("\n");
    for (controleinterno = 0; controleinterno < 4; controleinterno++) {
      printf("%d", matriz2[controleexterno][controleinterno]);
    }
  }
}