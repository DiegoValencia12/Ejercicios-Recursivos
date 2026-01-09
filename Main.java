/*
PROYECTO: Ejercicios Recursivos
NOMBRE: Diego Valencia Figueroa
FECHA: 7 de enero del 2026
DESCRIPCIÓN: Solucionar ejercicios mediante la recursividad.
 */
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Ejercicio ejercicio = new Ejercicio();

        //Ejercicio 1: Sumar los números de un arreglo.
        System.out.println("Ejercicio 1: Sumar los números de un arreglo.");
        int[] arreglo = {1, 2, 3, 4, 5};//El arreglo almacena datos primitivos
        System.out.println("Arreglo: " + Arrays.toString(arreglo));//Arrays.toString() traduce el arreglo a una cadena de texto legible
        System.out.println("Suma del arreglo: " + ejercicio.sumarArreglo(arreglo, 0));
        System.out.println();

        //Ejercicio 2: Sumar elementos de una lista.
        System.out.println("Ejercicio 2: Sumar elementos de una lista.");
        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));//El arraylist almacena objetos
        System.out.println("Lista: " + lista);//ArrayList hereda de una jerarquía (AbstractCollection) que ya ha redefinido el método toString(). 
        System.out.println("Suma de la lista: " + ejercicio.sumarLista(lista, 0)+"\n");

        //Ejercicio 3: Impresión de datos de un arreglo.
        System.out.println("Ejercicio 3: Impresión de datos de un arreglo.");
        System.out.print("Impresión del arreglo: ");
        ejercicio.imprimirArreglo(arreglo, 0);
        System.out.println("\n");


        //Ejercicio 4: Elevar a potencia un número.
        System.out.println("Ejercicio 4: Elevar a potencia un número.");
        int base = 2;
        int exponente = 3;
        System.out.println(base + " elevado a la " + exponente + " es: " + ejercicio.elevarPotencia(base, exponente));
        System.out.println();

        //Ejercicio 5: Convertir decimal a binario.
        System.out.println("Ejercicio 5: Convertir decimal a binario.");
        int numeroDecimal = 10;
        System.out.print("El número " + numeroDecimal + " en binario es: ");
        ejercicio.decimalABinario(numeroDecimal);
        System.out.println("\n");

        //Ejercicio 6: Máximo común divisor (MCD) de dos números.
        System.out.println("Ejercicio 6: Máximo común divisor (MCD) de dos números.");
        int a = 48;
        int b = 18;
        System.out.println("El MCD de " + a + " y " + b + " es: " + ejercicio.maximoComunDivisor(a, b));
        System.out.println();

        //Ejercicio 7: Función de Ackermann.
        System.out.println("Ejercicio 7: Función de Ackermann.");
        int m = 2;
        int n = 3;
        System.out.println("Ackermann(" + m + ", " + n + ") es: " + ejercicio.ackermann(m, n));
        System.out.println();

        //Ejercicio 8: Números de Catalan.
        System.out.println("Ejercicio 8: Números de Catalan.");
        int catNum = 4;
        System.out.println("El número de Catalan C(" + catNum + ") es: " + ejercicio.numeroCatalan(catNum));
        System.out.println();


        //Ejercicio 9: Busqueda binaria.
        System.out.println("Ejercicio 9: Busqueda binaria.");
        int[] arreglo2 = {9, 5, 1, 3, 7};
        Arrays.sort(arreglo2);
        int[] arregloOrdenado = arreglo2;
        int objetivo = 7;
        System.out.println("Arreglo ordenado para búsqueda binaria: " + Arrays.toString(arregloOrdenado));
        int resultado = ejercicio.busquedaBinaria(arregloOrdenado, objetivo, 0, arregloOrdenado.length - 1);
        if(resultado != -1)
            {System.out.println("El número " + objetivo + " se encuentra en el índice: " + resultado);}
        else
            {System.out.println("El número no se encuentra en el arreglo.");}




    }
}
