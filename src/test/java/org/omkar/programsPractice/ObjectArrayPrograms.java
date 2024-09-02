package org.omkar.programsPractice;

public class ObjectArrayPrograms {

	public static void main(String[] args) {

		// Object is a type of class from which we can create any type of dynamic values in an array.
		// e.g. String, integer, boolean, double, float
		
		
		Object a[]=new Object[3];
		a[0]="Tester";
		a[1]=true;
		a[2]=266.25;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
