import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sheep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sheep extends Actor
{
    /**
     * Act - do whatever the Sheep wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     /*
        if ( (this.getX()<=0) || 
             (this.getX() >= this.getWorld().getWidth()-1)
           )
           */
        if ( this.isAtEdge() )
        {   
            this.turn(1);
        
        }
        
        this.move(1);
        
        
    }    
}
