import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GolfBall - the golf ball for CSC14400 project#1
 * 
 * @author Stephen Blythe
 * @version 9/2017
 * 
 * NOTE: You **WILL** want to add code to this class in various locations!!!
 */
public class GolfBall extends Actor
{


    
    public GolfBall(double xVel, double yVel)
    {

    }

    
    /**
     * getBallImage - gets image of a black circle filled with white. 
     * 
     * @return a new golf ball image. 
     * 
     *   YOU WILL LIKELY WANT TO CALL THIS METHOD FROM YOUR CONSTRUCTOR AND POSSIBLY ELSEWHERE,
     *      ALTHOUGH YOU ARE ***NOT*** REQUIRED TO DO SO
     */
    public GreenfootImage getBallImage()
    {
        // build a (small) image for the golf ball
        GreenfootImage img = new GreenfootImage(15,15);
        
        // draw white circle for golf ball. 
        img.setColor(Color.WHITE);
        img.fillOval(0,0,14,14);
        
        // draw black outline of golf ball
        img.setColor(Color.BLACK);
        img.drawOval(0,0,14,14);
        img.drawOval(1,1,12,12);
        
        // return the image we just built. 
        return img;
    }
    
    protected void addedToWorld(World w){
        this.setImage(this.getBallImage());
    }
        
    /**
     * getRightArrowImage - gets image of an arrow pointing to the right
     * 
     * @param col - the color to draw the arrow with. 
     * @return a new right arrow image. 
     * 
     *   YOU WILL LIKELY WANT TO CALL THIS METHOD FROM YOUR ACT METHOD AND POSSIBLY ELSEWHERE,
     *      ALTHOUGH YOU ARE ***NOT*** REQUIRED TO DO SO
     */
    public GreenfootImage getRightArrowImage( Color col )
    {
        // build a (small) image for the arrow image
        GreenfootImage img = new GreenfootImage(22,15);
        
        img.setColor( col ); // use requested color
        
        img.fillRect(0,6, 15, 2);
        
        img.drawLine(7,0, 14, 6);
        img.drawLine(6,0, 13, 6);
        
        img.drawLine(7,14, 14,7);
        img.drawLine(6,14, 13,7);
        
        
        // return the image we just built. 
        return img;
    }
    
    /**
     * Act - do whatever the GolfBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        boolean f = Greenfoot.isKeyDown("space");//gonna be true if user hits space
        if (f){
            this.move(100);
        }//right now its in golfBall so this refers to golfball
    }//and act() is in  golfBall class, so methods inside need to be called with the object that is in type GolfBall
}
