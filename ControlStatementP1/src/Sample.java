import java.util.Scanner;

class Demo
{
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		//int a=100;
		int a=200;
		if(a==100)
		{
			System.out.println("True::Equal");
		}
		else
		{
			System.out.println("False::NotEqual");
		}
	}
	void get2()
	{
		int age,sal,bns;
		
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>=60)
		{
			System.out.println("Enter the salary is::");
			sal=sc.nextInt();
			if(sal>=20000)
			{
				bns=sal+500;
				System.out.println("Your salary is::"+bns);
			}
			else
			{
				bns=sal+100;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your value is low");
		}
	}
	void get3()
	{
		int m1,m2,m3,tot;
		System.out.println("Enter the marks is::");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		tot=m1+m2+m3;
		if(tot>=900)
		{
			System.out.println("Grade-A");
		}
		else if(tot>=700)
		{
			System.out.println("Grade-B");
		}
		else if((tot<=500)&&(tot>=600))
		{
			System.out.println("Grade-C");
		}
		else
		{
			System.out.println("Grade-D");
		}
	}
	void get4()
	{
		int exp=2;
		switch(exp)
		{
		case 1:
			System.out.println("Case-1");
			break;
		case 2:
			System.out.println("Case-2");
			break;
		case 3:
			System.out.println("Case-3");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		//t1.get1();
		//t1.get2();
		//t1.get3();
		t1.get4();
		

	}

}
