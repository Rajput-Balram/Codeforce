package cforces;

import java.util.Scanner;

public class Juicer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b = in.nextInt();
		int d = in.nextInt();
 
		int sum = 0;
		int result=0;

		for (; n >0; n--) {
			int a = in.nextInt();
		 	if (a <= b)
				sum += a;
		 	if(sum > d) {
		 		result++;
		 		sum =0;
		 	}

		}
		in.close();

		 System.out.println(result);
	}
}
