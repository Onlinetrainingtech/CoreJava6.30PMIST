class B
{
	int empid=1001;
	String empname="Azar";
	void get1()
	{
		System.out.println("This is base class..");
	}
}
class D extends B
{
	void get2()
	{
		System.out.println("Your value is::"+empid+""+empname);
	}
}
public class Sample {

	public static void main(String[] args) {
		

		D f1=new D();
		f1.get1();
		f1.get2();
	}

}
