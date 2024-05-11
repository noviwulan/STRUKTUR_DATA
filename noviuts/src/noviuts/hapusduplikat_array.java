/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noviuts;

/**
 *
 * @author WINDOWS 10
 */
public class hapusduplikat_array {

  public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int n = array.length;
         System.out.println("Sebelum dihapus: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        // Hapus duplikat
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    n--;
                    for (int k = j; k < n; k++) {
                        array[k] = array[k + 1];
                    }
                    j--;
                }
            }
        }

        // Cetak array tanpa duplikat
        System.out.println(" ");
        System.out.println("Setelah dihapus: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
    }
