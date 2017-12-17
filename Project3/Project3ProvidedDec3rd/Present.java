import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * The (almost, but not quite fully) coded Present class allows for
 *   contruction, drawing, and "querying" of a Present. 
 * 
 * @author Stephen Blythe
 * @version 11/2017
 */
public class Present extends Actor
{
    private Color wrappingPaper;  // what color is the present?
    private int width;            // what is the width of the present?
    private int height;           // what is the height of the present?
    private int peeks;            // how many times has this present been examined?
    private  Present[] b;    
    /**
     * Constructor for a Present
     * 
     * @param width - the width of the present
     * @param height - the height of the present
     * @param col - the color of the present
     */
    public Present(int width, int height, Color col)
    {
        // presents have minimum wdth and height
        this.width = Math.max(10,width);  
        this.height = Math.max(10,height);
        
        // initially, a present has not been examined
        peeks = 0;
        
        // build an image for the present
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(col);
        
        // draw main wrapping paper around present
        img.fill();
        
        // draw yellow ribbn around present
        img.setColor(Color.YELLOW);
        
        img.fillRect(width/2 - 3, 0, 6, height);
        img.fillRect(0, height/2 - 3, width, 6);
        
        // use the image we just created
        setImage(img);
        
        // remember the color of this present
        wrappingPaper = col;
    }
    
    /**
     * getColor returns the wrapping paper color
     * @return the color of the wrapping paper
     */
    public Color getColor() {return wrappingPaper;}
    
    /**
     * getHeight returns the height of the present
     * @return the height of the present
     */
    public int getHeight() {return height;}
    
    /** 
     * getWidth returns the width of the present
     * @return the width of the present
     */
    public int getWidth() {return width;}
    
    /**
     * getPeeks returns the number of times this prent was examined
     * @return the number of peeks for this Present
     */
    public int getPeeks() {return peeks;}
   
    
    /**
     * Act - whenever clicked, a present gets examined and a tooltip showing
     *    this Present's height, width, and number of peeks
     */
    public void act() 
    {
        // if the mouse is being clicked on this Present ...
        if ( Greenfoot.mouseClicked(this) )
        {   
            peeks++; // ... we've examined this Present one more time.             
            String[] a = new String[3];
            a[0]="Height: "+ getHeight(); 
            a[1]="Width: " + getWidth();            
            a[2]="Peeks: " + getPeeks();
            ToolTip toolTip = new ToolTip(a, 75);
            
            MyWorld w = (MyWorld) this.getWorld();
            w.addObject(toolTip, this.getX(), getY());
            // ***** YOU MUST ADD CODE AFTER THIS *****
            //   pop up a tool tip with three lines, one for height, one for width, 
            //   and one for peeks. The tool tip should "live" for 75 act calls. The
            //   tool tip should appear where the Present is located. 
            
        }
    }  
    
    public int getArea() {return width * height;}
    
}
