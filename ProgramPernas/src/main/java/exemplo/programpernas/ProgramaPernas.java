/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo.programpernas;

import java.util.Scanner;

/**
 *
 * @author leandro
 */
public
        class ProgramaPernas {
    public static void main(String[] args){
        
    
    Scanner tec = new Scanner(System.in);
    System.out.print("Quanta Pernas?");
    int perna = tec.nextInt();
    String tipo = null;
    System.out.print("Isso é um(a) ");
    switch (perna){
        case 1:
            tipo = "Saci";
            break;
        case 2:
            tipo = "Bipede";
            break;
        case 3:
            tipo = "Tripé";
            break;
        case 4:
            tipo = "Quadrupede";
            break;
        case 5:
            tipo = "Aranha";
            break;
        case 6:
            tipo = "ET";
            break;
            
        }
    System.out.println(tipo); 
   } 
    
}