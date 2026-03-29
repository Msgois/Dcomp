#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void AnaliseStrings(char* string1, char* string2) {
  char *ponteiro1, *ponteiro2, *ponteiro1auxiliar;
  for (ponteiro1 = string1; *ponteiro1 != '\0'; ponteiro1++) {
    ponteiro1auxiliar = ponteiro1;
    ponteiro2 = string2;
    while (*ponteiro1auxiliar != '\0' && *ponteiro2 != '\0' &&
           *ponteiro1auxiliar == *ponteiro2) {
      ponteiro1auxiliar++;
      ponteiro2++;
    }
    if (*ponteiro2 == '\0') {
      printf("SIM");
      break;
    }
  }
}

int main() {}
