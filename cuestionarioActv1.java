package dawes;
/* @Author Rafael Campos Jurado */

import java.util.Scanner;
public class cuestionarioActv1 {
  public static void main(String[] args) {
    String palabra;
    String resultado = "";
    Scanner datos = new Scanner(System.in);
    System.out.print("Introduce tu palabra: ");
    palabra = datos.nextLine();
//    System.out.println(palabra);
    resultado = new StringBuffer(palabra).reverse().toString();
//    System.out.println(resultado);
    if(resultado.equals(palabra)){
      System.out.println(palabra+" si es un palíndromo");
    }else {
      System.out.println(palabra+" no es un palindromo");
    }
  } 
}