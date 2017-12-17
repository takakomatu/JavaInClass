import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.FileDialog;
import java.io.*;
import java.util.Scanner;

/**
 * Write a description of class MyWorld here. no creating method in myWorld can be wrong
 * 
 * @author Stephen Blythe
 * @version 11/2017
 */
public class MyWorld extends World
{
    private  Present[] arrayPresent;
    private int sumWidth;
    private int sumHeight;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); //super calls World class constructer, 800 width, 600 height
        sumWidth = 0;
        sumHeight = 100;        
        Load load = new Load();        
        this.addObject(load, 500, 10);// put the load              
        ByPeeks byPeeks = new ByPeeks();        
        this.addObject(byPeeks, 100, 10);// put the load              
        ByArea byArea = new ByArea();        
        this.addObject(byArea, 200, 10);// put the load              
        ByColor byColor = new ByColor();        
        this.addObject(byColor, 300, 10);// put the load             
        Add add = new Add();        
        this.addObject(add, 400, 10);// put the load      
        arrayPresent = new Present[10000];
        
        //arrayPresent[0].getPeeks();//like this
    }
    /**
     * return how much ratio in the rectangleMeter is.
     * @return ratio in the rectangleMeter
     * 
     */
    public void byPeeks(){   
        
    }
    /**
     * return how much ratio in the rectangleMeter is.
     * @return ratio in the rectangleMeter
     * 
     */
    public void add(){    
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

        int width, height;
        while(reader.hasNext())//read content of a file that a user selected
        {
            String redBlueGreen = reader.next();//read the string in a file
            if(redBlueGreen.equals("red")){//if string that was read was "red"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double halfWidth = width /2.0;
                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location
                boolean ifStartNewLine = sumWidth+halfWidth >= this.getWidth();
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;       
                    sumWidth = 0;
                }
                Present red = new Present(width, height, Color.RED);//make a object of Restaurant       
                this.addObject(red, (int) (sumWidth + halfWidth), sumHeight);//add the object above accoring to width and height 
                sumWidth = sumWidth + width;                
            }    
            else if(redBlueGreen.equals("blue")){//if string that was read was "blue"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double halfWidth = width /2.0;                
                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location
                boolean ifStartNewLine = sumWidth+halfWidth >= this.getWidth();
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;     
                    sumWidth = 0;
                }                    
                Present blue = new Present(width, height, Color.BLUE);//make a object of Restaurant       
                this.addObject(blue, (int) (sumWidth + halfWidth), sumHeight);//add the object above accoring to width and height 
                sumWidth = sumWidth + width;            
            }                        
            else if(redBlueGreen.equals("green")){//if string that was read was "green"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double halfWidth = width /2.0;                                
                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location
                boolean ifStartNewLine = sumWidth+halfWidth >= this.getWidth();
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;    
                    sumWidth = 0;
                }                    
                Present green = new Present(width, height, Color.GREEN);//make a object of Restaurant       
                this.addObject(green, (int) (sumWidth + halfWidth), sumHeight);//add the object above accoring to width and height 
                sumWidth = sumWidth + width;            
            }
        }
        reader.close();        
    }
    
    /**
     * return how much ratio in the rectangleMeter is.
     * @return ratio in the rectangleMeter
     * 
     */
    public void load(){
        this.removeObjects(this.getObjects(Present.class));//remove objects of Present from the world    
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
        sumWidth = 0;
        sumHeight = 100;              
        int width, height;
        while(reader.hasNext())//read content of a file that a user selected
        {
            String redBlueGreen = reader.next();//read the string in a file
            if(redBlueGreen.equals("red")){//if string that was read was "red"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double halfWidth = width /2.0;
                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location
                boolean ifStartNewLine = sumWidth+halfWidth >= this.getWidth();
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;       
                    sumWidth = 0;

                }
                Present red = new Present(width, height, Color.RED);//make a object of Restaurant       
                this.addObject(red, (int) (sumWidth + halfWidth), sumHeight);//add the object above accoring to width and height 
                sumWidth = sumWidth + width;                
            }    
            else if(redBlueGreen.equals("blue")){//if string that was read was "blue"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double halfWidth = width /2.0;                

                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location
                boolean ifStartNewLine = sumWidth+halfWidth >= this.getWidth();
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;     
                    sumWidth = 0;
                }                    
                Present blue = new Present(width, height, Color.BLUE);//make a object of Restaurant       
                this.addObject(blue, (int) (sumWidth + halfWidth), sumHeight);//add the object above accoring to width and height 
                sumWidth = sumWidth + width;            
            }            
            
            else if(redBlueGreen.equals("green")){//if string that was read was "green"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double halfWidth = width /2.0;                                
                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location
                boolean ifStartNewLine = sumWidth+halfWidth >= this.getWidth();
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;    
                    sumWidth = 0;

                }                    
                Present green = new Present(width, height, Color.GREEN);//make a object of Restaurant       
                this.addObject(green, (int) (sumWidth + halfWidth), sumHeight);//add the object above accoring to width and height 
                sumWidth = sumWidth + width;            
            }
        }
        reader.close();
    }

    public void keepTrackOfSum(){
        
    }
    
     //try to modify array of presents only in mywolrld.
     public void addPresentArray(){
        
     }     
     
     public void resetPresentArray(){
        
     }
}
