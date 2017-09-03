public class Literals
{
    public static void main(String[] args)
    {
       int x = 10;
       long l = 10;       
	   //int x1 = 10l; -> Possible loss of precision.

	   int y = 010;
	   int z = 0x10;
	   int i = 0B1111;
	   System.out.println(x+"  "+y+"  "+z+" "+l+" "+i+" ");
	   
	   float f = 123.456F;
	   float f1 = 1.2e3F;
	   // float f = 1.2e3;    -> Possible loss of precision.
	   // float f = 123.456;  -> Possible loss of precision.
	   // float f = 123.456d; -> Possible loss of precision.
	   
	   double d = 123.456;
	   double d1 = 1.2e3;
	   double d2 = 1_23_456.7_8_9;
	   // double d3 = _1_23_456.7_8_9; ->Not allowed.
	   // double d = 0x123.456; -> Malformed Floating point literal.
	   // double d = 0xFace.0;  -> Malformed Floating point literal.
	   System.out.println(f+"    "+f1+"   "+d+"   "+d1+"    "+d2+"    ");
	  
       boolean b = true;
	   // boolean b = 0; 
	   // boolean b = True;
	   // boolean b = "true";
	   System.out.println(b);
	   
	   char ch = 'a';
	   char ch1 = 97;
	   char ch2 = 0xface;
	   char ch3 = 0777;
	   char ch4 = 65535;
	   // char ch4 = 65536; -> possible loss of precision.
	   // char ch = a; -> Cannot find symbol.

	   // char ch = "a";  -> Incompatible Types.
	   // char ch = 'ab'; -> Unclosed char Literal.
	    
	   System.out.println(ch+"  "+ch1+"  "+ch2+"  "+ch3+"  "+ch4);
	   char ch5 = '\n';
	   
	   System.out.println(ch+"  "+ch1+"  "+ch2+"  "+ch3+"  "+ch4);
	   char ch6 = '\t';
	   
	   // char ch6 = '\m';
	   System.out.println(ch+"  "+ch1+"  "+ch2+"  "+ch3+"  "+ch4); 
   }
}