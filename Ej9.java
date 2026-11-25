import java.util.Scanner;

public class Ej9 {
    /* Ejercicio9. Realiza un programa que resuelva el mismo problema que el anterior 
    ejercicio, pero utilizando la recursividad. */

   
    //hacer más tarde, falta explicar nose que

    public static int potencia(int base, int exponente){

        if (exponente==0){ // caso base X^0 = 1
            return 1;
        } else {
            return base*potencia(base, (exponente-1));
        }
    }


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a calcular una potencia. Introduce la base");
        int base = teclado.nextInt();
        System.out.println("Ahora el exponente");
        int expo = teclado.nextInt();

        System.out.println("El resultado es " + potencia(base, expo));
        
        teclado.close();
    }
}
