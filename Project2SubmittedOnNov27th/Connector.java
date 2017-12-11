import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * class Connector draws a line between two Restaurants. 
 * 
 * @author Stephen Blythe 
 * @version 10/2017
 */
public class Connector extends Actor
{
    private Restaurant endA; // one end of the connection line
    private Restaurant endB; // other end of the connection line
    
    /**
     * constructor to build a Connector
     * 
     * @param first - one of the Restaurants to connect
     * @param second - the other Restaurant we want to cconnect
     */
    public Connector(Restaurant first, Restaurant second)
    {
        // establish endpoints
        endA = first;
        endB = second;
        
        // draw associated imge as this connector's image
        setImage();
    }

    // added to avoid an unexpected glitch that is occurring for a 
    //   few people's systems
    protected void addedToWorld(World w)
    {
        // where *should* this connector be?
        int newX = (endA.getX()+endB.getX())/2;
        int newY = (endA.getY()+endB.getY())/2;
        
        // move to where connector *should* be.
        setLocation(newX, newY);      
    }
    
    /**
     * accessor to get one end of Connector
     * @param the Restaurant at one end
     */
    public Restaurant getFirst()
    {
        return endA;
    }
    
    /**
     * accessor to get other end of Connector
     * @param the Restaurant at the other end
     */
    public Restaurant getSecond()
    {
        return endB;
    }
    

    
    /**
     * determines if two connectors (this and other) are equivalent
     * @return true if this and other are content-wise the same
     */
    public boolean sameAs(Connector other)
    {
        // if endoints are the same, then we are the same connector
        if ( (endA == other.endA) && (endB==other.endB) )
            return true;
        if ( (endA == other.endB) && (endB==other.endA) )
            return true;
         
        // only way to get here is if endpoints differ - so these
        //  are not the same Connectors
        return false;
    }
    
    /**
     * does this Connector involve the specified Restaurant
     * @param r the restaurant that might be involved
     * @return true or false, based on the current endpoints
     */
    public boolean involves(Restaurant r)
    {
        return endA==r || endB==r;
    }
    
    /**
     * gets the current length (in pixels) of this Connector.
     * @return the current length
     */
    public double getLength()
    {
        double xDiff = endA.getX() - endB.getX();
        double yDiff = endA.getY() - endB.getY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    /**
     * Act - basically just redraws the image as necessary.
     */
    public void act() 
    {
        // if connector is between unknown restaurants, we have a potential problem. 
        if (endA.getWorld()==null || endB.getWorld()==null)
        {
            System.err.println("Attempt to use Connector(s) when Restaurant(s) not in world.");
            System.err.println("Perhaps you removed Restaurant(s) with removing Connector(s)?");
        }
        
        // get middle coordinate for the image. 
        int newX = (endA.getX()+endB.getX())/2;
        int newY = (endA.getY()+endB.getY())/2;
        
        //if connector is "moving"
        if (newX!=getX() || newY!=getY())
        {
            setLocation(newX, newY);
            setImage();
        }
        
        // if the connector has changed
        if (getImage().getWidth()-1!=Math.abs(endA.getX()-endB.getX()) ||
            getImage().getHeight()-1!=Math.abs(endA.getY()-endB.getY())   )
          setImage();// redraw the Cnonector
        
    }    
    
    //
    //redraw yellow line connector
    private void setImage()
    {
        // how big should image be?
        int width = Math.abs(endA.getX() - endB.getX())+1;
        int height = Math.abs(endA.getY() - endB.getY())+1;
        
        GreenfootImage img = new GreenfootImage(width, height);
        
        //draw yellow line  ...
        img.setColor(Color.YELLOW);
        
        // ... from one corner to other.
        
        // which endpoint is left and which is right? 
        int startX,endX;
        if (endA.getX() < endB.getX())
        {
            startX =0;
            endX = width-1;
        }
        else
        {
            startX =width-1;
            endX=0;
        }
        
        // which endpoint is top and which is bottom?
        int startY,endY;
        if (endA.getY() < endB.getY())
        {
            startY =0;
            endY = height-1;
        }
        else
        {
            startY =height-1;
            endY=0;
        }
        
        // draw the line based on where the endpoints are
        img.drawLine(startX, startY, endX, endY); 
        
        // use the image we just built. 
        //   minor point - this is using an overloading trick.
        //      the method we are writing is setImage with no
        //      parameters, but the setImage we are calling
        //      takes a (single) parameter.
        setImage(img);
    }
}
