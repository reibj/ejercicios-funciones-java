import java.util.Scanner;

public class Ej2 {
    /* Ejercicio2. Escribe un programa que solicite números enteros al usuario.
    • Evaluará cada número para determinar si es par.
    • En caso afirmativo, solicita otro número más.
    • En caso negativo, finaliza la ejecución del programa con mensaje de
    finalización
    • Utiliza una función que devuelve valor booleano para determinar si un
    número es par.
    */

    //función 
    public static boolean parOimpar(int num) {
        
        boolean par;

        if (num%2==0){
            par = true;
        } else{
            par = false;
        }
        
        return par;
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número entero para ver si es par");
        int num = teclado.nextInt();

        //creo variable que será par(true) o impar (false) según el resultado de la función
        boolean esPar;
        esPar = parOimpar(num);

        System.out.println(esPar);

        //mientras sea par(true), seguirá pidiendo un número
        while (esPar==true){
            System.out.println("Introduce otro número entero"); 
            num = teclado.nextInt();
            System.out.println(parOimpar(num));
            if (parOimpar(num)==false){ //si el metodo da false, esPar será false y dejará de pedir num
                esPar=false;               
            }
        }

        System.out.println("Número impar introducido. Fin.");
    
        teclado.close();
    }
}
