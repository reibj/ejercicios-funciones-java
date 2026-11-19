import java.util.*;

public class Ej6 {
    /* Ejercicio6. Crea un programa que muestre por consola una serie de números
    aleatorios enteros.
    Utiliza una función que requiere los siguientes parámetros:
    • cantidad de números aleatorios que se mostrarán y
    • los valores mínimos y máximos que estos pueden tomar.
    Valida que la cantidad de números es un número mayor o igual a cero. Utiliza una
    función para la validación, que devuelva un valor booleano. */

    //el usuario decide el rango

    //función para generar x numeros aleatorios en un rango definido por el usuario
    public static void numAleatorio(int min, int max, int cantidadNum) {

        Random random = new Random();

        System.out.println("Generando " + cantidadNum + " número/s aleatorio/s entre " + min + " y " + max);        
        for (int i=0; i<cantidadNum; i++){
            int num = random.nextInt(min, max +1);
            System.out.println(num);
        }
    }

    //función que determina si la cantidad de nums a generar el positiva(true) o negativa/cero(false)
    public static boolean esPositivo(int cantidad) {

        boolean positivo = (cantidad>=0);

        return positivo;
  
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        //pedimos la cantidad de números a generar
        System.out.println("Vamos a escribir números aleatorios");
        System.out.println("Introduce la cantidad de números aleatorios que deseas");
        int cantidadNum = teclado.nextInt();

        // creamos variable boolean y con la función determinamos si la cantidad 
        // introducida es positiva, si no, dará error y pedirá un num válido
        boolean positivo = esPositivo(cantidadNum);
        while (positivo==false){
            System.out.println("Valor no válido, introduce un número positivo");
            cantidadNum = teclado.nextInt();
            positivo = esPositivo(cantidadNum);
        }

        System.out.println("Vamos a definir el rango, introduce el mínimo");
        int min = teclado.nextInt();

        System.out.println("Ahora el máximo");
        int max = teclado.nextInt();
        
        numAleatorio(min, max, cantidadNum);

        teclado.close();
    }
}
