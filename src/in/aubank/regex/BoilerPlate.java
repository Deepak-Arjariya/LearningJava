package in.aubank.regex;

import java.util.regex.Pattern;

public class BoilerPlate {
	
	public static void main(String[] args) {
		
		String[] list= {"a","b","c"};
		String regex="a";
		
		for(String word:list) {
			
			boolean matches=Pattern.matches(regex, word);
			
			if(matches) {
				System.out.println(word+" MATCHES FOR "+regex);
			}
			else {
				System.err.println(word+" DOESN'T MATCHES FOR "+regex);
			}
		}
		
		}
	}