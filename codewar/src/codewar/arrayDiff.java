/*
 * Xóa phần tử giống mảng B ở trong mảng A
 */
package codewar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class arrayDiff {
	public static void main(String args[]) {
		int[] a = { 4, 3, 2, 1 };
		int[] b = { 3 };
		
		System.out.print("Mảng A: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("  Mảng B: ");
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j] + " ");
		}
		System.out.print("\nMảng A - Mảng B: ");
		
		int[] a1 = arrayDiff(a, b);
		System.out.print("\nCách 1: ");
		for (int x = 0; x < a1.length; x++) {
			System.out.print(a1[x] + " ");
		}
		int[] a2 = arrayDiff2(a, b);
		System.out.print("\nCách 2: ");
		for (int x2 = 0; x2 < a2.length; x2++) {
			System.out.print(a2[x2] + " ");
		}
		Integer[] a3 = arrayDiff3(a, b);
		System.out.print("\nCách 3: ");
		for (int x3 = 0; x3 < a3.length; x3++) {
			System.out.print(a3[x3] + " ");
		}
	}

	// CÁCH 1: dùng 2 vòng lặp
	public static int[] arrayDiff(int[] a, int[] b) {
		int n = a.length, i, j, c = 0;
		int[] mang = new int[n];
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < b.length; j++) {
				if (a[i] != b[j]) {
					mang[c] = a[i];
					c++;
				} else
					break;
			}
		}
		return mang;
	}

	// cách 2: Viết bằng arraylist
	public static int[] arrayDiff2(int[] a, int[] b) {
		ArrayList<Integer> mang1 = new ArrayList<>(Arrays.asList());
		return a;
	}

	// viết bằng list - array stream
	public static Integer[] arrayDiff3(int[] a, int[] b) {
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> temp = Arrays.stream(b).boxed().collect(Collectors.toList());
		for (int i : a) {
			if (!temp.contains(i)) {
				result.add(i);
			}
		}
		return result.stream().toArray(Integer[]::new);
	}

}
