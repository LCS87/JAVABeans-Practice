/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

import java.util.Arrays;

/**
 *
 * @author leandro
 */
public
        class Exercios01 {
              public static void main(String[] args){   
    
    int[] rr_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
            
    String[] rr_array2 = {
            "Java",
			
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };        
    System.out.println("Seguencia Original : "+Arrays.toString(rr_array1));
    Arrays.sort(rr_array1);
    System.out.println("Seguencia Aleatoria: "+Arrays.toString(rr_array1));
    
    System.out.println("Seguencia Original: "+Arrays.toString(rr_array2));
    Arrays.sort(rr_array2);
    System.out.println("Seguencia Aleatoria: "+Arrays.toString(rr_array2));
    }
}
