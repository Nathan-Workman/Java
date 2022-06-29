/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessing;
// Java program to demonstrate colored to negative conversion 
import java.io.File; 
import java.io.IOException; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO; 
  
public class Negative 
{ 
    public static void main(String args[])throws IOException 
    { 
        BufferedImage img = null; 
        BufferedImage img2 = null; 
        File f = null; 
        File gs= null; 
        boolean isgreen = false;
  
        // read image 
        try
        { 
            f = new File("C:\\Users\\workm\\Pictures\\Saved Pictures\\wall.jpg"); 
            gs = new File("C:\\Users\\workm\\Pictures\\Saved Pictures\\me2.jpg"); 
            img = ImageIO.read(f); 
            img2 = ImageIO.read(gs); 
        } 
        catch(IOException e) 
        { 
            System.out.println(e); 
        } 
  
        // Get image width and height 
        int width = img.getWidth(); 
        int height = img.getHeight(); 
 ////////////////////////////////////////////////////////////////////////////////   
         
        
        
        
        
      // System.out.println("Red Value: "+rgs + " " + "Green Value: "+ggs + " "+"nBlue Value: "+ bgs);
  ///////////////////////////////////////////////////////////////////////////////
       
     
        for (int y = 0; y < height; y++) 
        { 
            for (int x = 0; x < width; x++) 
            { 
                   //Get Green Screen Color
        int pgs = img2.getRGB(x,y); 
        
       int ags = (pgs>>24) & 0xff; 
       // get red 
        int rgs = (pgs>>16) & 0xff; 
  
        // get green 
        int ggs = (pgs>>8) & 0xff; 
  
        // get blue 
        int bgs = pgs & 0xff;
        
         
         //Testing, not important
            //int avgrgs = (rgs);
            //int avgggs = 
            //int avgbgs =
        
         //System.out.println("Red Value: "+rgs + " " + "Green Value: "+ggs + " "+"nBlue Value: "+ bgs);
         //givent green screen pixel value
                if (rgs <125 && ggs >80 && bgs <69){
                    isgreen = true;
                   //System.out.println(isgreen);
                  
                }
                else{
                    isgreen=false;
                     //System.out.println(isgreen);
                 }
            
               
    
                int p = img.getRGB(x,y); 
                int a = (p>>24)&0xff; 
                int r = (p>>16)&0xff; 
                int g = (p>>8)&0xff; 
                int b = p&0xff; 
  
                //Changes
                if (isgreen){
           
                img2.setRGB(x, y, p);           //Changes pixels from background to green screen photo
                }
                //set new RGB value 
                
            } 
        } 
  
        // write image 
        try
        { 
            gs = new File("C:\\Users\\workm\\Pictures\\Saved Pictures\\meout.jpg"); 
            ImageIO.write(img2, "jpg", gs); 
        } 
        catch(IOException e) 
        { 
            System.out.println(e); 
        } 
    } 
}
