package org.omkar.programsPractice;

public class ClassAndObjects {

	public static void main(String[] args) {

		
		AddNumbersMethods a1=new AddNumbersMethods();
		@SuppressWarnings("static-access")
		int sum=a1.sum(25, 30);
		System.out.println(sum);
		System.out.println(AddNumbersMethods.sum(50, 50));
		
		
		
		
	}

}
