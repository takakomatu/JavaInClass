import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class ButtonChild is a subclass of Button.
 * 
 * @Takaaki Komatsu
 * @version 11/2017
 */
public class ByPeeks extends Button
{
    public ByPeeks(){
        super("By Peeks");        
    }
    
    public void handle(){
        MyWorld w = (MyWorld) this.getWorld();
        w.byPeeks();
    }
}
