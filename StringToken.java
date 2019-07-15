package lab8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// take input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		String n=sc.next();
		//invoke class StringTokenizer
		StringTokenizer s=new StringTokenizer(n,"+");
		int sum=0;
		//sum of integers
		while(s.hasMoreTokens())
		{
			int k=0;
			k=Integer.parseInt(s.nextToken());
			System.out.println("number"+k);
			sum=sum+k;
		}
		System.out.println("Sum of numbers: "+sum);
		}
}
