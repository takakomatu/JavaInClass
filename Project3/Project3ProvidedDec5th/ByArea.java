import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class ByArea is a subclass of Button.
 * 
 * @author Takaaki Komatsu
 * @version 12/06/2017
 */
public class ByArea extends Button
{
    /**
     * Constructor for objects of class ByArea.
     * 
     */
    public ByArea(){
        super("By Area");        
    }
    
    /**
     * when the byArea Button is clicked sort presents by its size
     */    
    public void handle(){
        MyWorld w = (MyWorld) this.getWorld();
        w.byArea();
    }
      
}
