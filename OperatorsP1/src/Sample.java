class Foo
{
	void ArithmeticOperators()
	{
		int a1=100,b1=200;
		System.out.println("Add::"+(a1+b1));
		System.out.println("Mult::"+(a1*b1));
	}
	void RelationalOperators()
	{
		int a2=100,b2=300;
		System.out.println("Lessthan::"+(a2<b2));
		System.out.println("Greaterthan::"+(a2>b2));
		System.out.println("Equalto is::"+(a2==b2));
		System.out.println("NotEqual to is::"+(a2!=b2));
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.ArithmeticOperators();
		f1.RelationalOperators();

	}

}
