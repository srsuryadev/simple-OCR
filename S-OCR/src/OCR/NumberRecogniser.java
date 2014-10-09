package OCR;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class NumberRecogniser {

	
	private BufferedImage img;
	
	private int[][] pixels;
	
	
	public void predict(String path) throws IOException{
		processImage(path);
		evaluate();
	}
	
	public void processImage(String path) throws IOException{
		img=ImageIO.read(new File(path));
		pixels=new int[img.getHeight()][];
		
		for(int x=0;x<img.getHeight();x++){
			pixels[x]=new int[img.getWidth()];
			
			for(int y=0;y<img.getWidth();y++){
				
				pixels[x][y]=(int)(img.getRGB(x, y)==0xFFFFFFFF?0:1);
			}
		}
		
	}
	
	public void evaluate(){
		
		
	}
	
}
