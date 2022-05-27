/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios02;

/**
 *
 * @author leandro
 */
public
        class Exercicio02 {
               public static void main(String[] args) {      
                     int rr_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                     int sum = 0;

                     for (int i : rr_array)
                     sum += i;
                     System.out.println("A Soma é " + sum);
}
}
