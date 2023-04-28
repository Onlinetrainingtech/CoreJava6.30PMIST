class Demo
{
	void get1(int empid)
	{
		System.out.println("This is empid is::"+empid);
	}
	void get1(int pid,String pname)
	{
		System.out.println("This is pid::"+pid+"Pname is::"+pname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1.get1(1001);
		d1.get1(2001,"apple");

	}

}
