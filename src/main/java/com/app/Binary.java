package com.app;

/* Você receberá uma String de números e sua missão será
 * substituir todos os números abaixo de [5] por [0] e 
 * todos os números maiores ou iguais a [5] por [1].
 */

public class Binary {

  public static String fakeBinary(String numberString) {
    // Escreva aqui o seu código.
    String result = "";

    for (int i = 0; i < numberString.length(); i++) {
      if (numberString.charAt(i) < '5') {
        result += '0';
      } else {
        result += '1';
      }
    }

    return result;
  }
}
