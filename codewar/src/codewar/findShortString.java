/*
 * trả về số ký tự ngắn nhất của 1 chuỗi
 */

package codewar;

import java.lang.String;
import java.util.stream.Stream;

public class findShortString {
	public static void main(String args[]) {
		String str = "bitcoin take over the world maybe who knows perhaps";
		String str2 = "turns out random test cases are easier than writing out basic ones";
		String str3 = "Let's travel abroad shall we";

		System.out.println(findShort2(str));
		System.out.println(findShort2(str2));
		System.out.println(findShort2(str3));
		
		System.out.println("\n"+findShort(str));
		System.out.println(findShort(str2));
		System.out.println(findShort(str3));
	}

	// CÁCH 1: dùng string.slpit()
	public static int findShort(String s) {

		String[] str_arr = s.split(" ");// tách chuỗi
		int min = str_arr[0].length();  // lấy min = chuỗi đầu tiền [0]

		for (int i = 0; i < (str_arr.length); i++) {
			if (str_arr[i].length() < min)
				min = str_arr[i].length();
		}
		return min;
	}
	// CÁCH 2: dùng Stream

	public static int findShort2(String s) {
		return Stream.of(s.split(" ")).mapToInt(String::length).min().getAsInt();
	}
}
