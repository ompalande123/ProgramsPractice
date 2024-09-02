package org.omkar.programsPractice;

public class AddNumbersMethods {

	public static int sum(int x, int y)
	{
		return x+y;
	}
	
	
	static int sum2(int x, int y)
	{
		int z=x+y;
		return z;
	}
	
	public static void main(String[] args) {

		int a=5,b=7,c=0;
		
		c=sum(a,b);
		System.out.println("Sum from sum1 method is : "+c);
		
		
		c=sum2(12,15);
		System.out.println("Sum from sum2 method is : "+c);
		
	}

}
