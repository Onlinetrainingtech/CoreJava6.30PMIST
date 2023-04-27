
class Foo extends Sample
{
	void get2()
	{
		System.out.println("This is Foo class...");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.get1();
		f1.get2();
	}

}
