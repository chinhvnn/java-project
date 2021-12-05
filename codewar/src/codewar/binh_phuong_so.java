/*
 *  Bình phương mỗi số hạng của một số có nhiều chữ số.
 *  Ví dụ: 9191 -> 811811
 */

package codewar;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class binh_phuong_so {
	public static void main(String[] args) {
		int num = 9191;
		System.out.print("cách 1: "+num+"->" + squareDigits(num)+"\n");
		System.out.print("cách 2: "+num+"->" + squareDigits2(num)+"\n");

	}
	// cách 1: Chia số để tìm ra từng số hạng rồi đẩy vào 1 string
	public static int squareDigits(int n) {
		String s = "";
		while (n != 0) {
			int x = n % 10;
			s = x * x + s;
			n = n / 10;
		}
		return Integer.valueOf(s);
	}

	// cách 2: 
	public static int squareDigits2(int n) {
		final StringBuffer s = new StringBuffer();
		while (n != 0) {
			int x = n % 10;
			s.insert(0, x * x);
			n = n / 10;
		}
		return Integer.valueOf(s.toString());
	}
}