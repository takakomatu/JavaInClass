import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.*;

/**
 * Button is a template for a clickable  button. You do not want to create 
 *     any objects of type Button (actually you can NOT do so). Instead,
 *     you should create a new subclass that extends Button and 
 *         1) remove the subclass's act method
 *         2) add a default constructor that calls the parent (Button) 
 *              constructor to set the subclass button's label text. (hint: super)
 *         3) add a    public void handle()     method to perform what is to be
 *              done when the button is clicked
 *              
 *  *****************************************************************************
 *   Although you are welcome to do so, YOU SHOULD NOT NEED TO MODIFY THIS CODE. 
 *  ****************************************************************************
 * @author Stephen Blythe 
 * @version 11/2017
 */

public abstract class Button extends Actor
{
    private String name;      // text to be displayed in the button
    private boolean down;     // internal use; true if the button has been pressed "recently"
    private int downDuration; // how long to draw the button as "down". 
    
    /**
     * Button -- construct a new clickable button
     * 
     *   @param name the name of the button to create
     */
    public Button(String name)
    {
        this.name = name; // record the name of the button in our instance variable;
        down=false;       // button starts up
        downDuration=10;  // have default "down press" time be 10 act calls
        
        setUpImage();     // actually draw the button (it is up to start with
    }
    
    //
    //  setUpImage -- draw the button (as if it is not clicked)
    private void setUpImage()
    {
        // the string to add to the image (padded a little bit)
        String name = " " + this.name + " ";
        
        // make the image big enough to hold the string
        GreenfootImage img = new GreenfootImage(name.length()*7, 20);
        
        // fill the button with a gray background
        img.setColor(Color.GRAY);
        img.fillRect(0,0, img.getWidth()-1, img.getHeight()-1);
        
        // draw a border around the button.
        img.setColor(Color.BLUE);
        img.drawRect(0,0, img.getWidth()-1, img.getHeight()-1);
        img.drawRect(1,1, img.getWidth()-3, img.getHeight()-3);
        
        // "draw" (write) the name into the button
        img.drawString(name, 2,img.getHeight()-3);
        
        // use the image we just built.
        setImage(img); 
    }
    
    
    //
    //  setDownImage -- draw the button (as if it is clicked)
    private void setDownImage()
    {
        // the string to add to the image (padded a little bit)
        String name = " " + this.name + " ";
        
        // make the image big enough to hold the string
        GreenfootImage img = new GreenfootImage(name.length()*7, 20);
        
        // fill the button with a blue background
        img.setColor(Color.BLUE);
        img.fillRect(0,0, img.getWidth()-1, img.getHeight()-1);

        

        // draw a border around the button.
        img.setColor(Color.GRAY);
        img.drawRect(0,0, img.getWidth()-1, img.getHeight()-1);
        img.drawRect(1,1, img.getWidth()-3, img.getHeight()-3);
        
        // "draw" (write) the name into the button
        img.drawString(name, 2,img.getHeight()-3);
        
        // use the image we just built.
        setImage(img); 
    }
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // if the button is "down" (clicked) right now ...
        if (down)
        {
            // we are one act call closer to being "up"
            downDuration--;
            
            // in fact, if we are supposed to be up .... 
            if (downDuration<=0)
            {
                setUpImage();    // reset our image to the up image
                down=false;      // we are now no longer down
                downDuration=10; // reset down duration for furture click(s).
            }
        }

        // if the mouse has been clicked ...
        if (Greenfoot.mouseClicked(this))
        {
            // simulate click in GUI 
            setDownImage();
            down=true;

            handle(); // do whatever the button is supposed to do. 
        }
    } 
    
    /**
     * The handle method will do whatever the Button is intended to do
     *   *** remember to write your own version of this method in a 
     *   *** subclass !!!
     */
    public abstract void handle();
}
