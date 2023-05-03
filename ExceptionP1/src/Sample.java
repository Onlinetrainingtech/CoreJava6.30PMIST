class Demo
{
	void get1()
	{
		try
		{
		int a1=100/0;
		System.out.println("Your value is::"+a1);
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check the value");
		}
		get2();
	}
	void get2()
	{
		System.out.println("This is get2 function...");
	}
	void get3()
	{
		try
		{
		String name=null;
		System.out.println("your length of the String is::"+name.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("Please change the value..");
		}
		finally
		{
			System.out.println("This is finally..");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
	
		Demo f1=new Demo();
		//f1.get1();
		f1.get3();

	}

}
