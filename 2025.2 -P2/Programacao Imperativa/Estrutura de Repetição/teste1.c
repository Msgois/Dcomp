#include <stdio.h>
#include <string.h> // Biblioteca necessária para a função strcmp()

#define TAM_MAX_VOTO 10 // Define o tamanho máximo para a palavra "ENCERRAR"

int main() {
    // Variáveis de contagem
    int votos_sim = 0;
    int votos_nao = 0;
    int votos_nulo = 0;

    // Buffer para armazenar o voto digitado pelo usuário
    char voto[TAM_MAX_VOTO];

    printf("--- Plebiscito Reveillon Topázio ---\n");
    printf("Opções de voto: SIM, NAO, NULO. Digite 'ENCERRAR' para finalizar.\n\n");

    // Laço de repetição infinito (while(1)) que será quebrado pelo comando 'break'
    while (1) {
        printf("Seu voto: ");

        // Leitura da string (voto). Nomes de arrays não precisam do & comercial.
        if (scanf("%s", voto) != 1) {
             // Trata erro de leitura e encerra
            break;
        }

        // 1. CONDIÇÃO DE PARADA: Verifica se o voto é "ENCERRAR"
        // strcmp() retorna 0 se as strings forem idênticas.
        if (strcmp(voto, "ENCERRAR") == 0) {
            printf("\n--- Contagem Encerrada ---\n");
            break; // Instrução imperativa para sair imediatamente do loop
        }

        // 2. CONTAGEM DOS VOTOS
        if (strcmp(voto, "SIM") == 0) {
            votos_sim++;
        } else if (strcmp(voto, "NAO") == 0) {
            votos_nao++;
        } else if (strcmp(voto, "NULO") == 0) {
            votos_nulo++;
        } else {
            printf("Voto inválido. Por favor, digite SIM, NAO, NULO ou ENCERRAR.\n");
        }
    }

    // 3. DECISÃO FINAL (Lógica do Plebiscito)
    int votos_contra = votos_nao + votos_nulo;

    printf("Votos SIM: %d\n", votos_sim);
    printf("Votos NAO + NULO: %d\n", votos_contra);
    printf("------------------------------\n");

    // A queima de fogos é realizada se SIM > (NAO + NULO)
    if (votos_sim > votos_contra) {
        printf("DECISÃO: HAVERÁ QUEIMA DE FOGOS! 🎉\n");
    } else {
        printf("DECISÃO: NÃO HAVERÁ QUEIMA DE FOGOS. 😔\n");
    }

    return 0;
}
