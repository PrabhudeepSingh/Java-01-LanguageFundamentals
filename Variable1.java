public class Variable
{	
    int x = 10; //instance variable
    int y;
    double d;
    boolean b;
    String s;
    static int z = 20; //static variable
    static double d1;
    static boolean b1;
    static String s1;
	
    public void m1()
    {
        System.out.println(x); //instance variable
        System.out.println(z); //static variable
    }
	
    public static void main(String[] args)
    {
        System.out.println(z); //static variable
        System.out.println(d1); //default value
        System.out.println(b1); //default value
        System.out.println(s1); //default value
        //System.out.println(x) -> non static variable x
		
        Variable v=new Variable();
        System.out.println(v.x);
        System.out.println(v.y); //default value
        System.out.println(v.d); //default value
        System.out.println(v.b); //default value
        System.out.println(v.s); //default value
        v.m1();
     } 
}