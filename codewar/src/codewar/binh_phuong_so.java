package codewar;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;
 
public class binh_phuong_so {
 	public static void main(String[] args) {
// 		Scanner input = new Scanner(System.in);
// 		System.out.print("nhap so vao:"); //nhap
// 		int num = input.nextInt();//nhap
 		
 		int num = 233;
 		System.out.print( squareDigits2(num));
 		 		
 	}
 	  public static int squareDigits(int n) {
  		  
 		 String s = "";
 		 while (n!=0)
 		{
 			 int x = n%10;
 			 s = x*x + s;
 			 n=n/10;
 		}
 		 return Integer.valueOf(s);
 			}
 	  //////////////////////////////////////////////////////cach 2
 	  public static int squareDigits2(int n) {
  		  
 		 final StringBuffer s = new StringBuffer();
 		 while (n!=0)
 		{
 			 int x = n%10;
 			 s.insert(0, x*x);
 			 n=n/10;
 		}
 		 return Integer.valueOf(s.toString());
 			}
 	  
}