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
        int [] arr= {1,5,6,4,7};
        
        //Impresion del arreglo antes de utilizar el metodo bublesort para demostrar que no esta ordenado
        System.out.println("Arreglo antes de ordenar:");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }
        
        // utilizaciion del metodo bublesort e impresion del arreglo para demostrar el nuevo orden del arreglo
        prueba.bubbleSort(arr);
        System.out.println("Arreglo despues de ordenar:");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
