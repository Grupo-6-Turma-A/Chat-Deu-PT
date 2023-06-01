package com.app;

  /* Considere um array ou lista que contenha ovelhas, algumas ovelhas podem estar
   * faltando do seu lugar. Precisamos de uma função que conte o número de ovelhas
   * presentes no array.
   * 
   * Considere que uma ovelha que está PRESENTE é equivalente ao valor booleano
   * TRUE.
   */

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    // Escreva aqui o seu código.
    int count = 0;

     for (int i = 0; i < arrayOfSheeps.length; i++) {
          if (arrayOfSheeps[i] == true) {
            count++;
          }
     }

    return count;
  }
}
