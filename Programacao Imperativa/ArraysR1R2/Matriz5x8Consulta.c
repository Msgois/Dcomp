#include <stdio.h>
#include <string.h>

int main() {
  int controleexterno, controleinterno, numero, auxiliador = 0;
  int matriz[5][8];
  char escolha[5] = "SIM\n";
  /*INICIALMENTE COLOQUEI 3, MAS DEVE SER SEMPRE +1, POIS O FGETS GUARDA
  O\N DO ENTER E AINDA COLOCA O \0 PARA INDICAR O FIM DA STRING E GUARDA
  ISSO NA VARIAVEL*/

  for (controleexterno = 0; controleexterno < 5; controleexterno++) {
    for (controleinterno = 0; controleinterno < 8; controleinterno++) {
      scanf("%d", &numero);
      matriz[controleexterno][controleinterno] = numero;
    }
  }
  getchar();  // Limpeza do Buffer
  printf("Matriz Formada");
  printf("\nDigite o Valor a ser procurado\n");
  while ((strcmp(escolha, "SIM\n")) == 0) {
    printf("\nDigite o Valor a ser procurado\n");
    scanf("%d", &numero);
    auxiliador = 0;
    getchar();
    for (controleexterno = 0; controleexterno < 5; controleexterno++) {
      for (controleinterno = 0; controleinterno < 8; controleinterno++) {
        if (matriz[controleexterno][controleinterno] == numero) {
          printf("Achado, presente na posicao %d %d\n", controleexterno,
                 controleinterno);
          auxiliador++;
        }
      }
    }
    if (auxiliador == 0) {
      printf("Nao esta armazenado na matriz!\n");
    }
    printf("Deseja fazer uma nova consulta?");
    fgets(escolha, 5, stdin);
    /*INICIALMENTE COLOQUEI 3, MAS DEVE SER SEMPRE +1, POIS O FGETS GUARDA
  O\N DO ENTER E AINDA COLOCA O \0 PARA INDICAR O FIM DA STRING E GUARDA
  ISSO NA VARIAVEL*/
  }
}