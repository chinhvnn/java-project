package codewar;

public class MultiTable {
    public static String multiTable(int num) {
    String str = "";
    int i;
    for (i = 1; i <= 9; i++) 
    {
      str = str + (i + " * " + num + " = " + i * num) + "\n";
    }
    str = str + (10 + " * " + num + " = " + 10 * num);

    return str; // good luck
  }
      
}