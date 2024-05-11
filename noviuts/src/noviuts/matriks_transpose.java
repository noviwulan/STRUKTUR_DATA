/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noviuts;

/**
 *
 * @author WINDOWS 10
 */
public class matriks_transpose {
     public static void main(String[] args) {
        // Deklarasi dan inisialisasi matriks
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Transpose matriks
        int[][] matriksTranspos = new int[matriks[0].length][matriks.length];
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                matriksTranspos[j][i] = matriks[i][j];
            }
        }

        // Cetak matriks asli
        System.out.println("Matriks asli:");
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }

        // Cetak matriks transpos
        System.out.println("\nMatriks transpos:");
        for (int[] baris : matriksTranspos) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }
    
}
