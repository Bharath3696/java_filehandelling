package read.file.techniques;

import java.io.File;
import java.util.Scanner;

public class readfileUsingScanner {
	
	public static void main(String args[])
	{
	
	Scanner sc = null;;
	String path = "C:\\Users\\91638\\Desktop\\imp.txt";
	
	try
	{
	File file = new File(path);
	
	sc = new Scanner(file);
	
	System.out.println("printing the content");
	
	
	
	while(sc.hasNext())
	{
		System.out.println(sc.nextLine());
	}
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	finally
	{
		try {
			sc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

}
