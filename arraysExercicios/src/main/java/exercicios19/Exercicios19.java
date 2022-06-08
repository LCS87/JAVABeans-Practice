/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author leandro
 */
public
        class Exercicios19 {
              public static void print_all_Subarrays(int[] A)
	{
		
		List<Integer> llist = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++)
		{
			int sum = 0;
			llist.removeAll(llist);
			for (int j = i; j < A.length; j++)
			{
				sum += A[j];
				llist.add(A[j]); 
				if (sum == 0) {
					System.out.println("Sub-arrays Com Soma 0 : " + llist.toString()); 
				
				}
			}
		}
	}

	public static void main (String[] args)
	{
		int[] nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 };
		System.out.println("\nArray: "+Arrays.toString(nums1));
		print_all_Subarrays(nums1);
		
	              int[] nums2 = { 1, 2, -3, 4, 5, 6 };
		System.out.println("\nArray: "+Arrays.toString(nums2));
		print_all_Subarrays(nums2);
		
		int[] nums3= { 1, 2, -2, 3, 4, 5, 6 };
		System.out.println("\nArray: "+Arrays.toString(nums3));
		print_all_Subarrays(nums3);
	}
}
