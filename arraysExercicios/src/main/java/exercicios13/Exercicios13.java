/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios13;

import java.util.ArrayList;
import java.util.*;

/**
 *Localizar os elementos comuns no arrays
 * @author leandro
 */
public
        class Exercicios13 {
              public static void main(String[] args) {
	ArrayList<Integer> comun = new ArrayList<Integer>();
   int array1[] = {2, 4, 8};
   int array2[] = {2, 3, 4, 8, 10, 16};
   int array3[] = {4, 8, 14, 40};
	int x = 0, y = 0, z = 0;
	while (x < array1.length && y < array2.length && z < array3.length){
		if (array1[x] == array2[y] && array2[y] == array3[z]){
			comun.add(array1[x]);
			x++;
			y++;
			z++;
		}
		else if (array1[x] < array2[y])
			x++;
		else if (array2[y] < array3[z])
			y++;
		else
			z++;
	}
	System.out.println("Elementos Comuns nos Três Arrays : ");
System.out.println(comun);
 
    }
}
