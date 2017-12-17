import java.util.Scanner;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.FileDialog;
import java.io.*;

/**
 * Load - third button for CSC14400 project#3
 * 
 * @author Takaaki Komatsu
 * @version 12/02/2017
 */

public class Load extends Button
{

    /**
     * Act - do whatever the Load wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Load(){
        super("Load");    

    }
    
    /**
     * Act - do whatever the Load wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.         do I need a comment like this??????
     */    
    public void handle(){
        MyWorld w = (MyWorld) this.getWorld();        
        w.removeObjects(w.getObjects(Present.class));//remove objects of Present from the world    
        FileDialog file = null;//Im trying to have a user select a file properly in the code below
        file = new FileDialog(file , "CSC 144 File Chooser" , FileDialog.LOAD );
        file.setVisible(true);
        String fileName = file.getFile();
        String directoryName = file.getDirectory();
        String fullFileName = directoryName + fileName;
        File myFile = new File(fullFileName);
        Scanner reader=null;
        try
        {
            reader= new Scanner(myFile);
        }
        catch (FileNotFoundException e)//catch FileNotFoundException
        {
            System.out.println("Bad user error.");
            return;
        }
        catch (NullPointerException e)//catch NullPointerException
        {
            System.out.println("NPE");
        }
        int sumWidth = 0;
        int sumHeight = 100;              
        int width, height;
        while(reader.hasNext())//read content of a file that a user selected
        {
            String redBlueGreen = reader.next();//read the string in a file
            if(redBlueGreen.equals("red")){//if string that was read was "red"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double xLoc = width /2.0;
                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location

                if(sumWidth >= w.getWidth()){
                    sumHeight = sumHeight + 100;       
                    sumWidth = 0;
                    sumWidth = sumWidth + width;                                                        
                }
                Present red = new Present(width, height, Color.RED);//make a object of Restaurant       
                w.addObject(red, (int) (sumWidth + xLoc), sumHeight);//add the object above accoring to width and height 
                sumWidth = sumWidth + width;                
            }    
            else if(redBlueGreen.equals("blue")){//if string that was read was "blue"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double xLoc = width /2.0;                

                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location
                if(sumWidth >= w.getWidth()){
                    sumHeight = sumHeight + 100;     
                    sumWidth = 0;
                    sumWidth = sumWidth + width;                                    
                }                    
                Present blue = new Present(width, height, Color.BLUE);//make a object of Restaurant       
                w.addObject(blue, (int) (sumWidth + xLoc), sumHeight);//add the object above accoring to width and height 
                sumWidth = sumWidth + width;                                
            }            
            
            else if(redBlueGreen.equals("green")){//if string that was read was "green"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double xLoc = width /2.0;                                
                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location
                if(sumWidth >= w.getWidth()){
                    sumHeight = sumHeight + 100;    
                    sumWidth = 0;
                    sumWidth = sumWidth + width;                                                        
                }                    
                Present green = new Present(width, height, Color.GREEN);//make a object of Restaurant       
                w.addObject(green, (int) (sumWidth + xLoc), sumHeight);//add the object above accoring to width and height 
                sumWidth = sumWidth + width;                
            }
        }
        reader.close();
    }
}
