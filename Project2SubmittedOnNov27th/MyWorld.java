import java.util.Scanner;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.awt.FileDialog;

/**
 * MyWorld - MyWorld for CSC14400 project#2
 * 
 * @author Takaaki Komatsu 
 * @version 10/25/2017
 */
public class MyWorld extends World
{
    private RectangleMeter rectangleMeter;//declare an instance variable called rectangleMeter
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);//make the world 800x600 "boxes", with 1 box being 1 pixel wide and 1 pixel high
        rectangleMeter = new RectangleMeter(100);//RectangleMeter with height 100
        this.addObject(rectangleMeter, 10, 550);// put the RectangleMeter in the lower left corner 
    }
    
    /**
     * Act - do whatever the MyWorld wants to do. This method is called whenever 
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        if(Greenfoot.isKeyDown("L")){
            this.removeObjects(getObjects(FoodTruck.class));//remove objects of FoodTruck from the world            
            this.removeObjects(getObjects(StationaryRestaurant.class));//remove objects of StationaryRestaurant from the world               
            this.removeObjects(getObjects(Restaurant.class));//remove objects of Restaurant from the world            
            this.removeObjects(getObjects(Connector.class));//remove objects of Connector from the world                           
            FileDialog fd = null;//Im trying to have a user select a file properly in the code below
            fd = new FileDialog(fd , "CSC 144 File Chooser" , FileDialog.LOAD );
            fd.setVisible(true);
            String fileName = fd.getFile();
            String directoryName = fd.getDirectory();
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
            
            while(reader.hasNext())//read content of a file that a user selected
            {
                String stationOrTruck = reader.next();//read the string in a file
                int xLoc = 0;//give location of x FOR NOW
                int yLoc = 0;//give location of y FOR NOW
                if(stationOrTruck.equals("Stationary")){//if string that was read was "Stationary"
                    xLoc = reader.nextInt();//read the first number of Stationary in a file and assign that number to xLoc as a value of x location
                    yLoc = reader.nextInt();//read the second number of Stationary in a file and assign that number to yLoc as a value of y location
                    Restaurant restaurant = new Restaurant();//make a object of Restaurant       
                    addObject(restaurant, xLoc, yLoc);//add the object above accoring to xLoc and yLoc     
                    restaurant.setImage("restaurant.png");//give the object image "restaurant.png" 
                }    
                else if(stationOrTruck.equals("Truck")){//if string that was read was "Truck"
                    double xSpeed = reader.nextDouble();//read the first number of Truck in a file and assign that number to xSpeed as a value of x speed
                    double ySpeed = reader.nextDouble();//read the second number of Truck in a file and assign that number to ySpeed as a value of y speed
                    xLoc = reader.nextInt();//read the third number of Truck in a file and assign that number to xLoc as a value of x location
                    yLoc = reader.nextInt();//read the fourth number of Truck in a file and assign that number to yLoc as a value of y location
                    FoodTruck foodTruck = new FoodTruck(xSpeed, ySpeed, xLoc, yLoc);//make a object of FoodTruck
                    addObject(foodTruck, xLoc, yLoc);//add the object above accoring to xLoc and yLoc       
                    foodTruck.setImage("bus_01.png");//give the object image "bus_01.png"     
                }
            }
            reader.close();
        }
    }
    
    /**
     * return how much ratio in the rectangleMeter is.
     * @return ratio in the rectangleMeter
     * 
     */
    public double getRectangleMeter()
    {
        double ratio;
        ratio = rectangleMeter.getFilledRatio();
        return ratio;
    }
}
