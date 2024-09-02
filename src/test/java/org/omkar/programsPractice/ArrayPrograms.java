package org.omkar.programsPractice;

import java.util.Arrays;

public class ArrayPrograms {

	public static void main(String[] args) {

		
		
		int array1[]=new int[5];
		
		array1[0]=5;
		array1[1]=23;
		array1[2]=66;
		array1[3]=0;
		array1[4]=-30;
		
		//Print array elements using for loop
		for(int i=0;i<array1.length;i++)
		{
			System.out.println("Element at position "+i+" is : "+array1[i]);
		}
		
		// Sort array elements
		Arrays.sort(array1);
		System.out.println("Sorted array is : ");
		for(int i=0;i<array1.length;i++)
		{
			System.out.println("Element sorted at position "+i+" is : "+array1[i]);
		}
		
		
		
		
	}

}
