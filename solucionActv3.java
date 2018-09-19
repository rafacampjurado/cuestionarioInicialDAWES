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
public class solucionActv3 {
  public static void main(String[] args) {
    System.out.print("Introduce números del 0-9 y uno negativo para terminar. ");
    Integer num;
    Scanner scan = new Scanner(System.in);
    Integer lista[] = {0,0,0,0,0,0,0,0,0,0};
    do {
      System.out.println("-");
       num = scan.nextInt();
       lista(num)++;
    } while (num >= 0);
    dibujarGrafica(lista);
    
  }
  public static Integer maximo(Integer[] est) {
    int max = est[0];
    int i;
    for(i = 1;i<est.length-1;i++){
      if(est[i] > max) max = est[i];
    }
    return max;
  }
  public static void dibujarGrafica(Integer[] est){
    int i;
    int altura = maximo(est);
    while(altura > 0) {
      for(i=0;i<est.length-1;i++){
        if (est[i] == altura) System.out.println(" * ");
        else System.out.println(" ");
      }
      System.out.println("\n");
      altura--;
    }
  }
  
}
