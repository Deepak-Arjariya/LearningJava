package in.aubank.interfaces;

import java.util.Scanner;

public class VoterMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Voter voter = new Voter();
		
		System.out.println("Enter Your name: ");
		String name = sc.next();
		voter.setName(name);
		
		
		System.out.println("Enter Your age(18-120): ");
		int age = sc.nextInt();
		try {
			voter.setAge(age);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter Your gender(male/female): ");
		String gender = sc.next();
		try {
			voter.setGender(gender);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		voter.voted();
		
		
		
		
		
	}
}
