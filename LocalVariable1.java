public class LocalVariable1{

	public static void main(String[] args)
    {
		int x;//not used
		int y;
		int i = 0;
		for(int j=0;j<3;j++)
			{
				i = i+j;
			} 

		//System.out.println(i+"  "+j); -> Cannot Find Symbol.
        try
        {
			int k = Integer.parseInt("ten");
        }
		
	    catch(NumberFormatException e)         
		{
             //j = 10; -> Cannot Find Symbol.
        }
         
		// System.out.println(j); -> Cannot Find Symbol.
      	System.out.println("hello"); // hello.
  		//System.out.println(y) -> Variable y might have not been initialized.
	}
}
