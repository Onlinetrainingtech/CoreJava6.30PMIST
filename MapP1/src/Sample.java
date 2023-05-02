import java.util.HashMap;
import java.util.Map;

class Demo
{
	HashMap<Integer,String>list1=new HashMap<Integer,String>();
	void get1()
	{
		list1.put(1001,"a1");
		list1.put(1002,"a2");
		list1.put(1003,"a3");
		list1.put(1004,"a4");
		for(Map.Entry h1:list1.entrySet())
		{
			System.out.println(h1.getKey());
			System.out.println(h1.getValue());
		}
		System.out.println("Searching the data is::"+list1.containsKey(1001));
		System.out.println("Remove the data is::"+list1.remove(1001));
		System.out.println("After Remove the data is::"+list1.size());
		System.out.println("Total data is::"+list1);
	}
	
}
public class Sample {

	public static void main(String[] args) {
		
		Demo t1=new Demo();
		t1.get1();

	}

}
