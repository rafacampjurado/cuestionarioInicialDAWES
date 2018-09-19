
import java.util.Scanner;

/**
 * Antonio José Sánchez
 * IES Campanillas
 * curso 2018/19
 *
 * Desarrolla una aplicación de JAVA que solicite por teclado una secuencia indefinida
 * de números comprendidos en el intervalo [0,9]; cualquier valor negativo indicará el
 * fin de lectura. Hecho esto, la aplicación mostrará una gráfica indicando la canti-
 * dad leída de cada número. Supongamos que, por ejemplo, el usuario ha introducido la
 * siguiente secuencia numérica: 1 8 4 5 1 3 2 8 3 3 0 -1. La aplicación mostrará en
 * pantalla la siguiente gráfica:
 *
 * 
 *          +
 *    +     +              + 
 * +  +  +  +  +  +        +
 * 0  1  2  3  4  5  6  7  8  9
 * 
 */
public class Estadistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer num ;
        Integer est[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0} ; 
        Scanner scan = new Scanner(System.in) ;
        
        do {
            System.out.print("Dame un numero: ") ;
            num = scan.nextInt() ;
            
            if (num >= 0) est[num]++ ;
            
        } while (num >= 0) ;
        
        // Dibujamos la gráfica
        dibujarGrafica(est) ;
    }
    
    public static Integer maximo(Integer[] est) {
        
        Integer i ;
        Integer max = est[0] ;
        
        for (i=1 ; i <= est.length-1; i++) {
            if (est[i]>max) max = est[i] ;
        }
        
        return max ;
    }
    
    public static void dibujarGrafica(Integer[] est) {
        
        Integer i ;
        Integer altura = maximo(est) ;
        
        while (altura > 0) {
            for (i=0; i<=est.length-1; i++) {
                if (est[i] >= altura) {
                    System.out.print(" * ") ;
                } else {
                    System.out.print("   ") ;
                }
            }
            
            System.out.print("\n") ;
            altura-- ;
        }
        
        System.out.println(" 0  1  2  3  4  5  6  7  8  9") ;
    }

}
