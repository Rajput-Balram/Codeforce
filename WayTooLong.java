package cforces;

import java.util.Scanner;

public class WayTooLong {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t-- >0) {
			String s = in.next();
			int len = s.length();
			if(len>10) {
				len = len-2;
			System.out.print(s.charAt(0));
			System.out.print(len);
			System.out.println(s.charAt(s.length()-1));
			}
			else
				System.out.println(s);
		}
	}

}
