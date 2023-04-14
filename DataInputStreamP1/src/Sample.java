import java.io.DataInputStream;
import java.io.IOException;

class Foo
{
	int empid;
	String empname;
	float avgsalary;
	DataInputStream dis=new DataInputStream(System.in);
	void get1() throws NumberFormatException, IOException
	{
		System.out.println("Enter the empid is::");
		empid=Integer.parseInt(dis.readLine());
		System.out.println("Enter the empname is::");
		empname=dis.readLine();
		System.out.println("Enter the avgsalary is::");
		avgsalary=Float.parseFloat(dis.readLine());
	}
	void get2()
	{
		System.out.println("Your data is::"+empid+""+empname+""+avgsalary);
	}
}
public class Sample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Foo f1=new Foo();
		f1.get1();
		f1.get2();

	}

}
