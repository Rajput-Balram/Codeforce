package cforces;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMath {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		String s1 = s.replaceAll("[^0-9]", ""); //remove all character from string except integer value(0-9)
		
		int[] arr = new int[s1.length()];
		for(int i=0; i<s1.length(); i++) {
			arr[i] = Character.getNumericValue((s1.charAt(i))); //get character value by index, convert into integer and then insert into int arr
		}
			
		Arrays.sort(arr);       //sort the array
		for(int a=0; a<arr.length; a++) {
			System.out.print(arr[a]);
			if(a!=(arr.length-1))       //if get last integer value then not concate(not print) "+" operater 
				System.out.print("+");
		}

	}

}
