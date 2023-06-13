package read.file.techniques;
import java.awt.Desktop;
import java.io.*;

public class openfileusingDesktop {
	
	public static void main(String args[])
	{
		String path = "C:\\Users\\91638\\Downloads\\Bharath_resume.pdf";
		File file = new File(path);
		
		try 
		{
			if( !Desktop.isDesktopSupported()) {
				System.out.println("desktop not supported");
			}
			
			Desktop ds = Desktop.getDesktop();
			ds.open(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
