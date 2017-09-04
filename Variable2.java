public class Variable2
{
    static int x=10;
    int y=20;
    public static void main(String[] args)
    {
        Variable1 v=new Variable1();
        v.x=888;
        v.y=999;
        System.out.println(v.x+" "+v.y+" ");
        Variable1 v1=new Variable1();
        System.out.println(v1.x+" "+v1.y+" ");
    }
}
