/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noviuts;

/**
 *
 * @author WINDOWS 10
 */
public class membalikkan_array {
    public static void main(String[] args) {
    // Deklarasi array 
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Sebelum dibalik: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
    // Membalikkan array
        System.out.println(" ");
        System.out.println("Sesudah dibalik: ");
        for (int i = arr.length - 1; i >= 0; i--) {
        System.out.print(arr[i] + " ");
        }
    }
    
}
