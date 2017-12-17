import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class ByPeeks is a subclass of Button.
 * 
 * @author Takaaki Komatsu
 * @version 12/06/2017
 */
public class ByPeeks extends Button
{
    /**
     * Constructor for objects of class ByPeeks.
     * 
     */
    public ByPeeks(){
        super("By Peeks");        
    }
    
    /**
     * when the ByPeeks Button is clicked sort presents by the number of peeks
     */    
    public void handle(){
        MyWorld w = (MyWorld) this.getWorld();
        w.byPeeks();
    }
}
