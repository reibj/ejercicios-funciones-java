import java.util.Scanner;

public class Ej11 {
    /* Ejercicio11. Escribe un programa que busque en una cadena de texto dada por el 
    usuario  un  determinado  carácter.  Se  solicita  al  usuario  la  cadena  de  texto  y  el 
    carácter  a  buscar.  Utiliza  una  función  que  tenga  como  parámetro  cadena  y 
    carácter a buscar y devuelva ‘verdadero’ si se ha localizado el carácter. Falso en 
    caso contrario. 
    Desde el programa principal se imprimirá como resultado el mensaje “El carácter 
    X se encuentra en la cadena ZZZZ” 
    Siendo X y ZZZZ los datos de entrada.  */

    public static boolean buscarCaracter(String cadena, char buscar){

        boolean localizado = false;
        cadena = cadena.toLowerCase(); //
        int longitud = cadena.length();

        //se recorre la cadena de texto y se buscan las vocales
        for (int i = 0; i<longitud; i++){
            char c = cadena.charAt(i);
            // si el char es una vocal, se suma 1 al contador
            if (c==buscar){
                localizado = true;
                
            }
        }
        
        System.out.println("Carácter " + buscar + " localizado: " + localizado);
        return localizado;
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto");
        String cadena = teclado.nextLine();

        System.out.println("Escribe el caracter a buscar");
        char buscar = teclado.next().charAt(0);

        buscarCaracter(cadena, buscar);
        System.out.println("El carácter " + buscar + " se encuentra en la cadena: " + cadena);
        
        teclado.close();
    }
}
