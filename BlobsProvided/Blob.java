import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 // uncomment if Greenfoot version < 3.1
import java.util.List;

/**
 * Write a description of class Blob here.
 * 
 * @author Stephen Blythe
 * @version 11/2017
 */
public class Blob extends Actor
{
    private double radius;   // radius of the blob
    
    private double actualX; // true X location
    private double actualY; // true Y location
    
    private double speedX; // current speed in x direction
    private double speedY; // current speed in y direction
    
    /**
     * constructor that builds a new blob of a specified
     * radius
     * 
     * @param radius - the radius of the new blob.
     */
    public Blob(double blobRadius, double xVel, double yVel)
    {
        radius = blobRadius;
        
        // set initial speeds
        speedX = xVel;
        speedY = yVel;
        
        redraw();  // initialy draw image
    }
    
    // used to store correct location after object added to world
    protected void addedToWorld(World w)
    {
        // (at start,) actual location is just what Greenfoot thinks 
        //    location is
        actualX = getX();
        actualY = getY();
    }
    
    // redraw generates a new image for this blob
    private void redraw()
    {
        // build an image big enough to hold blob
        int diameter = (int) (2*radius);
        GreenfootImage img = new GreenfootImage(diameter, diameter);

        // draw a blue circle of appropriate size
        img.setColor(Color.BLUE);
        img.fillOval(0,0,diameter,diameter);
        
        // use this as blob's image
        setImage(img);
    }

    // basic movement code for a Blob
    private void move()
    {
        // move this blob ...
        actualX += speedX;
        actualY += speedY;
        
        // if blob "fell through" left or right side ...
        if (actualX > getWorld().getWidth()-1)
            actualX=0;
        else if (actualX < 0)
            actualX = getWorld().getWidth()-1;
        
        // if blob "fell through" top or bottom ...
        if (actualY > getWorld().getHeight()-1)
            actualY=0;
        else if (actualY < 0)
            actualY = getWorld().getHeight()-1;
        
        // let Greenfoot know where we just moved
        setLocation( (int) actualX, (int) actualY );        
    }
    
    /**
     * Act - do whatever the Blob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        join();
        move();
    }
    
    private void join()
    {
        List<Blob> touchingBlobs = getIntersectingObjects(Blob.class);
        
        for (Blob touchedBlob : touchingBlobs)
        {
            radius += touchedBlob.radius; // add one of the other blobs into this one
            
            speedX += touchedBlob.speedX;
            speedY += touchedBlob.speedY;
            
            getWorld().removeObject(touchedBlob);
            
        }
        
        redraw();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
