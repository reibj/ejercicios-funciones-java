import java.util.Scanner;

public class Ej14 {
    /* Ejercicio14. Diseña un programa que presente un menú con las siguientes 
    opciones: 
    1. Sumar dos números 
    2. Restar dos números 
    3. Multiplicar dos números 
    4. Dividir dos números 
    5. Salir 
    • Para realizar la operación seleccionada por el usuario, se utiliza una función 
    calculadora  que  tiene  como  parámetros de  entrada los  dos  números  y  la 
    operación. 
    • Utiliza una función mostrarMenu que imprima las opciones por pantalla. 
    • Cuando el usuario seleccione la opción 5, se sale del programa  */


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String opcion; // string pq la funcion operar va con string

        do {
            System.out.println("---- CALCULADORA ----");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Salir");

            opcion = teclado.nextLine();

            if (opcion.equals("5")){ // si es 5 sale del menú
                break;
            } else if (!opcion.equals("5")){ //como la funcion del ej3 va con simbolos, pasamos los nums a simbolos
                if (opcion.equals("1")){
                    opcion = "+";
                } else if (opcion.equals("2")){
                    opcion = "-";
                } else if (opcion.equals("3")){
                    opcion = "*";
                } else if (opcion.equals("4")){
                    opcion = "/";
                }

            System.out.println("Introduce el primer número");
            int num1 = teclado.nextInt();
            System.out.println("Introduce el segundo número");
            int num2 = teclado.nextInt();
            teclado.nextLine(); //limpia el buffer

            System.out.println(Ej3.operar(num1, num2, opcion)); //llammaos la funcion 

            }

        } while (!opcion.equals("5"));


        System.out.println("Saliendo...");
        teclado.close();


           
    }
}
