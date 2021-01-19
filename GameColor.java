package cforces;
import java.util.Scanner;

public class GameColor {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt();
		int home[] = new int[n];
		int guest[] = new int[n];
		int i=0;
		int count=0;

		while(i<n) {
			home[i] = in.nextInt();
			guest[i] = in.nextInt();
			i++;

		}
		for(int j=0; j<n; j++) {
			for(int x=0; x<n; x++) {
				if(home[j] == guest[x])
					count++;
			}
		} System.out.println(count);
	}  
}
