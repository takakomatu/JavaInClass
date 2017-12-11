import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.FileDialog;
import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class MyWorld here.
 * 
 * @author Stephen Blythe
 * @version 11/2017
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("m") )
        {
            FileDialog dialog = null;
            dialog = new FileDialog(dialog, "Choose blob file", FileDialog.LOAD);
            dialog.setVisible(true);
            
            String fname = dialog.getDirectory() + dialog.getFile();
            
            File myFile = new File(fname);
            
            Scanner reader=null;
            
            try
            {
                reader = new Scanner(myFile);
            }
            catch (FileNotFoundException e)
            {
                System.out.println("I am sorry but " + fname + " is not a valid file!");
                return;
            }
            
            while( reader.hasNext() )
            {
                int xLoc = reader.nextInt();
                int yLoc = reader.nextInt();
                
                double radius = reader.nextDouble();
                
                double xSpeed = reader.nextDouble();
                double ySpeed = reader.nextDouble();
                
                Blob someBlob = new Blob (radius, xSpeed, ySpeed);
                addObject(someBlob, xLoc, yLoc);
            }
            
            reader.close();
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
