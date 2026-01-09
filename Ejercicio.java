/*
PROYECTO: Ejercicios Recursivos
NOMBRE: Diego Valencia Figueroa
FECHA: 7 de enero del 2026
DESCRIPCIÓN: Solucionar ejercicios mediante la recursividad.
 */
import java.util.ArrayList;
class Ejercicio{

    public Ejercicio(){}

    //Ejercicio 1: Sumar los números de un arreglo (int[]).
    public int sumarArreglo(int[] arreglo, int indice){
        if (indice == arreglo.length)//Caso base cuando se llega al final del arreglo
            {return 0;}//Al final de la pila, retorna 0
        else
            {return arreglo[indice] + sumarArreglo(arreglo, indice + 1);}
    }

    //Ejercicio 2: Sumar elementos de una lista (ArrayList).
    public int sumarLista(ArrayList<Integer> lista, int indice){
        if (indice == lista.size())//Caso base cuando se llega al final de la lista
            {return 0;}
        else
            {return lista.get(indice) + sumarLista(lista, indice + 1);}
    }//El arraylist usa get() para obtener el elemento en la posición indice

    //Ejercicio 3: Impresión de datos de un arreglo (respetar orden).
    public void imprimirArreglo(int[] arreglo, int indice){
        if(indice<arreglo.length){//Condición base para detener la recursión
            if(indice==0){//Primer elemento del arreglo
                System.out.print("["+arreglo[indice]+", ");
                imprimirArreglo(arreglo, indice+1);
            }else if(indice>0 && indice<arreglo.length-1){
                System.out.print(arreglo[indice]+", ");
                imprimirArreglo(arreglo, indice + 1);
            }else{//Último elemento del arreglo
                System.out.print(arreglo[indice]+"]");
                imprimirArreglo(arreglo, indice + 1);
            }
        }
    }

    //Ejercicio 4: Elevar a potencia un número.
    public int elevarPotencia(int base, int exponente){
        if (exponente == 0)//Caso base, el exponente 0 siempre da 1
            {return 1;}
        else
            {return base * elevarPotencia(base, exponente - 1);}//Ejemplo: 2^3 = 2 * 2^2
    }

    //Ejercicio 5: Convertir a decimal a binario.
    public void decimalABinario(int n){
        if (n < 2)//Caso base, el número es 0 o 1
            {System.out.print(n);}
        else{
            decimalABinario(n / 2);//Divide el número entre 2 recursivamente
            System.out.print(n % 2);//Imprime el residuo (0 o 1)
        }
    }

    //Ejercicio 6: Maximo común divisor (MCD) de dos números.
    public int maximoComunDivisor(int a, int b){
        if (b == 0)//El mcd de cualquier número (a) y 0 es a.
            {return a;}
        else//Principio de Euclides: El MCD de dos números es el mismo que el MCD del Divisor y el Resto.
            {return maximoComunDivisor(b, a % b);}
    }

    //Ejercicio 7: Función Ackermann.
    public int ackermann(int m, int n){
        if(m == 0)//Caso base
            {return n + 1;}
        else if(m > 0 && n == 0)
            {return ackermann(m-1, 1);}
        else if(m>0 && n>0)
            {return ackermann(m-1, ackermann(m, n-1));}
        else
            {return 1;}
    }

    //Ejercicio 8: Números de Catalán.
    public long numeroCatalan(int n){
        if(n==0)//Caso base
            {return 1;}
        else{
            long nom = factorial(2*n);
            long denom = factorial(n+1) * factorial(n);
            return nom / denom;
        }
    }

    //Función auxiliar para calcular factorial.
    private long factorial(int n){
        if(n<=1)//Caso base del factorial
            {return 1;}
        else
            {return n * factorial(n - 1);}
    }

    //Ejercicio 9: Busqueda binaria.
    public int busquedaBinaria(int[] arreglo, int objetivo, int inicio, int fin){
        if(inicio > fin)
            {return -1;}
        else{
            int medio = inicio + (fin - inicio) / 2;//El fin-inicio es para la cant. de elementos entre inicio y fin
            if (arreglo[medio] == objetivo){
                return medio;
            }
            else if(arreglo[medio] > objetivo)//Si el objetivo es menor, buscar en la mitad izquierda
                {return busquedaBinaria(arreglo, objetivo, inicio, medio - 1);}
            else//Si el objetivo es mayor, buscar en la mitad derecha
                {return busquedaBinaria(arreglo, objetivo, medio + 1, fin);}
        }
    }
}

