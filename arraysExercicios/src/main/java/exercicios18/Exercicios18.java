/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author leandro
 */
public
        class Exercicios18 {
              public static void find_max_product(int[] nums)
	{
		int max_pair_product = Integer.MIN_VALUE;
		int max_i = -1, max_j = -1;

		for (int i = 0; i < nums.length - 1; i++)
		{
			for (int j = i + 1; j < nums.length; j++)
			{
				if (max_pair_product < nums[i] * nums[j])
				{
					max_pair_product = nums[i] * nums[j];
					max_i = i;
					max_j = j;
				}
			}
		}

		System.out.print("Par é (" + nums[max_i] + ", " + nums[max_j] + "), Multiplicação : " + (nums[max_i]*nums[max_j]));
	}

	public static void main (String[] args)
	{
		int[] nums = { 2, 3, 5, 7, -7, 5, 8, -5 };
		System.out.println("\nArray Original: "+Arrays.toString(nums));
		find_max_product(nums);
	}
       
}