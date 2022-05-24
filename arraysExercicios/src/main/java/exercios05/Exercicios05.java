/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercios05;

/**
 *
 * @author leandro
 */
public
        class Exercicios05 {
              public static int  findIndex (int[] rr_array, int t) {
        if (rr_array == null) return -1;
        int len = rr_array.length;
        int i = 0;
        while (i < len) {
            if (rr_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] rr_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
      System.out.println("A posição 25 do Index é: " + findIndex(rr_array, 25));
      System.out.println("A posição 77 do Index é: " + findIndex(rr_array, 77));
       }
}
