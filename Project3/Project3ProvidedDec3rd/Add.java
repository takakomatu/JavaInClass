import java.util.Scanner;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.FileDialog;
import java.io.*;

/**
 * Add - Add button for CSC14400 project#3
 * 
 * @author Takaaki Komatsu
 * @version 12/02/2017
 */
public class Add extends Button
{
    /**
     * Act - do whatever the Add wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Add(){
        super("Add");  
    }
    
    /**
     * Act - do whatever the Load wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.         do I need a comment like this??????
     */    
    public void handle(){
        MyWorld w = (MyWorld) this.getWorld();
        w.add();
    }    
}
