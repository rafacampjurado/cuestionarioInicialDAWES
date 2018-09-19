package dawes;

/* @Author Rafael Campos Jurado */
import java.util.Scanner;

public class cuestionarioActv2 {

  public static void main(String[] args) {
    Scanner introducirDatos = new Scanner(System.in);
    int numeroIntro = 0;
    System.out.print("Introduce la cantidad numérica de números primos que quieres que aparezcan: ");
    numeroIntro = introducirDatos.nextInt();
    int numero = 1;
    Boolean esPrimo;
    Boolean salir = false;
    int contador = 0;
    while (!salir){
      esPrimo = true;
      if(contador == numeroIntro){
        salir = true;
      }
      for (int y = 2; y < numero; y++) {
        if (numero % y == 0) {
          esPrimo = false;
        }
      }
        numero++;
      if (esPrimo) {
        System.out.println(numero);
        contador++;
    }
      
    }
  }
}
