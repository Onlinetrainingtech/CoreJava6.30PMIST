import java.text.DateFormat;


import java.util.*;

public class Sample {

	public static void main(String[] args) {
		
		
		DateFormat df=DateFormat.getTimeInstance(DateFormat.LONG,new Locale("ch","AU"));
		
		String d2=df.format(new Date());
		
		System.out.println(d2);
	}

}
