package org.omkar.programsPractice;

import java.util.ArrayList;

public class DynamicArrayPrograms {

	public static void main(String[] args) {

		// ArrayList is one of collection class which we can use to create dynamic array of any type.
		
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(25);
		arr1.add(1, 2);
		arr1.add(2, 23);
		arr1.add(30);
		System.out.println(arr1);
		
		arr1.remove(1); //removes 2
		System.out.println("Array after removal : "+arr1);
		
		//Accessing specific element
		System.out.println(arr1.get(2));  // this will get 30
		
		//To check the size
		System.out.println("Size of an array is : "+arr1.size());
		
		
		
		
		
		// String ArrayList
		ArrayList<String> arrayStr=new ArrayList<>();
		arrayStr.add("Tester");
		arrayStr.add("Developer");
		arrayStr.add("BA");
		
		System.out.println(arrayStr);
		
		
	}

}
