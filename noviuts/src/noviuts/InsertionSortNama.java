/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noviuts;

/**
 *
 * @author WINDOWS 10
 */
public class InsertionSortNama {
     public static void main(String[] args) {
        String[] nama = {"Budi", "Ali", "Cici", "Dedi", "Eka", "Fani", "Gita"};

        System.out.println("Array sebelum diurutkan (Insertion Sort):");
        for (String namaOrang : nama) {
            System.out.print(namaOrang + " ");
        }

        insertionSort(nama);

        System.out.println("\nArray setelah diurutkan (Insertion Sort):");
        for (String namaOrang : nama) {
            System.out.print(namaOrang + " ");
        }
    }

    private static void insertionSort(String[] nama) {
        for (int i = 1; i < nama.length; i++) {
            String key = nama[i];
            int j = i - 1;

            while (j >= 0 && nama[j].compareToIgnoreCase(key) > 0) {
                nama[j + 1] = nama[j];
                j--;
            }

            nama[j + 1] = key;
        }
    }
    
}
