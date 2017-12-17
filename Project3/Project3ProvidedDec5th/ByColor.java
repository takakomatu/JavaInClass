import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class ByColor is a subclass of Button.
 * 
 * @author Takaaki Komatsu
 * @version 12/06/2017
 */
public class ByColor extends Button
{
    /**
     * Constructor for objects of class ByColor.
     * 
     */
    public ByColor(){
        super("By Color");        
    }
    
    /**
     * When byColor button is pressed, this will be executed and arrange the presents in the world according to its color, red, green and blue.
     */    
    public void handle(){
        MyWorld w = (MyWorld) this.getWorld();
        w.byColor();
    }
}
