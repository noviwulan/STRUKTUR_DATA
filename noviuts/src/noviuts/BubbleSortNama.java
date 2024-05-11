/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noviuts;

/**
 *
 * @author WINDOWS 10
 */
public class BubbleSortNama {
    public static void main(String[] args) {
        String[] nama = {"Budi", "Ali", "Cici", "Dedi", "Eka", "Fani", "Gita"};

        System.out.println("Array sebelum diurutkan (Bubble Sort):");
        for (String namaOrang : nama) {
            System.out.print(namaOrang + " ");
        }

        bubbleSort(nama);

        System.out.println("\nArray setelah diurutkan (Bubble Sort):");
        for (String namaOrang : nama) {
            System.out.print(namaOrang + " ");
        }
    }

    private static void bubbleSort(String[] nama) {
        for (int i = 0; i < nama.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < nama.length - i - 1; j++) {
                if (nama[j].compareToIgnoreCase(nama[j + 1]) > 0) {
                    String temp = nama[j];
                    nama[j] = nama[j + 1];
                    nama[j + 1] = temp;
                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }
        }
    }
}
