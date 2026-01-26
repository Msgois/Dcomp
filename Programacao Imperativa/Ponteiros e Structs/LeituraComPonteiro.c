#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
  int lista[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int* ponteiro;
  for (ponteiro = lista; ponteiro < (lista + 10); ponteiro++) {
    printf("%d\n", *ponteiro);
  }
  for (ponteiro = lista; ponteiro < (lista + 10); ponteiro++) {
    *ponteiro *= 2;
    printf("%d\n", *ponteiro);
  }
}