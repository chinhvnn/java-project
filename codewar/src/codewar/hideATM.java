package codewar;

public class hideATM {
	public static void main (String args []) {
		String s = "12345678";
		String s2 = "24";
		System.out.println(hideATM(s));
		System.out.println(hideATM(s2));
	}

    public static String hideATM(String str) {
    	int leng = str.length();
        String s = "";

        if (leng<=4)
        {
        	return str;
        }
        
      	for (int i=0; i < (leng-4); i++ )
             {
      		    s+="#";
             }
      	
  		return s + str.substring(leng-4);
         
         
       }
}