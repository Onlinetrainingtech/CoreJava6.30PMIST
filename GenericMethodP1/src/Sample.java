class Demo
{
	/*
	   public int test(int t)
	   {
	     //code
	   }
	 */
	public <M> M test(M t)
	{
		return t;
	}
}
public class Sample {

	public static void main(String[] args) {
		
		Demo g=new Demo();
		System.out.println(g.test(10001));
		System.out.println(g.test("azar"));
		System.out.println(g.test(12.5));

	}

}
