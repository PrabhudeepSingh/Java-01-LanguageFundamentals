public class VarArg2
{
    public static void m1(int...x)
    {
        System.out.println("var_args method");
    }

	public static void m1(int x)
    {
        System.out.println("general method");
    }

    public static void main(String[] args)
    {
        m1();
        m1(10,20);
        m1(10);        
    }
}
