import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The ToolTip class pops up a "user hint" that disappears after a brief 
 * period of time.
 * 
 * @author Stephen Blythe
 * @version 11/2017
 */
public class ToolTip extends Actor
{
    private int lifeLeft;             // how much more time to display tooltip
    private final int LINE_HEIGHT=20; // distance from one line of text to the next  
    
    /**
     * constructor that builds a ToolTip out of an array of user "hints".
     * Note that each hint cannot be bigger than about 95 pixels wide.
     * 
     * @param tips - array of help Strings to dispay in ToolTip
     * @param lifeLength - how long the ToolTIp should appear (measured in number of act calls)
     */
    public ToolTip(String[] tips, int lifeLength)
    {
        // build image for the tooltip, setting its background to yellow. 
        GreenfootImage img = new GreenfootImage(100, 10+20*tips.length);
        img.setColor(Color.YELLOW);
        img.fill();
        
        // draw border in gray
        img.setColor(Color.GRAY);
        
        // draw borders
        img.fillRect(0,0,2, img.getHeight());
        img.fillRect(0,0,img.getWidth(),2);
        img.fillRect(0,img.getHeight()-2, img.getWidth(),2);
        img.fillRect(img.getWidth()-2,0, 2, img.getHeight());
                
        // draw tips in black
        img.setColor(Color.BLACK);
        
        // write each tip out as a String
        int yPos=LINE_HEIGHT;
        for(String tip:tips)
        {           
            img.drawString(tip, 10, yPos);
            yPos+=LINE_HEIGHT;
        }

        // use the image as built 
        setImage(img);
        
        // how many calls to act until this tooltip should diappear?
        lifeLeft=lifeLength;
    }

    // "push" this tooltip so that all of it is visible
    protected void addedToWorld(World w)
    {
        GreenfootImage myImage = getImage();
        
        // make sure entire ToolTip is visible. 
        if (getX() < myImage.getWidth()/2)
            setLocation(myImage.getWidth()/2+1, getY());
        else if (getX() > w.getWidth() - myImage.getWidth()/2-1)
            setLocation(w.getWidth() - myImage.getWidth()/2-1, getY());
        if (getY() < myImage.getHeight()/2)
            setLocation(getX(), myImage.getHeight()/2);
        else if (getY() > w.getHeight() - myImage.getHeight()/2 -1)
            setLocation(getX(), w.getHeight() - myImage.getHeight()/2 -1);
    }
    
    /**
     * Act - leave tooltip in place until it should disappear
     */
    public void act() 
    {   
        // with no life left, this tooltip should go away
        if (lifeLeft<=0)
        {
            getWorld().removeObject(this);
        }
        
        // get one step closer to disappearing 
        lifeLeft--;   
    }    
}
