package read.file.techniques;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class ReadfileusingNio {
	
	public static void main(String args[])
	{
		String path = "C:\\Users\\91638\\Desktop\\imp.txt";
		
		try
		{
			//File file = new File(path);
			
		List <String> ak=Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
		
		Iterator<String> it = ak.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
