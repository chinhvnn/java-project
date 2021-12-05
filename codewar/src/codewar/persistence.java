/*
 * Đếm số lần tích các số:
 * persistence(999) === 4 // because 9*9*9 = 729, 7*2*9 = 126,
                    // 1*2*6 = 12, and finally 1*2 = 2
 */
package codewar;

import java.util.Scanner;
import java.lang.Character;

public class persistence {
	public static void main(String args[]) {
		long key1 = 999;

		System.out.println(tich_cac_chu_so(key1));
		System.out.println(persistence2(key1));
		System.out.println(persistence3(key1));
	}

	// cach 1 - do while
	public static int tich_cac_chu_so(long n) {
		int tich = 1;
		int count = 0;
		while (n > 9) {
			tich = 1;
			do {
				tich = (int) (tich * (n % 10));
				n = n / 10;
			} while (n > 0);
			n = tich;
			count = count + 1;
		}
		return (count);
	}

	// cach 2 - long to char string
	public static int persistence2(long n) {
		int times = 0;
		while (n >= 10) {
			n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
			times++;
		}
		return times;
	}
	// cach 3 - de quy
	public static int persistence3(long n) {
		long m = 1, r = n;

		if (r / 10 == 0)
			return 0;

		for (r = n; r != 0; r /= 10)
			m *= r % 10;
		return persistence3(m) + 1;
	}

}