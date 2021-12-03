package codewar;

public class isoGram {

	public static void main(String[] args) {
// 		Scanner input = new Scanner(System.in);
// 		System.out.print("nhap so vao:"); //nhap
// 		int num = input.nextInt();//nhap
 		

 		System.out.println(isIsogram("Dermatoglyphics"));
 		System.out.println(isIsogram("moose"));
 		System.out.println(isIsogram("isIsogram"));
 		System.out.println(isIsogram("aba"));
 		System.out.println(isIsogram("moOse"));
 	}
	public static boolean isIsogram(String str) {
  		  
 		  boolean check = true;
 		  String s = str.toLowerCase();
 		  for (int i = 0; i <s.length(); i++)
 		  {
 			 for (int j = i+1; j < s.length(); j ++)
 			 { 
 			  if (s.charAt(i) == s.charAt(j))
 				  {
//			 		System.out.println(str.charAt(i) + " " + str.charAt(j)) ;		
 				  return check = false;
		  	
 				  } else check =true;
 			 }
 		  } 
 		  		 return check;
 			}
	
}
