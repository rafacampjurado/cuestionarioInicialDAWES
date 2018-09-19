/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawes;

import java.util.Scanner;
/**
 *
 * @author rafa
 */
public class solucionActv1 {
  public static void main(String[] args) {
    System.out.println("Introduce una palabra");
    String msg = new Scanner (System.in).next();
    if(esPalindromo(msg)) System.out.println("Es palíndromo");
    else System.out.println("No es palíndromo");
    
  }
  public static boolean esPalindromo (String msg) {
    int i = 0;
    int j = msg.length()-1; // se pone el -1 para que no salga del array
    while((i <= j) && (msg.charAt(i)== msg.charAt(j))){
      i++;
      j--;
    }
    return (i>j);
  }
}
