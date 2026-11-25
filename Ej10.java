import java.util.Scanner;

public class Ej10 {
    /* Ejercicio10. Escribe un programa que cuente las vocales en una cadena de texto 
    introducida  por  el  usuario.  Utiliza  una  función  que  tenga  como  parámetro  una 
    cadena de texto y devuelva un entero. 
    Ver métodos length y charAt de la clase String. */

    public static int vocales(String cadena){

        int contador = 0;
        cadena = cadena.toLowerCase(); //
        int longitud = cadena.length();

        //se recorre la cadena de texto y se buscan las vocales
        for (int i = 0; i<longitud; i++){
            char vocal = cadena.charAt(i);
            // si el char es una vocal, se suma 1 al contador
            if (vocal=='a' || vocal=='e' || vocal=='i'|| vocal=='o' || vocal=='u'){
                System.out.print(vocal + " ");
                contador ++;
            }
        }
        //se imprime el resultado
        System.out.println();
        System.out.println("Vocales: " +contador);

        return contador;
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto y contaremos las vocales");
        String cadena = teclado.nextLine();

        vocales(cadena);
        
        teclado.close();
    }
}
