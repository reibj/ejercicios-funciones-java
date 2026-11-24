import java.util.Scanner;

public class Ej8 {
    /* Ejercicio8.  Escribe  un  programa  que  calcule  la  operación  de  potencia  (base 
    elevado a exponente) utilizando una función a la que se le pasen ambos valores, 
    solicitados previamente al usuario. Los valores deben ser números enteros. 
    Utiliza un bucle para obtener el resultado. */

    public static int potencia(int base, int exponente){

        double resultado = Math.pow(base, exponente);
        return (int) resultado; // casting explicito a int
    }
    

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a calcular una potencia. Introduce la base");
        int base = teclado.nextInt();
        System.out.println("Ahora el exponente");
        int expo = teclado.nextInt();

        System.out.println("El resultado es " + potencia(base, expo));

        //falta bucle
        
        teclado.close();
    }
}
