package lab8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JobSeekers {
	public static boolean checkUname(String str) {
		Pattern p=Pattern.compile("[a-zA-Z]{8,}_job");
		Matcher m=p.matcher(str);
		
		return m.matches();
		
	}
	public static void main(String[] args) {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String str=sc.next();
		if(checkUname(str))
		{
			str=str.substring(0,str.indexOf("_"));
			System.out.println("Username is valid");
		}
		else {
			System.out.println("Username is invalid");
		}
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	}
}
