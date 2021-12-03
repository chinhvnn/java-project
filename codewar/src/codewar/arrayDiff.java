package codewar;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class arrayDiff {
	public static void main (String args[])
	{
	int[] a = {4,3,2,1};
	int[] b = {3};
	String[] c = {"x"};
	
	int[] a1 = arrayDiff(a, b);
	System.out.print("\n");
	for (int x=0; x<a1.length; x++ )
	{		
		System.out.print(a1[x]+ " ");}
	
		}
	// viết bằng arraylist
	public static int[] arrayDiff2(int[] a, int[] b) {
		ArrayList<Integer> mang1 = new ArrayList<>(Arrays.asList());
		
		
		
		return a;
		
		
	}
	
	
	
	
	
	//xóa 1 phần tử đơn trùng nhau trong mảng.
		  public static int[] arrayDiff(int[] a, int[] b) {
		  int n = a.length,i,j,c=0;
		  int[] mang = new int[n];
		  for (i = 0; i < a.length; i++)
		    {
		    	for (j = 0; j < b.length; j++)
		    	{
		    		
		    		System.out.print(a[i]);
		    		System.out.print(b[j] +" " );
		    		if (a[i] != b[j])
	    			{
		    		mang[c]= a[i];    		
		    		c++;
		    		}else break;
		    	}
			
		    }
//		  int[] mang1 = new int[c];
//		  int c2=0;
//		  for (int x=0; x<mang1.length;x++)
//		  	{mang1[x]=mang[c2];
//		  	c2++;
//		  	}
		  	return mang;
	  }
			//tâm viết xóa phần tủ trùng 2 mảng
	  public static Integer[] diff(int[] a, int[] b) {
		    List<Integer> result = new ArrayList<Integer>();
		    List<Integer> temp = Arrays.stream(b).boxed().collect(Collectors.toList());
		    for(int i : a) {
		      if(!temp.contains(i)) {
		        result.add(i);
		      }
		    }
		    return result.stream().toArray(Integer[]::new);
		  }


}
