/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayvetores;

import java.util.Scanner;

/**
 *
 * @author leandro
 */
public class Ex010 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++){
        
         System.out.println("Entre com o valor da posição: " + 1);
         vetorA[i] = scan.nextInt();
         
         vetorB[i] = vetorA[i];
     }
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
           System.out.print(vetorA[i] + " ");
        }
      System.out.println();
      
      System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
           System.out.print(vetorB[i] + " ");
    }
      System.out.println();
 }
}