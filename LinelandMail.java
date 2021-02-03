package cforces;

import java.util.Scanner;

public class LinelandMail {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int min=0,max=0;
		for(int x=0; x<n; x++) {
			arr[x] = in.nextInt();
		}
		
		if(n==2) {
			System.out.println(arr[1]-arr[0]+" "+(arr[1]-arr[0]));
			System.out.println(arr[1]-arr[0]+" "+(arr[1]-arr[0]));
			return ;
		}
		
		for(int i=0; i<n; i++) {
			if(i==0) {
				min = arr[i+1] - arr[i];
				max = arr[n-1] - arr[i];
			}else if(i== n-1) {
				min = arr[i] - arr[i-1];
				max = arr[i] - arr[0];
			}
			else {
				min = arr[i+1]-arr[i]<arr[i]-arr[i-1] ?arr[i+1]-arr[i]:arr[i]-arr[i-1];
				max = arr[i]-arr[0]>arr[n-1]-arr[i] ?arr[i]-arr[0]:arr[n-1]-arr[i];
			}
			
			System.out.println(min +" "+max);
			//System.out.println(min +" "+max);

		}

	}

}
