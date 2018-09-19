/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawes.iniciales;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class primosMitad {

  public static void main(String[] args) {
    int contador = 1;
    System.out.print("Introduce el número  primo: ");
    int total = new Scanner(System.in).nextInt();
//    while (total > 0) {
//      if(esPrimo(contador)){
//        System.out.print(" "+contador);
//        total--;
//      }
//      contador++;
//    }
if (esPrimo(total)) {
  System.out.println("El número "+total+" es primo");
} else {
  System.out.println("El número "+total+" no es primo");
}
  }

  // Funcion para comprobar si es primo///////////////////////////////////
  public static boolean esPrimo(Integer num) {
    int i = 2; //contador
    if (num == 1) {
      return true;
    }
    while ((i < num) && (num % i != 0) || (num / 2 == i)) {
      i++;
    }
//    if (i == num) return true;
//    else return false;
    return (i == num); // simplificado lo de arriba

  }

}
