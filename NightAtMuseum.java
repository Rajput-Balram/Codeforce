package cforces;

import java.util.Scanner;

public class NightAtMuseum {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 String s = in.nextLine();
		 in.close();
		 char x = 'a';
		   
		 int rotation = 0;
		 int l = 26;
		 for(int i=0; i< s.length(); i++) {
			 
			 rotation +=  Math.min(Math.abs(x- s.charAt(i)), l - Math.abs(x- s.charAt(i)));
			 x = s.charAt(i);
		 }
		 System.out.println(rotation);

	}

}
