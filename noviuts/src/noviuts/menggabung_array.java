/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noviuts;

/**
 *
 * @author WINDOWS 10
 */
public class menggabung_array {
        public static void main(String[] args) {
        // Deklarasi array pertama
        int[] arr1 = {1, 2, 3, 4, 5};
        
        System.out.println("array pertama: ");
        for (int i : arr1) 
           { System.out.print(i + " ");}

        // Deklarasi array kedua
        int[] arr2 = {6, 7, 8, 9, 10};
        System.out.println(" ");
        System.out.println("array kedua: ");
        for (int i : arr2) 
           { System.out.print(i + " ");}

        // Menentukan rumus array gabungan
        int length = arr1.length + arr2.length;

        // Deklarasi array gabungan
        int[] arrGabungan = new int[length];

        // Menyalin elemen array pertama ke array gabungan
        for (int i = 0; i < arr1.length; i++) {
            arrGabungan[i] = arr1[i];
        }

        // Menyalin elemen array kedua ke array gabungan, dimulai dari indeks terakhir array pertama
        for (int i = 0; i < arr2.length; i++) {
            arrGabungan[arr1.length + i] = arr2[i];
        }

        // Menampilkan array gabungan
        System.out.println(" ");
        System.out.println("Array gabungan: ");
        for (int i : arrGabungan) {
            System.out.print(i + " ");
        }
}
    
}
