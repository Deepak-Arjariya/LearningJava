package in.aubank.string;

public class StringMain {
	
	public static void main(String[] args) {
		String s1 = "AU";
		String s2 = " Small Finance Bank";
		
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		String s4 = s1 + s2;
		System.out.println(s4);
		
		int l = s4.length();
		System.out.println(l);
		
		String s5 = "AU bank";
		String s6 = "au bank";
		
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		
		
//		s5.charAt(1) = 'y'; // does not work
		System.out.println(s5.charAt(1));
		
		
//		------------------------------------------ Trimming and empty check--------------------------------
		
		String s7 = "      AU Bank           ";
		System.out.println(s7);
		
		s7 = s7.trim();
		System.out.println(s7);
		
		String s8 = "     ";
		System.out.println(s8.isEmpty());
//		System.out.println(s8.isBlank()); // recently added in jdk 9 sir thinks, this is jdk 8;
		
//		--------------------------------------Index and charAt---------------------------------------------
		
		String s9 = "nutrabox whey protien";
		System.out.println(s9.charAt(6));
		System.out.println(s9.indexOf("o"));
		int indexOfFirstN = s9.indexOf('o');
		System.out.println(s9.indexOf('o', indexOfFirstN + 1));
//		System.out.println(s5.charAt('z'));
		
//		---------------------------------------UpperCase and LowerCase--------------------------------------
		
		String s10 = "au bank";
		String s11 = "AU Bank";
		
		System.out.println(s10.toUpperCase());
		System.out.println(s11.toLowerCase());
		
		String csv = "Ranu, girl, 100000, football";
		String[] data = csv.split(",");
		
		for(String d : data) {
			System.out.println(d);
		}
		
		
		String s12 = "JxVx";
		System.out.println(s12);
		s12 = s12.replace('x', 'a');
		System.out.println(s12);
		
		String str = "hamburger";
		
		System.out.println(str);
		
		String s13 = str.substring(4, 8);
		System.out.println(s13);
		
		CharSequence s14 = str.subSequence(4, 8);
		System.out.println(s14);
		
		
		
	}

}
