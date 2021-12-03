package codewar;
import java.util.Scanner;
import java.lang.Character;

public class viethoa2 {
	public static void main(String args[])
	{
		Scanner str = new Scanner(System.in); 
		System.out.println("nhập dãy chuối vào/ Enter string");
		String chuoi = str.nextLine();
		
		char[]  mangkytu = chuoi.toCharArray();
		
		for (int i=0; i<=mangkytu.length; i++)
		{
			if (i == 0 || mangkytu[i-1] == ' ')
			{
				mangkytu[i] = Character.toUpperCase(mangkytu[i]);
			}
		}
		chuoi = String.valueOf(mangkytu)	;
		System.out.println(chuoi);
	}
}
