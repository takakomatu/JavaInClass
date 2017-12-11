import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Cool core of project #1 here
 * 
 * @author Stephen Blythe 
 * @version 10/2017
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld. This is easy!
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        VelocityMover car1= new VelocityMover(0.2, 0.1);
        this.addObject(car1, 50, 75);
        
        VelocityMover car2= new VelocityMover(-0.1, 1.1);
        this.addObject(car2, 150, 200);
    }
    
}






