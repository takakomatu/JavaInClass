import java.util.Scanner;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.FileDialog;
import java.io.*;

/**
 * Class Add is a subclass of Button.
 * 
 * @author Takaaki Komatsu
 * @version 12/06/2017
 */
public class Add extends Button
{
    /**
     * Constructor for objects of class Add.
     * 
     * 
     */
    public Add(){
        super("Add");  
    }
    
    /**
     * when the Add Button is clicked, add presents according to the selected file
     */    
    public void handle(){
        MyWorld w = (MyWorld) this.getWorld();
        w.add();
    }    
}
