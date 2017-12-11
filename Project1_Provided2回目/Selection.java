import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Graphics;
import java.awt.FontMetrics;
/**
 * Allows user to click this object to select it. Object is identified by a String. 
 * 
 * @author Stephen Blythe
 * @version 8/2017
 * 
 * 
 * REMEMBER - YOU ARE BEING PROVIDED WITH THIS CLASS. ALTHOUGH YOU ARE WELCOME TO MIDIFY IT,
 *   DOING SO IS ****HIGHLY**** INADVISABLE!!!!
 */
public class Selection extends Actor
{
    private String label;     // label for the selection box
    private boolean selected; // has this box been selected?
    
    /**
     * Constructor, builds selection box based on the specified String
     * 
     *   @param idLabel - the String labele for this selection box
     */
    public Selection(String idLabel)
    {
        label = " " + idLabel + " ";  // set box's label
        
        selected = false;             // default state is unselected
    }
    
    // "second half" of costructor ...
    //    NOTE: You do NTO need to understand the code here to use the class. It is part of
    //           private implementation. 
    protected void addedToWorld(World w)
    {
        // build font for this box, using it to figure out what the width of
        //   the box should be. This width varies with the label string and
        //   the font metrics invovled. 
        Font mono = new Font("MONOSPACED", true, false,  12);
        Graphics g = getWorld().getBackground().getAwtImage().createGraphics();
        FontMetrics fm = g.getFontMetrics(new java.awt.Font("MONOSPACED", java.awt.Font.BOLD,12));
        
        GreenfootImage img = new GreenfootImage(4+fm.stringWidth(label),4+fm.getHeight());
        img.setFont(mono);
        
        setImage(img);
        
        // fill the box appropriately
        redraw(Color.WHITE, Color.BLACK);
    }
    
    // redraws image used fr this object. Again, this is part of the private implementation,
    //     so you do not need to understand how this works in any way!
    private void redraw(Color bgColor, Color fgColor)
    {
        GreenfootImage img = getImage();
        
        // make background appropriate color
        img.setColor(bgColor);
        img.fill();
        
        img.setColor(fgColor);
        
        // add label to image
        img.drawString(label, 2,img.getHeight()-4);
        
        // draw a rectangle (border) around box
        img.drawRect(0,0,img.getWidth()-1, img.getHeight()-1 );
        
    }
    
    /**
     * returns value of label
     *  
     *  @return - the String value of the label
     */
    public String getLabel()
    {
        return label.trim();
    }
    
    /**
     * returns current state of selection box
     * 
     *  @return true, if this selection box is selected; flse if this selection box is not selected
     */
    public boolean isSelected()
    {
        return selected;
    }
    
    /**
     * look for mouse clicks on this selection box. When one is found, select this bx and deselect 
     *     all others.
     *     
     *     Again, you do NOT need to understand how this code works to use the Selection class!
     */
    public void act() 
    {
        // if clicked ...
        if (Greenfoot.mouseClicked(this))
        {
            //mark this selection box as selected
            this.redraw(Color.GRAY, Color.BLACK);
            this.selected=true;
            
            // go through all selection boxes ...
            for (Selection other : this.getWorld().getObjects(Selection.class))
            {
                // inly deselect other if it is not "this" selection box. 
                if (other!=this)
                {
                    other.redraw(Color.WHITE, Color.BLACK);
                    other.selected=false;
                }
            }
        }
    }    
}
