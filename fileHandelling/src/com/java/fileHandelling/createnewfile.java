package com.java.fileHandelling;
// here we will create file using java in three different ways
/*
 *     1. using File
 *     2. using FileOutputStream
 *     3. using java nio
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class createnewfile {
	
	public static void main(String args[])
	{
		
			createnewfile uk = new createnewfile();
			uk.usingFIle();
			//uk.usingFileop();
			uk.usingNio();
	}
	
	public void usingFIle()
	{
		String path = "A:\\test.txt";
		File ff = new File(path);
		
		try
		{
		boolean flag = ff.createNewFile();
		
		if(flag == true)
		{
			System.out.println(" created ");
		}
		
		else
		{
			System.out.println(" Error file is there already !");
		}}
		catch(IOException e)
		{
			System.out.println("some exception occured");
			e.printStackTrace();
		}
	}
	
	public void usingFileop()
	{
		//String path_a = "A:\\test.txt";
		
		try {
			
			System.out.println("enter the destination with file name");
			Scanner sc = new Scanner(System.in);
			String path_a =  sc.nextLine();
			System.out.println(path_a);
			FileOutputStream kl = new FileOutputStream(path_a, true);
			System.out.println("enter the content");
			//Scanner cv = new Scanner(System.in);
			String conten = sc.nextLine();			
			 byte bk[]= conten.getBytes();
			 
			 try {
				kl.write(bk);
				kl.close();
			} 
			 catch (IOException e) {
				
				e.printStackTrace();
			}
		    } 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
	}
	
	public void usingNio()
	{
		Path kk = Paths.get("A:\\samplenio.txt");
		
		try {
			Path kf = Files.createFile(kk);
			
			System.out.println("check" + kf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
