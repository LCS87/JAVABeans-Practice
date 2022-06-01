
package exercicios15;

import java.util.Arrays;

/**
 *
 * @author leandro
 */
public
        class Exercicios15 {
              public static void main(String[] args)
 {
    int[] array_nums = {5, 7, 2, 4, 9};
	System.out.println("Array Original: "+Arrays.toString(array_nums)); 
	int ctr = 0;
	for(int i = 0; i < array_nums.length; i++)
	{
		if(array_nums[i] % 2 == 0)
			ctr++;
	}
	System.out.println("Numeros pares : "+ctr);
	System.out.println("Numeros Impares : "+(array_nums.length-ctr));
 }
} 
