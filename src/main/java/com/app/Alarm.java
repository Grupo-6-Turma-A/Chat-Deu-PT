package com.app;

    /* Escreva uma função chamada setAlarm que recebe dois parâmetros. O primeiro
     * parâmetro, empregado, é verdadeiro sempre que o utilizador estiver empregado
     * e o segundo parâmetro, férias, é verdadeiro sempre que o utilizador estiver
     * de férias.
     * 
     * A função deve retornar true se você estiver empregado e não estiver de férias 
     * (porque essas são as circunstâncias nas quais você precisa definir um alarme).
     * e retornar falso em qualquer outra circunstância.
     * 
     * exemplos:
     * setAlarm(true, true) -> false
     * setAlarm(false, true) -> false
     * setAlarm(false, false) -> false
     * setAlarm(true, false) -> true
     */

public class Alarm {
    
  public static boolean setAlarm(boolean empregado, boolean ferias) {
    // Escreva aqui o seu código.

    if (empregado == true && ferias == false) {
      return true;
    } else {
      return false;
    }
    
  }
}
