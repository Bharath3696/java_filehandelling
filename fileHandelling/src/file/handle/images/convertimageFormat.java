package file.handle.images;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.*;
import java.io.*;

import javax.imageio.ImageIO;

public class convertimageFormat {

	
	public static void main(String args[])
	{
		
		//	URL ul = new URL("https://static3.toyotabharat.com/images/homepage/banners/virtual-showroom-1920x807.jpg");
			String as = "C:\\Users\\91638\\Downloads\\IMG_20220312_155343.jpg";     //for image
			File gg = new File(as);
			 try {
				BufferedImage bj = ImageIO.read(gg);
				
				ImageIO.write(bj, "png", new File("C:\\Users\\91638\\Desktop\\her.png"));
			} 
			 catch (IOException e) {
				
				e.printStackTrace();
			}
	}
	
}
