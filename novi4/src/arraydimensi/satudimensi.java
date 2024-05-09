/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydimensi;

/**
 *
 * @author WINDOWS 10
 */
public class satudimensi {
    
    public static void main(String[] args) {
    //DEKLARASI DAN INISIALISASI ARRAY
        int [] angka = {10, 20, 30, 40, 50} ;
        
    //MENAMPILKAN VALUE ARRAY ANGKA
        for (int j = angka [0]; j< angka.length; j++)
        {System.out.println (angka [j] + "  ");
        
    //VARIABEL 
        int max = angka[0];
        int min = angka[0];
        int sum = 0;
        double rata2= (double)sum / angka.length;
    //MEMBUAT PERBANDINGAN NILAI MENGGUNAKAN FOR
        for (int i = 0; i < angka.length; i++) 
        {
          //MENCARI NILAI TERTINGGI  
            if (angka[i] > max) 
                {max = angka[i];}
            
          //MENCARI NILAI TERENDAH
            if (angka[i] < min) 
                {min =angka[i];}
          
          //MENGIdouble rata2TUNG NILAI RATA-RATA
            sum += angka[i];   
        }

    //MENAMPILKAN NILAI ARRAY ,TERENDAH,TERTINGGGI, RATA - RATA
    System.out.println("NILAI SELURUH ANGKA : " + angka[j]);
    System.out.println("NILAI TERENDAH ANGKA : " + min);
    System.out.println("NILAI TERTINGGI ANGKA : " + max);
    System.out.println("NILAI RATA - RATA ANGKA : " + rata2);
      
 
}     
}
}
