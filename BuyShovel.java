package cforces;

import java.util.Scanner;

public class BuyShovel {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int price = in.nextInt();
		int coin = in.nextInt();
		int nofShovel = 1;
		int tempPrice = price;

		in.close();

		while (price % 10 != 0 && price % 10 != coin) {

			price += tempPrice;
			nofShovel++;

		}
		System.out.println(nofShovel);
	}
}