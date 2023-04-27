import java.util.Scanner;

class B
{
	String empname;
	void get1()
	{
		System.out.println("This is base class");
	}
}
class D1 extends B
{
	int empid;
	Scanner sc=new Scanner(System.in);
	void get2()
	{
		System.out.println("Enter the empid is::and empname::");
		empid=sc.nextInt();
		empname=sc.next();
		
	}
}
class D2 extends D1
{
	void get3()
	{
		System.out.println("Your data is::"+empid+""+empname);
	}
}
public class Sample {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
