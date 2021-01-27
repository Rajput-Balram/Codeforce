package cforces;

 
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonLetter {

	public static void main(String[] args) {
		 Scanner in  = new Scanner(System.in);
		 String s = in.nextLine();
		  Set<Character> values = new HashSet<>();
		 for(int i=0; i<s.length(); i++) {
			 if(s.charAt(i) == '{' || s.charAt(i) == '}'||s.charAt(i) == ','||s.charAt(i) == ' ') 
				 continue;
			 values.add(s.charAt(i));
		 }
		 System.out.println(values.size());
		 
	}

}
