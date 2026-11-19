import java.util.Scanner;

public class Ej3 {
    /* Ejercicio3. Escribe un programa que utilice una función sobrecargada para realizar
    operaciones aritméticas.
    • Si se invoca con 2 parámetros (numéricos) devuelve la suma de ambos
    valores
    • Si se invoca con 3 parámetros (2 numéricos y el tercero un operador
    aritmético: +, - , / o *) devuelve el resultado de la operación pasada como
    tercer parámetro. */

    //función
    public static int operar(int a, int b) {
       return a+b;
    }

    public static double operar(double x, double y, String z) {
        switch (z) {
            case "+":
                return x+y;
            case "-":
                return x-y;
            case "*":
                return x*y;
            case "/":
                return x/y;
            default:
                System.out.println("Operador no válido");
                return 0; //la funcion tiene que devolver un double si o si
        }
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Vamos a operar, introduce los valores.");
        int a = teclado.nextInt();
        int b = teclado.nextInt();

        //hay q limpar el buffer ya que en el anterior teclado.next se queda un \n y no nos deja escribir
        teclado.nextLine(); //se consume la entrada '\n'+
        // al limpiarlo, esperamos un enter (suma) o un operador
        System.out.println("Introduce el operador, o enter para sumar");
        String x = teclado.nextLine();

        
        if (x.isEmpty()){ //si damos enter, x esta vacío, asi que se inicia la función correspondiente
            System.out.println(operar(a, b));;

        } else{ //si x tiene un valor, se inicia la función correspondiente
            System.out.println(operar(a, b, x));
        }

        teclado.close();
    }
}
