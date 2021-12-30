package codewar;

public class PlayPassword {

	public static void main(String[] args) {
		System.out.println(playPass("I LOVE YOU!!!", 1));
		System.out.println("!!!vPz fWpM J");

		System.out.println(playPass("!!!]UOY EVOL I[", 0));
		System.out.println("[I LoVe yOu]!!!");

		System.out.println(playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
		System.out.println("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO");
	}

	public static String playPass(String s, int n) {

		char[] charArr = s.toCharArray();
		char[] AZ = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W','X','Y', 'Z' };
		// shift each letter by a given number but the transformed letter must be a
		// letter (circular shift)
		// replace each digit by its complement to 9,
		// keep such as non alphabetic and non digit characters,
		for (int i = 0; i < charArr.length; i++) {
			if (Character.isDigit(charArr[i])) {
				int digit = (9 - Integer.valueOf(String.valueOf(charArr[i])));
				charArr[i] = (char) ('0' + digit);
			} else if (Character.isLetter(charArr[i])) {
				for (int i2 = 0; i2 < AZ.length; i2++) {
					if (AZ[i2] == charArr[i]) {
						charArr[i] = (char) AZ[(i2 + n + 26) % 26];
						break;
					}

				}
			}
		}
		// downcase each letter in odd position, upcase each letter in even position
		// (the first character is in position 0),
		int j=1;
		for (int j2 = 0; j2 < charArr.length; j2++) {
			if(Character.isLetter(charArr[j2]))
			{
				j=j2+1;
				break;
			}
		}
		
		do {
			charArr[j] = Character.toLowerCase(charArr[j]);
			j = j + 2;
		} while (j < charArr.length);

		// reverse the whole result.
		int c = charArr.length - 1;
		char temp;
		for (int t = 0; t < charArr.length / 2; t++) {
			temp = charArr[t];
			charArr[t] = charArr[c];
			charArr[c] = temp;
			c--;
		}
		String result = String.valueOf(charArr);
		return result;
	}
}