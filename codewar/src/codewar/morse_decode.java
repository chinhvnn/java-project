/*
 * decode morse/ biên dịch mã morse
 */
package codewar;

import java.util.Scanner;
import java.util.Arrays;

public class morse_decode {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter morse code:");
		String morseCode = input.nextLine();
		System.out.print("english to morse: "+decode1(morseCode));
		System.out.print("\nmorse to english: "+decode2(morseCode));
	}

	// change English to Morse/////////////////////////////////////
	public static String decode1(String morseCode) {
		char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ',', '.', '?',
				' ' };
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
				"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "--..--", ".-.-.-",
				"..--..", " " };
		char[] mangkt = morseCode.toLowerCase().toCharArray();
		String Str = "";
		for (int i = 0; i < mangkt.length; i++) {
			for (int j = 0; j < english.length; j++) {
				if (english[j] == mangkt[i]) {
					Str = Str + morse[j] + " ";
				}
			}
		}
		return Str;
	}
	// change Morse to English//////////////////////////////////////
	public static String decode2(String morseCode) {

		String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ",", ".", "?",
				" " };

		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
				"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "--..--", ".-.-.-",
				"..--..", "" };

		String[] mangkt = morseCode.split(" ");

		String Str = "";

		for (int i = 0; i < mangkt.length; i++) {
			for (int j = 0; j < morse.length; j++) {

				if (mangkt[i].equals(morse[j])) {
					Str = Str + english[j];
				}
			}
		}
		return Str.toUpperCase().replace("  ", " ");
	}
}
