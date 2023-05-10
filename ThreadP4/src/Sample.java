class Demo implements Runnable
{
	public void run()
	{
		System.out.println("This is run method..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		
		Demo f1=new Demo();
		Thread t1=new Thread(f1);
		t1.start();

	}

}
