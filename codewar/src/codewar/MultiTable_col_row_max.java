package codewar;

import java.util.Scanner;

//tavu1@cmc.com.vn
public class MultiTable_col_row_max {
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Nhap Collumns:");
		int col = input1.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Nhap Rows:");
		int row = input2.nextInt();
		Scanner input3 = new Scanner(System.in);
		System.out.println("Nhap max:");
		int max = input3.nextInt();
		tinh_useloop(col, row, max);
//		tinh_usearray(col, row);
		
		
	}
	// dung loop
	public static void tinh_useloop(int cot, int hang, int tongso) {
		int count =1;
		int cot_fix = cot;
		for (int c = 1; c <= hang; c++) {
			for (int i = 1; i <= tongso; i++) {
				for (int j = count; j <= cot; j++) {
					System.out.print(i + " * " + j + " = " + i * j + "   ");
				}
				System.out.println("");
			}
			System.out.println("***********************************************");
			count = count + cot_fix;
			cot = cot + cot_fix;
		}
	}
	//dung array
}
