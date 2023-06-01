package com.app;

  /* Converter um número inteiro para um array desse número invertido
   * dado um número inteiro não negativo escreva um código que retorne um 
   * array desse(s) número(s) invertido(s).
   */

public class Reverse {
  
  public int[] reverseNumber(int number) {
    // Escreva aqui o seu código.
    int[] result = new int[Integer.toString(number).length()];

    int i = 0;
    while (number > 0) {
      result[i] = number % 10;
      number = number / 10;
      i++;
    }

    return result;
  }
}
