package lab8;

import java.io.File;
import java.util.Scanner;


public class ReadFile {
	public static String check(boolean n) {
		String d="";
		if(n==true) {
			d="YES";
			return d;
		}
		else {
			d="NO";
			return d;
			}
	}
	public static String getFileExtension(File file) {
		String fileName=file.getName();
		return fileName.substring(fileName.lastIndexOf(".")+1);
	}                                          
	

	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter file name");
			String str=sc.next();
			File f=new File(str);
		
		System.out.println("File exits:"+check(f.exists()));
		System.out.println("File is readable:"+check(f.canRead()));
		System.out.println(" File is writable:"+check(f.canWrite()));
		System.out.println("Type of file:"+getFileExtension(f));
		System.out.println("Length of file:"+f.length());
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
