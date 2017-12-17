import java.util.Scanner;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.FileDialog;
import java.io.*;

/**
 * Load - third button for CSC14400 project#3
 * 
 * @author Takaaki Komatsu
 * @version 12/02/2017
 */

public class Load extends Button
{
    /**
     * Act - do whatever the Load wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Load(){
        super("Load");    

    }
    
    /**
     * Act - do whatever the Load wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.         do I need a comment like this??????
     */    
    public void handle(){
        MyWorld w = (MyWorld) this.getWorld();
        w.load();
    }
}
