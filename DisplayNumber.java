package lab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DisplayNumber {

	public static void main(String[] args) {
		try {
			int lines=0,chars=0,words=0;
			int code=0;
			FileInputStream fs=new FileInputStream("C:\\\\Users\\\\divyshet\\\\TextFiles\\\\Input1.txt");
			while(fs.available()!=0)
			{
				code=fs.read();
				if(code!=10)
					chars++;
				if(code==32)
					words++;
				if(code==13)
				{
					lines++;
					words++;
				}
			}
			System.out.println("No of characters:"+chars);
			System.out.println("No of words:"+(words+1));
			System.out.println("No of lines:"+(lines+1));
			fs.close();
		}
		catch(FileNotFoundException fe) {
			System.out.println("File not found");
		}
		catch(IOException ie) {
			System.out.println("Unable to read file");
		}
		
	}

}
