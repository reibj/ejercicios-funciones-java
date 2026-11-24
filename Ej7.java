import java.util.*;

public class Ej7{
    /* Ejercicio7.  Sobrecarga  la  función  creada  en  el  ejercicio  anterior  con  un  único 
        parámetro que indicará la cantidad de números aleatorios a crear, en ese caso, 
        serán números reales aleatorios entre 0 y 1 */


    //función para generar x numeros aleatorios en un rango definido por el usuario
    public static void numAleatorio(int min, int max, int cantidadNum) {

        Random random = new Random();

        System.out.println("Generando " + cantidadNum + " número/s aleatorio/s entre " + min + " y " + max);        
        for (int i=0; i<cantidadNum; i++){
            int num = random.nextInt(min, max +1);
            System.out.println(num);
        }
    }

    //función para generar x numeros aleatorios SIN RANGO
    public static void numAleatorio(int cantidadNum) {
        
        Random random = new Random();
        
        System.out.println("Generando " + cantidadNum + " número/s aleatorio/s entre 0 y 1");        
        for (int i=0; i<cantidadNum; i++){
            int num = random.nextInt(0, 1 +1); 
            System.out.println(num);
        }

    }

    public static boolean esPositivo(int cantidad) {

        boolean positivo = (cantidad>=0);

        return positivo;
  
    }

    public static void main (String [] args){
       

        Scanner teclado = new Scanner (System.in);

        System.out.println("Vamos a escribir números aleatorios, introduce");
        System.out.println("Introduce la cantidad de números aleatorios que deseas");
        int cantidadNum = teclado.nextInt();


        boolean positivo = esPositivo(cantidadNum);
        while (positivo==false){
            System.out.println("Valor no válido, introduce un número positivo");
            cantidadNum = teclado.nextInt();
            positivo = esPositivo(cantidadNum);
        }

        teclado.nextLine(); //limpiamos el buffer para que nos deje escribir

        System.out.println("Vamos a definir el rango, introduce el mínimo");
        String min = teclado.nextLine(); // tipo String pq si ponemos Int no podemos dejarla vacía

        System.out.println("Ahora el máximo");
        String max = teclado.nextLine();


        if (min.isEmpty() || max.isEmpty()){ //si damos enter, x esta vacío, asi que se inicia la función correspondiente
            numAleatorio(cantidadNum);

        } else{ //si x tiene un valor, se inicia la función correspondiente
            int minNum = Integer.parseInt(min); // parseInt transforma el String a Int para la funcion
            int maxNum = Integer.parseInt(max); // idem
            numAleatorio(minNum, maxNum, cantidadNum);
        }


        teclado.close();
    }
}