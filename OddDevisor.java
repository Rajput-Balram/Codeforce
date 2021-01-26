package cforces;
//@author - Rajput-Balram
//CodForce round #697 (div-3)
import java.util.Scanner;

solution -1 (with bit manipulation)
public class OddDevisor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- >0) {
			long n = in.nextLong();
			 if((n & (n-1))==0)
				 System.out.println("no");
			 else
				 System.out.println("yes");
			
		}
	}

}

//solution-2

public class OddDevisor{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			long n = in.nextLong();
			double temp = (double)n;
			for(int i=1; i<=Math.sqrt(n)+1; i++) {
				 temp = temp/2;
				 if(temp==1)
					 break;
			}
			 
			if(temp==1)
				System.out.println("no");
			else
				System.out.println("yes");
			
			
		}
	}
}

/* any no multiple of 2 has no any odd divisor because
 * odd * odd = odd
 * even * even = even
 * even * odd = even
 * odd * even = even
 * 
 * so the way to check whether given no has odd factor or not
 * is checked ---if no are multiple of 2 then it hasn't any odd divisor  
 */
 