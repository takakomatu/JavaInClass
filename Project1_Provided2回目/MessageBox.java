import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Graphics;
import java.awt.FontMetrics;

/**
 * MessageBox is a class that will build a message area. 
 * 
 * @author Stephen Blythe
 * @version 8/2017
 * 
 * NOTE: YOU DO ***NOT*** NEED TO UNDERSTAND HOW THE PRIVATE IMPLEMENTATION OF THIS
 *         CLASS WORKS IN RDER TO USE THE CLALSS.
 *         
 *       IT IS ****HIGHLY**** INADVISABLE TO MODIFY THIS CODE IN ANY WAY, although 
 *       you are welcome to do so if you wish to.
 */
public class MessageBox extends Actor
{

    private String message; // current message 
    private int width;      // how many pixels wide is this message box?
    
    private FontMetrics fm; // keeps track of data about the font involved with a mssage box
    
    /**
     * Constructor to build a MessageBox of a specified width
     * 
     *   @param width - the width of the message box.
     */
    public MessageBox(int width)
    {
        message="";       // default is empty message pox
        this.width=width; // keep the width
    }
    
    // "second half" of constructor - essentially calculates font details and redraws box
    protected void addedToWorld(World w)
    {
        Graphics g = getWorld().getBackground().getAwtImage().createGraphics();
        fm = g.getFontMetrics(new java.awt.Font("MONOSPACED", java.awt.Font.BOLD,12));
        setImage(new GreenfootImage(width, 4+fm.getHeight()));
        
        redraw();
    }
    
    // redraw the message box
    private void redraw()
    {
        // the font used in drawing the message
        Font mono = new Font("MONOSPACED", true, false,  12);
        
        
        GreenfootImage img = getImage();
        
        // set background color
        img.setColor(Color.WHITE);
        img.fill();
        
        //draw border
        img.setColor(Color.BLACK);
        img.drawRect(0,0,img.getWidth()-1, img.getHeight()-1);
        
        // draw message in calculated font
        img.setColor(Color.RED);
        img.setFont(mono);
        img.drawString(message, img.getWidth()/2-fm.stringWidth(message)/2, img.getHeight()-4);
    }
    
    /**
     * modifies the displayed message bty replacing i
     *   @param newText - the new message
     */
    public void setText(String newText)
    {
        message = newText;
        redraw();
    }
    
    /**
     * clears out the message box
     */
    public void clear()
    {
        message="";
        redraw();
    }
    
    /**
     * act really has nothing to do uhere. In fact, we could hav omitted it.
     */
    public void act() 
    {
    }    
}
