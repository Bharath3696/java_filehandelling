package read.file.techniques;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readfileusingFileReader {
	
	public static void main(String args[])
	{
	
	FileReader bk = null;
	String path = "C:\\Users\\91638\\Desktop\\imp.txt";
	
	try
	{
	File file = new File(path);
	
	bk = new FileReader(file);
	
	System.out.println("printing the content");
	
	int e =0;
	
	while((e=bk.read()) != -1)
	{
		System.out.print((char)e);
	}
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	finally
	{
		try {
			bk.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
}
