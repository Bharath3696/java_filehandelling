package com.java.fileHandelling;
import java.io.*;

public class copyfile {
	
	public static void main(String args[])
	{
		copyandnew();
	}
	
	public static void copyandnew()
	{
		
		File inf = new File("C:\\Users\\91638\\Downloads\\Bharath_resume.pdf");
		File opf = new File("C:\\Users\\91638\\Downloads\\copydample.pdf");
		
		FileInputStream ip = null;
		FileOutputStream op= null;
		
		try {
			ip = new FileInputStream(inf);
			op = new FileOutputStream(opf);
		    } 
		
		catch (FileNotFoundException e) 
		    {	
			e.printStackTrace();
		    }
		
		try {
			System.out.println(ip.available());
		    }
		
		catch (IOException e) 
		   {
			e.printStackTrace();
		   }
		
		int i =0;
		try {
			while((i=ip.read()) != -1)
			{
				op.write(i);;
			}
		    } 
		catch (IOException e) 
		    {	
			e.printStackTrace();
		    }
		
		finally
		{
			if(ip != null)
			{
				try {
					ip.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
			if (op != null)
			{
				try {
					op.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
