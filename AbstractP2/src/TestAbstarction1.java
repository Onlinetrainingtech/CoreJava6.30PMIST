abstract class Shape
{
	abstract void draw();
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("This is Rectangle draw function..");
	}
}
class Circle1 extends Shape
{
	void draw()
	{
		System.out.println("This circle1 draw function,..");
	}
}

public class TestAbstarction1 {

	public static void main(String[] args) {
		
		Shape s=new Circle1();
		Shape s1=new Rectangle();
		s.draw();
		s1.draw();

	}

}
