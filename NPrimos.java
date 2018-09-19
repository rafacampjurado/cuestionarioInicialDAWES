
import java.util.Scanner ;

/**
 * Antonio José Sánchez
 * IES Campanillas
 * curso 2018/19
 *
 * Desarrolla una aplicación JAVA que, dado un número entero positivo n por teclado, muestre
 * en pantalla los n primeros números primos. De esta manera, si el usuario introduce el va-
 * lor 8, el programa mostrará en pantalla la secuencia: 1, 2, 3, 5, 7, 11, 13, 17
 */
public class NPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer i = 1 ;
        Integer num ;
       
        
        // Pedimos el número
        System.out.print("Dame un número: ") ;
        num = new Scanner(System.in).nextInt() ;
       
        // Mostramos los num primeros primos
        while (num > 0) {
            if (esPrimo(i)) {
                System.out.print(i + " ") ;
                num-- ;
            }
            
            i++ ;
        }
        
    }
    
    /**
     * Compueba si un número dado es o no primo
     * @param num
     * @return 
     */
    public static boolean esPrimo(Integer num) {
        
        Integer i = 2 ;
        
        // El número 1 es primo...
        if (num==1) return true ;
        
        // ... en otro caso, lo comprobamos...
        while ((i < num) && (num%i!=0)) i++ ;
         
        // Según el valor de i devolvemos verdadero o falso
        return (i==num)  ;
    }
}
