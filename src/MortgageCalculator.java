import java.util.Scanner;

public class MortgageCalculator {
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input loan amount (₹1000 - ₹1000000): ");
		long principalAmount = sc.nextLong();
		
		while(principalAmount > 1000000 || principalAmount < 1000) {
			System.err.print("Input valid loan amount (₹1000 - ₹1000000): ");
			principalAmount = sc.nextLong();
		}
		
		System.out.print("Input annual interest Rate (20% - 34%): ");
		double interest = sc.nextDouble();
		
		while(interest > 34 || interest < 20) {
			System.err.print("Input valid annual interest Rate (20% - 34%): ");
			interest = sc.nextDouble();
		}
		
		System.out.print("Input time period (3 - 10 years): ");
		int years = sc.nextInt();
		
		while(years > 10 || years < 3) {
			System.err.print("Input valid time period (3 - 10 years): ");
			years = sc.nextInt();
		}
		
		int percent = 100;
		int monthsInAYear = 12;
		double monthlyInterest = interest/(monthsInAYear * percent);
		
		double morgtage = principalAmount * (monthlyInterest * Math.pow(1 + monthlyInterest, years * 12))/(Math.pow(1 + monthlyInterest, years * 12) - 1);
		System.out.println("Your Morgtage is ₹" + morgtage);
		
		sc.close();
	}
}
