/*Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. 
Essentially, rearrange the digits to create the highest possible number.
ex: Input: 42145 Output: 54421*/
	
package codewar;

public class DescendingOrder {
public static int sortDesc(final int num) {
    String str = String.valueOf(num);
    char[] charArr = str.toCharArray();
    char tempChar = charArr[0];
    for (int i = 0; i < charArr.length-1; i++) {
      for (int j = i+1; j < charArr.length; j++) {
        if (Character.getNumericValue(charArr[i]) < Character.getNumericValue(charArr[j])) {
          tempChar = charArr[j];
          charArr[j] = charArr[i];
          charArr[i] = tempChar;
        }
      }
    }
    return Integer.parseInt(String.valueOf(charArr));
  }
}