package lab8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Date {
	int d,m,y;
	Scanner sc=new Scanner(System.in);
	public void getDate() {
		System.out.println("Enter Date(dd):");
		d=sc.nextInt();
		System.out.println("Enter Month(mm):");
		m=sc.nextInt();
		System.out.println("Enter Year(yy):");
		y=sc.nextInt();
	}

	public static void main(String[] args) {
		try {
			Date d=new Date();
			d.getDate();
			LocalDate ld=LocalDate.of(d.y, d.m, d.d);
			LocalDate today=LocalDate.now();
			System.out.println("Given Date:"+ld);
			System.out.println("Current System Date:"+today);
			Period gap=Period.between(ld, today);
			System.out.println("Duration: "+gap.getYears()+" Years "+gap.getMonths()+" Months "+gap.getDays()+" Days.");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		

	}

}
