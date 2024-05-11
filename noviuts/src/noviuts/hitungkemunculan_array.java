/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noviuts;

/**
 *
 * @author WINDOWS 10
 */
import java.util.HashMap;
import java.util.Map;

public class hitungkemunculan_array {
     public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 1}; // Array input
        
         System.out.println("Array input: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        // Deklarasi HashMap untuk menyimpan kemunculan elemen
        Map<Integer, Integer> kemunculan = new HashMap<>();

        // Menghitung kemunculan setiap elemen
        for (int i : arr) {
            if (kemunculan.containsKey(i)) {
                kemunculan.put(i, kemunculan.get(i) + 1);
            } else {
                kemunculan.put(i, 1);
            }
        }

        // Menampilkan hasil
        System.out.println("   ");
        for (Map.Entry<Integer, Integer> entry : kemunculan.entrySet()) {
            System.out.println("Elemen: " + entry.getKey() + ", Kemunculan: " + entry.getValue());
        }
    }
    
}
