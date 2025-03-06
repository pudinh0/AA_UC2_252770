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
                }

            }
        }
    }
}
