package lab8;

import java.util.Scanner;

public class PositiveString {
	static int flag=0;
	
	public void checkString(String str) {
		int n=str.length()-1;
		start:for(int i=0;i<n;i++) {
			if(str.charAt(i+1)<str.charAt(i))
			{
				flag=1;
				break start;
			}
		}
		if(flag==0)
		{
			System.out.println("Positive String");
		}
		else {
			System.out.println("Not a positive string");
		}
	}

	public static void main(String[] args) {
		try {
			PositiveString ps=new PositiveString();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string:");
			String sr=sc.nextLine();
			ps.checkString(sr);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
