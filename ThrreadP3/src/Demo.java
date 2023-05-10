class Sample extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException t)
		{
			
		}
		System.out.println("This is an Run method..");
	}
}
public class Demo {

	public static void main(String[] args) {
		
		Sample t1=new Sample();
		Sample t2=new Sample();
		t1.start();
		try
		{
			System.out.println("JoinIn");
			t1.join();
			System.out.println("JoinOut");
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
		t2.start();

	}

}
