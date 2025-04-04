/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author adell
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //se crea una instancia para probar el metodo bublesort y un arreglo desordenado de tamaño 5
        Ordenamientos prueba = new Ordenamientos();
        int[] arr = {1, 5, 6, 4, 7};
        int[] arr2 = {5, 3, 8, 1, 2};
        //System.out.println("Se utiliza un arreglo de tipo entero de 5 espacios para las pruebas donde arr = {1,5,6,4,7} ");
        //Impresion del arreglo antes de utilizar el metodo bublesort para demostrar que no esta ordenado
        //System.out.println("Arreglo antes de ordenar:");
        //for (int i = 0; i < arr.length; i++) {
        //    System.out.println(arr[i]);
        //}
        //System.out.println("movimientos de indices del metodo bubblesort");
        // utilizaciion del metodo bublesort e impresion del arreglo para demostrar el nuevo orden del arreglo
        //prueba.bubbleSort(arr);

        prueba.mergeSort(arr2,0,4);
        //System.out.println("Arreglo despues de ordenar:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }

}
