import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Croc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Croc extends Actor
{
    /**
     * Act - do whatever the Croc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.move(1);
        
        if (Greenfoot.isKeyDown("right"))
            this.turn(1);
        if (Greenfoot.isKeyDown("left"))
            this.turn(-1);    
            
        Leaf hittingLeaf;
        hittingLeaf = (Leaf) this.getOneIntersectingObject(Leaf.class);
        
        if (hittingLeaf!=null)
            System.out.println(hittingLeaf.getX());
        
    }    
}
