
import java.util.Scanner;

/**
 * Antonio José Sánchez
 * IES Campanillas
 * curso 2018/19
 *
 * Desarrolla una aplicación JAVA que, dada una cadena de texto como entrada desde teclado,
 * determine e indique por pantalla si dicha cadena es o no un palíndromo. Recuerda que un
 * palíndromo es una palabra o frase que se lee igual de izquierda a derecha, que de dere-
 * cha a izquierda. A modo de ejemplo, las siguientes palabras y frases son palíndromos:
 * ana, arenera, radar, dabale arroz a la zorra el abad, amad a la dama, etc. Para simpli-
 * ficar el ejercicio, supón que el usuario introducirá la cadena sin espacios.
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String msg ;
        
        // Pedimos la frase
        System.out.print("Introduce una palabra o frase: ") ;
        msg = new Scanner(System.in).next() ;
        
        if (esPalindromo(msg)) System.out.println("El mensaje es un palíndromo.");
        else System.out.println("El mensaje NO es un palíndromo.");
    }
    
    /**
     * Comprueba si una palabra/frase dada es o no un palíndromo.
     * @param msg
     * @return 
     */
    public static boolean esPalindromo(String msg) {
        
        Integer i = 0 ;
        Integer j = msg.length()-1 ;
        
        while ((i <= j) && (msg.charAt(i)==msg.charAt(j))) {
            i++ ;
            j-- ;
        }
        
        return (i > j) ;
    }
    
}