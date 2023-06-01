package com.app;

  /* Dado um array de números inteiros positivos e negativos, escreva uma função
   * que retorne a soma dos números positivos contidos nesse array.
   * 
   * Caso o array não possua números positivos, a sua função deverá retornar 0.
   */

public class Positive {
 
  public static int sum(int[] numeros) {
    // Escreva aqui o seu código.

    int soma = 0;
    for(int i = 0; i < numeros.length; i++) {
      if (numeros[i] > 0) {
        soma += numeros[i];
      }
    }

    return soma;
  }
}
