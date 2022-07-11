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
public class Ex008 {
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++) {

            System.out.println("Entre com o valor do vetor A: " + i);
            vetorA[i] = scan.nextInt();
            
        }
        
        for (int i = 0; i < vetorB.length; i++) {

            System.out.println("entre com valor do vetor B: " + i);
            vetorB[i] = scan.nextInt();
            
        }
        
        for (int i = 0; i < vetorC.length; i++) {

            System.out.println("vetor C: " + i);
            vetorC[i] = vetorA[i] / vetorB[i];
            
        }
        System.out.print("Vetor A = ");
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor B = ");
        
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }
        System.out.println();
    }
}

