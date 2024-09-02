package org.omkar.programsPractice;

public class ContinueExample {

	public static void main(String[] args) {

		
		for(int i=0;i<=10;i++)
		{
			
			if(i==7)
			{
				continue;
			}
			System.out.println(i);
		}
		
		//continue statement will skip the current iteration and proceeds with next
	}

}
