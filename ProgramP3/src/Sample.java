
public class Sample 
{
	String pname="azar";//class or instance variable
    void get1()
    {
    	int pid=1001;//local variable
    	System.out.println("Welcome to the get1 function"+pid);
    	System.out.println("Your name is::"+pname);
    }
    void get2()
    {
    	System.out.println("Welcome to the get2 function"+pname);
    }
    void get3(int cid,String cname)
    {
    	System.out.println("Your data is::"+cid+""+cname);
    }
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1();
		s1.get2();
        s1.get3(2001,"mobile");
	}

}
