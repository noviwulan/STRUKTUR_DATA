/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package novi4;

/**
 *
 * @author WINDOWS 10
 */
public class Novi4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        
    //DEKLARASI DAN NISIALISASI ARRAY
    int [] angka = {10, 20, 30, 40, 50} ;
    
    //MENAMPILKAN VALUE ARRAY ANGKA
    for (int j = angka [0]; j < angka.length; j++)
        {System.out.println (angka [j] + "  ");
    
    //MENCARI NILAI TERENDAH
    int min = angka [0];
    for (int i = angka [0] ; i < angka.length; i++ ) 
        {if (angka[i] < min)
            {min = angka [i] ;}  
        }
    
    
    //MENCARI NILAI TERTINGGI
    int max = angka [0];
    for (int i = angka [0] ; i < angka.length; i++ ) 
        {if (angka[i] > max)
            {max = angka [i] ;}  
        }
    
    //MENGITUNG NILAI RATA-RATA
    int sum = angka [0];
    for (int i =angka [0]; i < angka.length ; i++)
        {sum += angka[i];}
        double rata2 = (double) sum / angka.length;
     
     //MENAMPILKAN NILAI SELURUH ARRAY ,NILAI TERENDAH, NILAI TERTINGGGI, NILAI RATA - RATA
    System.out.println("NILAI SELURUH ANGKA : " + angka[j]);
    System.out.println("NILAI TERENDAH ANGKA : " + min);
    System.out.println("NILAI TERTINGGI ANGKA : " + max);
    System.out.println("NILAI RATA - RATA ANGKA : " + rata2);
    
     
     
    }
    } 
}
    

