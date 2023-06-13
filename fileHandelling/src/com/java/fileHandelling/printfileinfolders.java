package com.java.fileHandelling;
import java.io.*;

public class printfileinfolders {
	
	public static void main(String args[])
	{
	String path = "C:\\Users\\91638\\Downloads";
	File fn = new File(path);
	
	File listofFiles[] = fn.listFiles();
	
	for( File e : listofFiles)
	{
		if(e.isFile())
		{
			System.out.println("file "+ e.getName()+" "+e.getAbsolutePath());
		}
		else if(e.isDirectory())
		{
			System.out.println("directory "+e.getName());
		}
		
		else
		{
			System.out.println("item unknown "+e.getName());
		}
	}

	
	}
	

}
