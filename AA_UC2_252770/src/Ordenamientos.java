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
     * Metodo que simula el acomodo por seleccion del elemento minimo
     *
     * @param arr arreglo de enteros
     */
    public void selectionSort(int[] arr) { // o(n^2)
        // se asigna  una variable temporal el valor del largo del arreglo
        int n = arr.length; //n

        for (int i = 0; i < n - 2; i++) { //1 n+1-1 n
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

    public void insertionSort(int[] arr) {
        int n = arr.length; // 1 operación (asignación)
        for (int i = 1; i < n; i++) { // n-1 iteraciones
            int clave = arr[i]; // n-1 operaciones (asignación)
            int j = i - 1; // n-1 operaciones (asignación)

            while (j >= 0 && arr[j] > clave) { // En el peor caso: sum_{i=1}^{n-1} i = n(n-1)/2 comparaciones
                arr[j + 1] = arr[j]; // En el peor caso: sum_{i=1}^{n-1} i = n(n-1)/2 asignaciones
                j--; // En el peor caso: sum_{i=1}^{n-1} i = n(n-1)/2 decrementos
            }
            arr[j + 1] = clave; // n-1 operaciones (asignación)
        }
    }

    public void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) { // 1 comparación por llamada (O(log n) veces en promedio)
            int indicePivote = particion(arr, inicio, fin); // O(n) por llamada
            quickSort(arr, inicio, indicePivote - 1); // Llamada recursiva (mitad izquierda)
            quickSort(arr, indicePivote + 1, fin); // Llamada recursiva (mitad derecha)
        }
    }

    public int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin]; // 1 asignación + 1 acceso
        int i = inicio - 1; // 1 asignación

        for (int j = inicio; j < fin; j++) { // n-1 iteraciones (donde n = fin - inicio + 1)
            if (arr[j] < pivote) { // n-1 comparaciones
                i++; // O(n) incrementos (peor caso: n-1)
                intercambiar(arr, i, j); // O(n) intercambios (peor caso: n-1)
            }
        }
        intercambiar(arr, i + 1, fin); // 1 intercambio
        return i + 1; // 1 retorno
    }

    public static void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i]; // 1 asignación + 1 acceso
        arr[i] = arr[j]; // 1 asignación + 1 acceso
        arr[j] = temp; // 1 asignación
    }

    public static void mergeSort(int[] arr, int izquierda, int derecha) {
        // Caso base

        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;

            // Llamada recursiva del lado izquierdo
            mergeSort(arr, izquierda, medio);

            // Lamada recursiva del lado derecho;
            mergeSort(arr, medio + 1, derecha);

            merge(arr, izquierda, medio, derecha);
        }
    }

    public static void merge(int[] arr, int izquierda, int medio, int derecha) {

        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        // Arreglos temporales
        int[] izquierdaArr = new int[n1];
        int[] derechaArr = new int[n2];

        // Copiar los datos al arreglo izquierdo
        for (int i = 0; i < n1; i++) {
            izquierdaArr[i] = arr[izquierda + i];
        }

        // COpiar los datos al lado derecho
        for (int j = 0; j < n2; j++) {
            derechaArr[j] = arr[medio + 1 + j];
        }

        int i = 0; //n
        int j = 0; //n
        int k = izquierda; //n

        // Mezclar los arreglos temporales con arreglo
        while (i < n1 && j < n2) {
            if (izquierdaArr[i] <= derechaArr[j]) { // Esto hace que MergeSort sea un algoritmo estable
                arr[k] = izquierdaArr[i]; //n
                i++; //n
            } else {
                arr[k] = derechaArr[j]; //n
                j++; //n
            }
            k++; //n
        }

        // Agrega cualquier elemento sobrante de la parte izquierda
        while (i < n1) {
            arr[k] = izquierdaArr[i]; //n
            i++;                    //n
            k++;            //n
        }

        // Agrega cualquier elemento sobrante de la parte derecha
        while (j < n2) {
            arr[k] = derechaArr[j]; //n
            j++; //n
            k++; //n
        }

    }

}
