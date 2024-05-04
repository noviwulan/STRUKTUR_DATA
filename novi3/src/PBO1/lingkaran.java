/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO1;

/**
 *
 * @author WINDOWS 10
 */
public class lingkaran {
    public static void main(String[] args){
       
//membuat objek luas lngkaran dari class rumus       
       rumus L = new rumus();
       
       L.phi = 3.14;
       L.jari2 = 10;
       
       L.luas = L.phi * (L.jari2 * L.jari2);
       
       
       System.out.println("phi lingkaran    =  " + L.phi);
        System.out.println("jari - jari lingkaran   =  " + L.jari2);
         System.out.println("Luas lingkaran    =  " + L.luas);
       
       
    }  
}
