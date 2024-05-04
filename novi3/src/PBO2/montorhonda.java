/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO2;

/**
 *
 * @author WINDOWS 10
 */
public class montorhonda {
     public static void main(String[] args){
         montor beat = new montor();
         
         beat.namapemilik = "NOVI WULANDARI";
         beat.merkmontor = "honda";
         beat.warnamontor = "hitam";
         beat.tahunbuat = 2018;
         beat.nomorrangka = 123.456 ;
         
         System.out.println ("Nama pemilik montor = " +beat.namapemilik);
         System.out.println ("Merk montor = " +beat.merkmontor);
         System.out.println ("Warna montor = " +beat.warnamontor);
         System.out.println ("Tahun pembuatan montor = " +beat.tahunbuat);
         System.out.println ("Nomor rangka montor = " +beat.nomorrangka);
         
         beat.montorhidup();
         beat.montormati();
     }
}
