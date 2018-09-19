package dawes;

/* @Author Rafael Campos Jurado */
import java.util.Scanner;

public class cuestionarioActv3 {

  public static void main(String[] args) {
    Scanner introDatos = new Scanner(System.in);
    int numIntro = 0;
    int listaNum[];
    listaNum = new int[10];
    Boolean salir = false;
    for (int i = 0; i<10;i++) {
        listaNum[i] = 0;
      }
    while (!salir) {
      
        System.out.print("Para terminar introduce un número negativo.");
        System.out.print("Introduce varios números entre el 0 y el 9 : ");
        numIntro = introDatos.nextInt();
        if(numIntro <0) {
        salir = true;
      } else {
      if(numIntro > 9) {
        System.out.println("Has introducido un número que sobrepasa el rango. Prueba otra vez : ");
        numIntro = introDatos.nextInt();
      }
      listaNum[numIntro]++;
        }
      
    }
    System.out.println("---------------------------");
    for (int i = 0; i < 10; i++) {
        System.out.print(i+" ");
        for (int j = 0; j < listaNum[i]; j++) {
          System.out.print(" * ");
      }
        System.out.println("");
      }
    
  }
}
