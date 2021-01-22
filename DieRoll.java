package cforces;

import java.util.Scanner;

public class DieRoll{
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 
		 int Y = in.nextInt();
		 int W = in.nextInt();
		 in.close();
		 int fav = Y>W ? Y : W;
		 fav = (6-fav)+1;
		 
		 switch(fav) {
		 case 1:
			 System.out.println("1/6");
			 break;
		 case 2:
			 System.out.println("1/3");
			 break;
		 case 3:
			 System.out.println("1/2");
			 break;
		 case 4:
			 System.out.println("2/3");
			 break;
		 case 5:
			 System.out.println("5/6");
			 break;
	     default:
				 System.out.println("1/1");
		 }
	 }
 }