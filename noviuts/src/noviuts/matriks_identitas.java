/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noviuts;

/**
 *
 * @author WINDOWS 10
 */
public class matriks_identitas {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi matriks
        int[][] matriks = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        
        System.out.println("Matriks input:");
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }

        // Periksa apakah matriks adalah matriks identitas
        boolean isIdentitas = true;
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                if (i == j) {
                    if (matriks[i][j] != 1) {
                        isIdentitas = false;
                        break;
                    }
                } else {
                    if (matriks[i][j] != 0) {
                        isIdentitas = false;
                        break;
                    }
                }
            }
            if (!isIdentitas) {
                break;
            }
        }

        // Cetak hasil
        if (isIdentitas) {
            System.out.println("Matriks adalah matriks identitas");
        } else {
            System.out.println("Matriks bukan matriks identitas");
        }
    }
    
}
