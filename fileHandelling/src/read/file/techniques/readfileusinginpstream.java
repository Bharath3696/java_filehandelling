package read.file.techniques;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readfileusinginpstream {
	
	
	public static void main(String args[])
	{
		File file;
		FileInputStream ip = null;
		String ph = "C:\\Users\\91638\\Desktop\\imp.txt";
		
		try {
			file = new File(ph);
			ip = new FileInputStream(file);
			
			int m=0;
			while((m=ip.read()) !=-1)
			{
				System.out.print((char)m);
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try {
				ip.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
