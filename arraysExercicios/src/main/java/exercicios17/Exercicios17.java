/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17;

import java.util.Arrays;

/**
 *
 * @author leandro
 */
public
        class Exercicios17 {
              public static void main(String[] args)
 {
    int[] array_nums = {5, 7, 2, 4, 9};
	System.out.println("Array Original: "+Arrays.toString(array_nums)); 
	int max = array_nums[0];
	int min = array_nums[0];
	float sum = array_nums[0];
	for(int i = 1; i < array_nums.length; i++)
	{
		sum  += array_nums[i];
		if(array_nums[i] > max)
			max = array_nums[i];
		else if(array_nums[i] < min)
			min = array_nums[i];
	}
	float x = ((sum-max-min) / (array_nums.length - 2));
	System.out.printf("Calcule os valores, exceto o menor e maior valor: %.2f",x);
	System.out.print("\n");	
  }
}
