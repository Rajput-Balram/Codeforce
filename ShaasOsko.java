package cforces;

import java.util.Scanner;

public class ShaasOsko {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int index = 0;
		while (n > index) {
			a[index++] = in.nextInt();
		}
		int m = in.nextInt();
		int[] x = new int[m];
		int[] y = new int[m];

		for (int i = 0; i < m; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		in.close();
		if (n == 1 && m != 0) {
			a[0] = 0;
		} else if (m == 0)
			;
		else {
			for (int j = 0; j < m; j++) {
				int yt = y[j];
				int xt = x[j] - 1;

				if (xt == 0) {

					a[xt + 1] = a[xt + 1] + (a[xt] - yt);
					a[xt] = 0;

				} else if (xt + 1 == n) {

					a[xt - 1] = a[xt - 1] + (yt - 1);
					a[xt] = 0;

				} else {

					a[xt + 1] = a[xt + 1] + (a[xt] - yt);
					a[xt - 1] = a[xt - 1] + (yt - 1);
					a[xt] = 0;

				}
			}
		}
		for (int val : a)
			System.out.println(val);

	}
}
