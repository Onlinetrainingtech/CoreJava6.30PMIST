import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

class Demo
{
	void writeData()throws IOException
	{
		try(FileOutputStream fos=new FileOutputStream("D:\\abc1.txt"))
		{
			int i;
			String name="mohamed";
			byte b[]=name.getBytes();
			fos.write(b);
			System.out.println("FileInserted..");
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void readData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\abc1.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
	void copyData() throws IOException
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:\\abc1.txt");
			FileOutputStream fos=new FileOutputStream("D:\\abc2.txt");
			
			int i;
			while((i=fis.read())!=-1)
			{
				fos.write((byte)i);
			}
		}
		
		catch(FileNotFoundException t)
		{
			
		}
		System.out.println("Data Copy Sucessfully...");
	}
	void readtwoData()throws IOException
	{
		FileInputStream fis1=new FileInputStream("D:\\abc1.txt");
		FileInputStream fis2=new FileInputStream("D:\\abc2.txt");
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		int i;
		while((i=sis.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
	void filewriterp1() throws IOException
	{
		try
		{
			FileWriter fw=new FileWriter("D:\\abc3.txt");
			fw.write("Welcome");
			System.out.println("FileWriter Inserted");
			fw.close();
		}
		catch(FileNotFoundException t)
		{
			
		}
	}
}
public class Sample {

	public static void main(String[] args) throws IOException {
		
		
		Demo d1=new Demo();
		//d1.writeData();
		//d1.readData();
		//d1.copyData();
		//d1.readtwoData();
		d1.filewriterp1();

	}

}
