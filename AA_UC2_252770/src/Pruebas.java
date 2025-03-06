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
        
        Ordenamientos prueba = new Ordenamientos();
        int [] arr= {1,5,6,4,7};
        
        
        System.out.println("Arreglo antes de ordenar:");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }
        prueba.bubbleSort(arr);
        System.out.println("Arreglo despues de ordenar:");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
