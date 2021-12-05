/*
 * viet hoa ky tu dau tien cua chu trong chuoi
 */
package codewar;

import java.lang.Character;
import java.util.Scanner;

class uperCaseFirtletter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message;
		System.out.println("\nNhap vao cac chuoi ky tu: ");
		message = sc.nextLine();
		System.out.println("\nChuyen doi 1: " + uperCase1(message));
		System.out.println("\nChuyen doi 2: " + uperCase2(message));
	}

	/// cach 1:
	public static String uperCase1(String message) {
		char[] charArray = message.toCharArray();
		boolean foundSpace = true;
		for (int i = 0; i < charArray.length; i++) {
			// check co phai la Letter khong, neu khong phai thi true, tu tiep theo viet hoa
			// space khong phai la Letter, sau spale se viet hoa
			if (Character.isLetter(charArray[i])) {
				if (foundSpace) {
					charArray[i] = Character.toUpperCase(charArray[i]);
					foundSpace = false;
				}
			} else
				foundSpace = true;
		}
		return message = String.valueOf(charArray);// chuyen char thanh string
	}
	/// cach 2: 
	public static String uperCase2(String chuoi) {
		char[] mangkytu = chuoi.toCharArray();
		for (int i = 0; i <= mangkytu.length; i++) {
			//check letter dau tien or letter[i-1] la space thi letter tiep theo uppserCase 
			if (i == 0 || mangkytu[i - 1] == ' ') {
				mangkytu[i] = Character.toUpperCase(mangkytu[i]);
			}
		}
		return chuoi = String.valueOf(mangkytu);
	}
}

