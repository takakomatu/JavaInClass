import java.util.*;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * FoodTruck - food trucks for CSC14400 project#2
 * 
 * @author Takaaki Komatsu
 * @version 10/25/2017
 */
public class FoodTruck extends Restaurant
{
    private double xSpeed;//declare an instance variable called xSpeed and get the speed of x in FoodTruck
    private double ySpeed;//declare an instance variable called ySpeed and get the speed of y in FoodTruck
    private double xLoc;//declare an instance variable called xLoc and get the location of x in FoodTruck
    private double yLoc;//declare an instance variable called yLoc and get the location of y in FoodTruck
    /** 
     * constructor that builds a food truck with specified speeds. 
     * @param xVel - speed in x direction
     * @param yVel - speed in y direction
     * @param xLoc1 - location in x direction
     * @param yLoc1 - location in y direction
     * 
     * NOTE: you do not have to code or use this constructor if
     *     you do not want to. I am leaving it here as a strong
     *     hint as to what is likely the easiest way to go about
     *     constructing a food truck.
     */
    public FoodTruck(double xVel, double yVel, double xLoc1, double yLoc1){
        xSpeed = xVel;//speed in x direction
        ySpeed = yVel;//speed in y direction
        xLoc = xLoc1;//xLoc is the x location of foodTruck
        yLoc = yLoc1;//yLoc is the y location of foodTruck
    }
   
    /**
     * Act - do whatever the FoodTruck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        
        if(xLoc >= 799 || xLoc <= 0){//if foodTruck touches right or lest edge
            xSpeed = -1*xSpeed;//bounce off the sides in x direction
        }
        
        xLoc += xSpeed;//move the foodTruck in x direction
        
        if(yLoc >= 599 || yLoc <= 0){//if foodTruck touches upper or lower edge
            ySpeed = -1*ySpeed;//bounce off the sides in y direction
        }
        
        yLoc = ySpeed+yLoc;//move the foodTruck in y direction
        this.setLocation((int) xLoc, (int) yLoc);//put the foodTruck according to xLoc and yLoc
        
        MyWorld w;//Im trying to add connectors properly in the code below
        w = (MyWorld) getWorld();//getWorld() returns World but this should be MyWorld
        List<Restaurant> rangeRestaurant = this.getObjectsInRange((int)(w.getRectangleMeter()*1000), Restaurant.class);//get a list of Restaurant objects, storing them into the variable rangeRestaurant
        List<Connector> rangeConnector = w.getObjects(Connector.class); //get a list of Connector objects, storing them into the variable rangeConnector
        boolean onceConnectorIsThere = true;//once connectors are added in the world, onceConnectorIsThere is true
        for(Restaurant restaurantFor : rangeRestaurant){//this enhanced for loop repeats once for each item in its list. each time the loop repeats, it chooses another item from the list, rangeRestaurant and places it into the variable called restaurantFor
            onceConnectorIsThere = true;//OnceConnectorIsThere should be true unless con is equivalent to connectorFor
            Connector con = new Connector(this, restaurantFor);//create a Connector object

            for(Connector connectorFor : rangeConnector){//this enhanced for loop repeats once for each item in its list. each time the loop repeats, it chooses another item from the list, rangeConnector and places it into the variable called connectorFor 
                if(connectorFor.sameAs(con))//if con is equivalent to connectorFor, if(onceConnectorIsThere) won't be executed
                    onceConnectorIsThere = false;//create a Connector object
            }
            if(onceConnectorIsThere)//this is true unless con isn't equivalent to connectorFor
                w.addObject(con, 10, 550);//this is executed unless con isn't equivalent to connectorFor
        }   
        
        //Im trying to remove connectors properly in the code below
        for(Connector connectorFor : rangeConnector){//this enhanced for loop repeats once for each item in its list. each time the loop repeats, it chooses another item from the list, rangeConnector and places it into the variable called connectorFor
            if(connectorFor.getLength()>w.getRectangleMeter()*1000){//if the length of a connector is bigger than ratio*1000
                w.removeObject(connectorFor);//remove connectorFor from the world 
            }
        }
    }    
}
