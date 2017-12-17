import java.util.Scanner;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.FileDialog;
import java.io.*;

/**
 * Class Load is a subclass of Button.
 * 
 * @author Takaaki Komatsu
 * @version 12/06/2017
 */

public class Load extends Button
{
    /**
     * Constructor for objects of class Load.
     * 
     */
    public Load(){
        super("Load");    

    }
    
    /**
     * when the Load Button is clicked, load presents according to the selected file
     */    
    public void handle(){
        MyWorld w = (MyWorld) this.getWorld();
        w.load();
    }
}
