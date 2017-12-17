import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.FileDialog;
import java.io.*;
import java.util.Scanner;

/**
 * Write a description of class MyWorld here.
 * 
 * @author Stephen Blythe
 * @version 11/2017
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); //super calls World class constructer, 800 width, 600 height
        Load load = new Load();        
        this.addObject(load, 500, 10);// put the load              
        ByPeeks byPeeks = new ByPeeks();        
        this.addObject(byPeeks, 100, 10);// put the load              
        ByArea byArea = new ByArea();        
        this.addObject(byArea, 200, 10);// put the load              
        ByColor byColor = new ByColor();        
        this.addObject(byColor, 300, 10);// put the load             
        Add add = new Add();        
        this.addObject(add, 400, 10);// put the load              
    }
 
}
