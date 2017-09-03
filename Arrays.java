public class Arrays
{
    public static void main(String[] args)
    {
      int []a = new int[3];
      // int []a = new int[]; 
      // int []a = new int[-3];
	  
      double []d = new double[3];
      short []s = new short[3];
      byte []b = new byte[3];
      boolean []bl = new boolean[3];
      
	  System.out.println(a.getClass().getName()); // [I
      System.out.println(d.getClass().getName()); // [D
      System.out.println(s.getClass().getName()); // [S
      System.out.println(b.getClass().getName()); // [B
      System.out.println(bl.getClass().getName());// [Z
      
	  int [] []a1 = new int[3][2];
      System.out.println(a1.getClass().getName());// [[I
	  
      int []x = new int[0];
      int []a2 = new int['a'];
      int a3 = 20;
      int [] a4 = new int[a3];
      short s1 = 30;
      int [] a5 = new int[s1];
      // int [] a5 = new int[10l];
      // int [] a6 = new int[2147483646];
      // int [] a6 = new int[2147483648];
      
	  System.out.println(args.length); //0
      System.out.println(a2[0]); //0
      System.out.println(a4[0]); //0
      System.out.println(a5[0]);//default value i.e., 0 
	  
      System.out.println(a2); //[I@15db9742    Hexa-Decimal Values.
      System.out.println(a4); //[I@6d06d69c    These numbers
      System.out.println(a5); //[I@7852e922    may change.
                   
 }
}
