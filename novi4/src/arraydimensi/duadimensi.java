/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydimensi;

/**
 *
 * @author WINDOWS 10
 */
public class duadimensi {
    public static void main(String[] args) {
        // Mendefinisikan matriks 2x3
        int[][] matrix = {
            {10, 20, 30},
            {30, 20, 10}
        };
        
        // Menampilkan matriks
        System.out.println("Matriks:");
        displayMatrix(matrix);
    }
    
    // Metode untuk menampilkan matriks
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
