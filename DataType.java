public class DataType 
{
	 public static void main(String[] args)
     {
         byte b=10;
         byte b2=20;
		 
         // byte b3=128;     -> Possible loss of precision.
         // byte b4=10.6;    -> Possible loss of precision.
         // byte b5=true;    -> Incompatible Types
         // byte b6="durga"; -> Incompatible Types
		 
         System.out.println("byte b = "+b);   //10
         System.out.println("byte b2 = "+b2); //20
		 
         short s=32767;
         
		 // short s1=32768; -> Possible loss of precision.
		 // short s=true;   -> Incompatible Types

		 System.out.println("short s = "+s); //32767
		 
		 int i=2147483647; 
		 
		 // int i=2147483648; -> Integer Number Too large.
		 // int i=214748364l; -> Possible loss of precision.
		 // int i=true;       -> Incompatible Types.
		 
		 System.out.println("int i = "+i); //2147483647
		 
		 long l = 12600*60*60*24*1000;
		 System.out.println("long l = "+l); //2013274112
		 
		 float f = 12;
		 System.out.println("float f = "+f); //12.0
		 
		 double d = 1.777777;
		 System.out.println("double d = "+d); //1.777777
		 
		 boolean b7=true;
		 // boolean b7 = 0;
		 // boolean b7 = True;
		 // boolean b7 = "true";
		 System.out.println("boolean b7 = "+b7); //true
		 
		 char ch='a';
		 //char ch=null;
		 System.out.println("char ch = "+ch); //a		 
     }
}
