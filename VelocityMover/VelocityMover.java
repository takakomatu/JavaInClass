import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VelocityMover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VelocityMover extends Actor
{
    private double xSpeed; // current speed in x direction
    private double ySpeed; // current speed in y direction
    
    private double accurateX; // actual x location, better then Actor's
    private double accurateY; // actual y location, better then Actor's
    
    /**
     * build a VelocityMover with  an initial speed
     * 
     *   @param xVelocity initial speed in x direction
     *   @param yVelocity initial speed in y direction
     */
    public VelocityMover(double xVelocity, double yVelocity)
    {
        xSpeed = xVelocity;
        ySpeed = yVelocity; 
        
        
    }
    
    protected void addedToWorld(World w)
    {
        accurateX = getX();
        accurateY = getY();
    }
    
    /**
     * Act - do whatever the VelocityMover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {      
        accurateX = accurateX + xSpeed;
        accurateY = accurateY + ySpeed;
        
        //this.move(1);
        this.setLocation( (int) accurateX, (int) accurateY);
    }    
}








