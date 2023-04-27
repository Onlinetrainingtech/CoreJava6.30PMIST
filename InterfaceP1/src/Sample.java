interface B
{
	int pid=1001;
	void get1();
}
interface B1 extends B
{
	void get2();
}
class D implements B1
{

	public void get1() {
		
		System.out.println("Your value is::"+pid);
		
	}
	public void get2()
	{
		System.out.println("This is get2 function");
	}
	
}
public class Sample 
{
   public static void main(String as[])
   {
	   D f1=new D();
	   f1.get1();
	   f1.get2();
   }
}

