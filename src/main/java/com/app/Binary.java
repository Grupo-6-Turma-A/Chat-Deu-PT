package com.app;

public class Binary {
  // Dada uma sequência de dígitos, você deve substituir qualquer dígito abaixo de
  // 5 por '0' e
  // qualquer dígito 5 e acima por '1'. Retorne a string resultante.
  public static String fakeBinary(String numberString) {
    // Code here
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
