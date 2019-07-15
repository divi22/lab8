package lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class DisplayFile {

	public static void main(String[] args) {
		BufferedReader bfr=null;
		String str="";
		try {
			bfr=new BufferedReader(new FileReader("C:\\Users\\divyshet\\TextFiles\\Input.txt"));
			while((str=bfr.readLine())!= null) {
				System.out.println(str);
				
			}
			bfr.close();
		}catch(FileNotFoundException fe) {
			System.out.println("File not found");
		}
		catch(IOException ie) {
			System.out.println("Unable to read file");
		}
		
		
		

	}

}
