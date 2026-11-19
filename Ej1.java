import java.util.Scanner;

public class Ej1 {
    /* Ejercicio1. Escribe un programa que solicite
    • un valor que corresponde con el total de una factura
    • el valor del % de impuesto a aplicar
    Utiliza una función con 2 parámetros que calcule el total final de la factura. El
    programa finaliza imprimiendo el resultado en pantalla.  */

    //función para calcular impuesto
    public static double impuesto(double valor, double porcentaje) {
        return valor * (1+porcentaje);
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduce el valor de la factura");
        double valor = teclado.nextDouble();
        System.out.println("Introduce el procentajue de impuesto"); //0-1
        double porcentaje = teclado.nextDouble();

        System.out.println(impuesto(valor, porcentaje));

        teclado.close();
    }
}
