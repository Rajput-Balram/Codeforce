package cforces;

 
//import java.io.IOException;
 
import java.util.Scanner;

public class NewPassword {

	public static void main(String[] args) /*throws IOException*/   {
		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); 
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int j=0;
		for(int i=0; i<n; i++) {
			System.out.print((char)('a'+j));
			 j =  (j+1)%k;
			 /*                      // both solution work fine
			 j= j+1;
			 if(j==k)
			   j=0; */
		}
		in.close();

	}

}
