import java.util.Scanner;

class Foo
{
	int i,n,m,j;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		
		System.out.println("Enter the value is::");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("Your value is::"+i);
		}
	}
	void get2()
	{
		System.out.println("Enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.println("I value is::"+i+"J value is::"+j);
			}
		}
	}
	void get3()
	{
		System.out.println("Enter the while loop::");
		n=sc.nextInt();
		i=0;
		while(i<=n)
		{
			System.out.println("I value is::"+i);
			i++;
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		//f1.get1();
		//f1.get2();
		f1.get3();

	}

}
