public class Localvariable3
{
     public static void main(String[] args)
     {  
         //public int x = 10;
         //private int x = 10;
         //protected int x = 10;
         //static int x = 10;
         //transient int x = 10;
         //volatile int x = 10;
		 
         int x;
         if(args.length>0)
         {
             x = 10;
         }
         
         else
         {
             x = 20;
         }
         
		 System.out.println(x); //This is allowed.
     }
    
}