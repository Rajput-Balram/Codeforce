package cforces;

//@author - Rajput-Balram
//CodForce round #697 (div-3)
import java.util.Scanner;
/*
 * Let x — the number of 2020, y — the number of 2021 (x,y≥0). Let us write the required decomposition of the number n:
n=2020⋅x+2021⋅y=2020⋅(x+y)+y
Then we get that n−y is divisible by 2020. Take y equal to the remainder of n divided by 2020. Then x is uniquely determined from the formula above:
x=n−y2020−y
Then, if the result is that x≥0 (y≥0 because the remainder of dividing n by 2020 is non-negative), then n can be represented as the sum of a certain number of 2020 and a certain number of 2021.
*/
// basically N = x*2020 + y*2021
//           N  = 2020(x+y) + y
//      so   N-y = 2020(x+y) here (N-y) is divisible of 2020 means reminder of N/2020 is equal to y(N%2020 ==y)
//     and then x =( (N-y)/2020 )-y

public class NewYear {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt();
			int y = n % 2020;
			int x = (n - y) / 2020 - y;

			if (x >= 0 && x * 2020 + y * 2021 == n)
				System.out.println("yes");
			else
				System.out.println("no");

		}
	}

}
