abstract class Product
{
	abstract void addProduct();
	void display()
	{
		System.out.println("This is the display method..");
	}
}
class Demo extends Product
{

	void addProduct() {
		
		System.out.println("This is addProduct..");
		
	}
	
}


public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.display();
		f1.addProduct();
	}

}
