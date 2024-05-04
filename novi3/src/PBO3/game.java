/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO3;

/**
 *
 * @author WINDOWS 10
 */
public class game {
     public static void main(String[] args){
         
         player king = new player();
         
         king.name = " NOVI";
         king.speed = 60;
         king.poin = 70;
        
         king.run();
         
         if (king.isDEAD());
         if (king.isWIN());
     }
}
