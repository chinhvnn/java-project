package codewar;

import java.lang.String;
import java.util.stream.Stream;


public class findShortString {
public static void main (String args[])
		{
	String str = "bitcoin take over the world maybe who knows perhaps";
	String str2 = "turns out random test cases are easier than writing out basic ones";
	String str3 = "Let's travel abroad shall we";

System.out.println(findShort2(str));
System.out.println(findShort2(str2));
System.out.println(findShort2(str3));
}
/////////////////////////////cach 1
public static int findShort(String s)
{
	
	String[] str_arr = s.split(" ");
	int min = str_arr[0].length();
	
		for(int i=0 ; i<(str_arr.length); i++)
	{
			if (str_arr[i].length() < min)
		
			min = str_arr[i].length();
			}
			return min;
				}
/////////////////////////////cach 1

public static int findShort2(String s) {
    return Stream.of(s.split(" "))
      .mapToInt(String::length)
      .min()
      .getAsInt();
}
}
