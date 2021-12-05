/*
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive. 
 * Implement a function that determines whether a string that contains only letters is an isogram. 
 * Assume the empty string is an isogram. Ignore letter case.
 */
package codewar;

public class isoGram {
	public static void main(String[] args) {
		System.out.println(isIsogram("Dermatoglyphics"));
		System.out.println(isIsogram("moose"));
		System.out.println(isIsogram("isIsogram"));
		System.out.println(isIsogram("aba"));
		System.out.println(isIsogram("moOse"));
		System.out.println(isIsogram(""));
	}
	public static boolean isIsogram(String str) {
		boolean check = true;
		String s = str.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					return check = false;
				} else
					check = true;
			}
		}
		return check;
	}
}
