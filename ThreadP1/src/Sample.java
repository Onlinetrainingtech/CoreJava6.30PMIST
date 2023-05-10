class Demo extends Thread
{
	public void run()
	{
		System.out.println("This is a thread method..");
		get1();
	}
	public void get1()
	{
		System.out.println("This is a Normal method..");
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		
		t1.start();

	}

}
