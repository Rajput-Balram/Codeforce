package cforces;

//import java.util.Arrays;
import java.util.Scanner;

public class Presents {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 int[] src = new int[n]; 
		 int[] dst = new int[n];
		 
		 for(int x=0; x<n; ++x)
			 src[x] = in.nextInt();
		 for(int i=0; i<n; i++) {
			  
			 dst[src[i]-1] = i+1;
		 }
		 //System.out.println(Arrays.toString(dst));
		 for(int j=0; j<n; j++)
		     System.out.print(dst[j]+" ");
	}

}
