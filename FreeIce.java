package cforces;

import java.util.Scanner;

public class FreeIce {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		long totalice = in.nextLong();
		in.nextLine();
		
		int distres =0;
		
		 while(t-- >0) {
			 String s = in.nextLine();
			// System.out.println(s.contains("+"));
			 String s1 = s.replaceAll("[^0-9]", "");//Integer.parseInt(String.valueOf(s.charAt(2)));
			 long value = Long.parseLong(s1);
			 if(s.contains("+"))
				 totalice +=value ;
			 else if(value <= totalice  && totalice!=0)
					 totalice -=value;
			 else if(value > totalice)
				 distres++;
			 //System.out.println("value "+value);
			//System.out.println("totalice"+totalice+"  ");	 
		 }
		 System.out.print(totalice +" ");
		 System.out.println(distres);
	}

}
