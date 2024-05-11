/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noviuts;

/**
 *
 * @author WINDOWS 10
 */
public class SelectionSortNama {
    public static void main(String[] args) {
        String[] nama = {"Budi", "Ali", "Cici", "Dedi", "Eka", "Fani", "Gita"};

        System.out.println("Array sebelum diurutkan (Selection Sort):");
        for (String namaOrang : nama) {
            System.out.print(namaOrang + " ");
        }

        selectionSort(nama);

        System.out.println("\nArray setelah diurutkan (Selection Sort):");
        for (String namaOrang : nama) {
            System.out.print(namaOrang + " ");
        }
    }

    private static void selectionSort(String[] nama) {
        for (int i = 0; i < nama.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nama.length; j++) {
                if (nama[j].compareToIgnoreCase(nama[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = nama[i];
            nama[i] = nama[minIndex];
            nama[minIndex] = temp;
        }
    }
    
}
