import java.util.Scanner;

class Sample
{
	int empid,salary;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is::");
		empid=sc.nextInt();
		salary=sc.nextInt();
		empname=sc.next();
	}
	void display()
	{
		System.out.println("Your value is::"+empid+""+salary+""+empname);
	}
}
public class Demo {

	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.input();
		s1.display();

	}

}
