#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
  char nome[100];
  float salario;
  int idade, filhos;
} Pessoa;

void CriarPessoa(Pessoa lista[], int tam) {
  int i = 0;
  for (i = 0; i < tam; i++) {
    printf("Digite o nome");
    fgets(lista[i].nome, 100, stdin);
    lista[i].nome[strcspn(lista[i].nome, "\n")] = 0;
    printf("Digite o salario");
    scanf("%f", &lista[i].salario);
    printf("Digite a idade");
    scanf("%d", &lista[i].idade);
    printf("Digite o n de filhos");
    scanf("%d", &lista[i].filhos);
    getchar();
  }
}

void AlterarPessoa(Pessoa lista[], char nomep[], char oqalterar[]) {
  int i = 0;
  bool achou = false;
  for (i = 0; i < 20; i++) {
    if (strcmp(lista[i].nome, nomep) == 0) {
      achou = true;
      if (strcmp(oqalterar, "salario") == 0) {
        scanf("%f", &lista[i].salario);
        printf("Salario alterado para %.2f", lista[i].salario);
        getchar();

      } else if (strcmp(oqalterar, "idade") == 0) {
        scanf("%d", &lista[i].idade);
        printf("Idade alterada para %d", lista[i].idade);
        getchar();

      } else if (strcmp(oqalterar, "filhos") == 0) {
        scanf("%d", &lista[i].filhos);
        printf("Filhos alterado para %d", lista[i].filhos);
        getchar();

      } else if (strcmp(oqalterar, "nome") == 0) {
        fgets(lista[i].nome, 100, stdin);
        printf("Nome alterado para %s", lista[i].nome);
        getchar();

      } else {
        printf("Termo incorreto");
      }
    }
  }
  if (achou == false) {
    printf("Pessoa nao encontrada");
  }
}

void LerDados(Pessoa lista[]) {
  float totalsalario = 0;
  int totalfilhos = 0, i = 0;
  Pessoa* maiorsalario;

  for (i = 0; i < 20; i++) {
    totalsalario += lista[i].salario;
    totalfilhos += lista[i].filhos;
  }
  printf("A media salarial E %.2f", ((totalsalario) / 20.0));
  printf("A media de filhos E %.2f", ((float)(totalfilhos) / 20.0));
  maiorsalario = lista;
  for (i = 0; i < 20; i++) {
    if ((lista + i)->salario > maiorsalario->salario) {
      maiorsalario = (lista + i);
    }
  }
  printf("O maior salario E de %2.f", maiorsalario->salario);
}

int main() {
  Pessoa pessoas[20];
  CriarPessoa(pessoas, 20);
  LerDados(pessoas);
}