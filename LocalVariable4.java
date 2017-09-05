public class Localvariable4
{
    int x = 10; //instance variable
    static String s = "Prabhu"; //static variable
    int []y;
    static int z[];

	public static void main(String[] args)
    {
        int[] j= new int[4];
        Localvariable3 v = new  Localvariable3();
        System.out.println(v.y);
        System.out.println(j);
        //System.out.println(z[0]);nullpointerexception
        //System.out.println(v.y[0]);
    }      
}
