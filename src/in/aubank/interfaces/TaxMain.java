package in.aubank.interfaces;

import java.util.Scanner;

public class TaxMain {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
		
		
		TaxReport taxReport = new TaxReport(1000,2023);
		taxReport.show();
		
	}
}
