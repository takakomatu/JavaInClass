import java.util.Scanner;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.FileDialog;
import java.io.*;

/**
 * Add - Add button for CSC14400 project#3
 * 
 * @author Takaaki Komatsu
 * @version 12/02/2017
 */
public class Add extends Button
{
    private int sumWidth;
    private int sumHeight;
    private boolean loadWasDone;    
    /**
     * Act - do whatever the Add wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Add(){// or use loadWasDoneBefore()??
        super("Add");  
        sumHeight =100;
    }
    
    /**
     * return how much ratio in the rectangleMeter is.
     * @return ratio in the rectangleMeter
     * 
     */
    public int saveSumWidth(){// or use loadWasDoneBefore()
        return sumWidth;
    }    
    
    /**
     * return how much ratio in the rectangleMeter is.
     * @return ratio in the rectangleMeter
     * 
     */
    public int sumHeight(){
        return sumHeight;
    }
    
    public void handle(){
        MyWorld w = (MyWorld) this.getWorld();        
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

        if(loadWasDoneBefore()){
            sumWidth = 0;
            sumHeight = 100;
        }
        int width, height;
        while(reader.hasNext())//read content of a file that a user selected
        {
            String redBlueGreen = reader.next();//read the string in a file
            if(redBlueGreen.equals("red")){//if string that was read was "red"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double halfWidth = width /2.0;
                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location
                boolean ifStartNewLine = sumWidth+halfWidth >= w.getWidth();
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;       
                    sumWidth = 0;
                }
                Present red = new Present(width, height, Color.RED);//make a object of Restaurant       
                w.addObject(red, (int) (sumWidth + halfWidth), sumHeight);//add the object above accoring to width and height 
                sumWidth = sumWidth + width;                
            }    
            else if(redBlueGreen.equals("blue")){//if string that was read was "blue"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double halfWidth = width /2.0;                
                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location
                boolean ifStartNewLine = sumWidth+halfWidth >= w.getWidth();
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;     
                    sumWidth = 0;
                }                    
                Present blue = new Present(width, height, Color.BLUE);//make a object of Restaurant       
                w.addObject(blue, (int) (sumWidth + halfWidth), sumHeight);//add the object above accoring to width and height 
                sumWidth = sumWidth + width;            
            }                        
            else if(redBlueGreen.equals("green")){//if string that was read was "green"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double halfWidth = width /2.0;                                
                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location
                boolean ifStartNewLine = sumWidth+halfWidth >= w.getWidth();
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;    
                    sumWidth = 0;
                }                    
                Present green = new Present(width, height, Color.GREEN);//make a object of Restaurant       
                w.addObject(green, (int) (sumWidth + halfWidth), sumHeight);//add the object above accoring to width and height 
                sumWidth = sumWidth + width;            
            }
        }
        loadWasDone = false;                
        reader.close();
    }
    /*        List<Restaurant> rangeRestaurant = this.getObjectsInRange((int)power, Restaurant.class);//get a list of Restaurant objects, storing them into the variable rangeRestaurant      
        List<Connector> rangeConnector = w.getObjects(Connector.class);//get a list of Connector objects, storing them into the variable rangeConnector 
        boolean onceconnectorIsThere = true;//once connectors are added in the world, onceconnectorIsThere is true        
        for(Restaurant restaurantFor : rangeRestaurant){//this enhanced for loop repeats once for each item in its list. each time the loop repeats, it chooses another item from the list, rangeRestaurant and places it into the variable called restaurantFor
            onceconnectorIsThere = true;//onceconnectorIsThere should be true unless con is equivalent to connectorFor
            Connector con = new Connector(this, restaurantFor);//create a Connector object
            for(Connector connectorFor : rangeConnector){//this enhanced for loop repeats once for each item in its list. each time the loop repeats, it chooses another item from the list, rangeConnector and places it into the variable called connectorFor 
                if(con.sameAs(connectorFor))//if con is equivalent to connectorFor, if(onceconnectorIsThere) won't be executed
                    onceconnectorIsThere = false;
            }
            if(onceconnectorIsThere){//this is true unless con isn't equivalent to connectorFor 
                w.addObject(con, 10, 550);//this is executed unless con isn't equivalent to connectorFor
            }
        }//this for loop's purpose is to add connectors properly in the world
        
        //Im trying to remove connectors properly in the code below
        for(Connector connectorFor : rangeConnector){//this enhanced for loop repeats once for each item in its list. each time the loop repeats, it chooses another item from the list, rangeConnector and places it into the variable called connectorFor
            if(connectorFor.getLength()>w.getRectangleMeter()*1000){//if the length of a connector is bigger than ratio*1000
                w.removeObject(connectorFor);//remove connectorFor from the world 
            }
        }//this for loop's purpose is to remove connectors properly in the world
    }    
*/
    /**
     * return how much ratio in the rectangleMeter is.
     * @return ratio in the rectangleMeter
     * 
     */
    public boolean loadWasDoneBefore(){
        return loadWasDone;
    }        
}
