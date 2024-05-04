/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO3;

/**
 *
 * @author WINDOWS 10
 */
public class player {
    String name;
    int speed;
    int poin;
    
void run ()
{
System.out.println (name + "is running ----");
System.out.println ("speed : " + speed);
System.out.println ("poin : " + poin);
}


boolean isDEAD ()
{
if (poin <= 0)  
{System.out.println("GAME OVER!");}
return true;
}

boolean isWIN ()
{
if (poin >= 60)
{System.out.println("HOREEE WIN !");}
return false;
}
}
