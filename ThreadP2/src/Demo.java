class Sample extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("ThreadIn");
			
			for(int i=0;i<=5;i++)
			{
				System.out.println("I value is::"+i);
				Thread.sleep(1000);
			}
			
			
			System.out.println("Your Current Thread name is::"+currentThread().getName());
			System.out.println("Your Priority"+currentThread().getPriority());
			System.out.println("ThreadOut");
		}
		catch(InterruptedException t)
		{
			
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		
		Sample t1=new Sample();
		t1.start();
		t1.setName("Sheik");
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.isInterrupted());
		System.out.println(t1.isAlive());

	}

}
