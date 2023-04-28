class Demo
{
	Demo()
	{
		System.out.println("Default cons..");
	}
	Demo(int pid)
	{
		System.out.println("Your ProductId is::"+pid);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		new Demo();
		new Demo(1001);

	}

}
