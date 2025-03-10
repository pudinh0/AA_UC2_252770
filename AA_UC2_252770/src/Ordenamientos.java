/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adell
 */
public class Ordenamientos {

    /**
     * Metodo que simula el acomodo por parejas de los elementos de un arreglo
     *
     * @param arr arreglo de tipo entero
     */
    public void bubbleSort(int[] arr) {  //o(n^2)

        // bucle que itera sobre el arreglo
        for (int i = 0; i < arr.length - 1; i++) {  // 1 + n-1 +  n

            //bucle interno que se encarga de comparar los elementos
            for (int j = 0; j < arr.length - 1 - i; j++) { //1 + n-1 - n + n

                //Comparacion del elemento actual si es mayor al siguiente, intercambio de posiciones de elementos
                if (arr[j] > arr[j + 1]) { //n
                    // asignacion del elementos actual a una varible temporal o auxiliar
                    int temp = arr[j]; //n

                    //asignacion del indice actual al elemento del siguiente indice
                    arr[j] = arr[j + 1]; //n

                    //asignacion del elemento guardado en la variable temporal al siguiente indice
                    arr[j + 1] = temp; //n

                    System.out.println("iteracion:" + j + "elemento:" + arr[j]);
                }

            }
        }
    }
    
    /**
     * Metodo que simula el acomodo por seleccion
     * @param arr arreglo de enteros
     */
    public void selectionSort(int[] arr) { // o(n^2)
        // se asigna  una variable temporal el valor del largo del arreglo
        int n = arr.length; //n

        for (int i = 0; i < n - 1; i++) { //1 n+1-1 n
            //se asigna el valor de una variable temporal para guardar el indice de iteracion o comparacion
            int minimo = i; //n
            
            // comparacion continua de los elementos
            for (int j = i + 1; j < n; j++) { // n +1  n n
               //hace una comparacion del numero en la posicion j al minimo, donde el minimo siempre sera una posicion menor a j al principio
               //y j crecera hasta llegar al ultimo elemento a comparar 
                if (arr[j] < arr[minimo]) { //n
                    //se asigna el indice del numero menor
                    minimo = j; //n
                }
            }
            
            //parte del codigo que hace el intercambio de los elementos que contienen los indices
            int temp = arr[minimo]; //n
            arr[minimo] = arr[i]; //n 
            arr[i] = temp; // n
        }
    }
}
