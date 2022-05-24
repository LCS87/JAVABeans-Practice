/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercios03;

/**
 *
 * @author leandro
 */
public
        class Exercicios03 {
           public static void main(String[] args) {   
 
       int[] num = new int[]{20, 30, 25, 35, -16, 60, -100};
       //calculate sum of all array elements
       int sum = 0;
       for(int i=0; i < num.length ; i++)
        sum = sum + num[i];
       //calculate average value
        double med = sum / num.length;
        System.out.println("A media dos Valores do array é : " + med); 
   } 
}