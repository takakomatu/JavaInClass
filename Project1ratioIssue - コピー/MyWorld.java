import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/** 
 * Takaaki made this
 * 
 * @author Takaaki Komatsu 
 * @version 10/19/2017
 */
public class MyWorld extends World
{
    private RectangleMeter rectangleMeter; //declare an instance variable called rectangleMeter.
    private MessageBox messageBox; //declare an instance variable called messageBox.
    private int locationOfHole;
    
    /**
     * Constructor for objects of class MyWorld. 
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 800x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1);

        messageBox = new MessageBox(800); //create an object of MessageBox.
        this.addObject(messageBox, 400, 10);//put an object of MessageBox.        
        GolfBall golfBall = new GolfBall(1, 1); //create an object of GolfBall. 
        this.addObject(golfBall, 30, 400);//put the object of GolfBall 
        rectangleMeter = new RectangleMeter(100); //create an object of RectangleMeter. 
        this.addObject(rectangleMeter, 10, 350);//put the object of RectangleMeter.
        Selection selection1 = new Selection("1W");//create an object of Selection. 
        this.addObject(selection1, 45, 30);//put the object of Selection.
        Selection selection2 = new Selection("3W"); //create an object of Selection.
        this.addObject(selection2, 135, 30);//put the object of Selection.
        Selection selection3 = new Selection("1I"); //create an object of Selection.
        this.addObject(selection3, 225, 30);//put the object of Selection.
        Selection selection4 = new Selection("5I"); //create an object of Selection.
        this.addObject(selection4, 315, 30);//put the object of Selection.
        Selection selection5 = new Selection("P"); //create an object of Selection.
        this.addObject(selection5, 405, 30);   //put the object of Selection.     
        Hole hole = new Hole(); //create an object of Hole.
        Random random150to650 = new Random();//create an object of Random.
        locationOfHole = random150to650.nextInt(611)+150;
        this.addObject(hole, locationOfHole, 355);//put an object of Hole.
    }

    /**
     * return how much ratio in the rectangleMeter is.
     * 
     */
    public double getRectangleMeter()
    {
        double ratio;
        ratio = rectangleMeter.getFilledRatio();
        return ratio;
    }
    
    /**
     * get messageBox messages.
     * 
     */
    public MessageBox getMessageBox()
    {
        return messageBox;
    }

    /**
     * get location Of the Hole
     * 
     */
    public int getlocationOfHole()
    {
        return locationOfHole;
    }    
    
    /**
     * returns the club selected by the user
     *   @return String containing the label of the Selection box the user has selected. Returns
     *              null if no such box has been selected. 
     */
    public String getClubSelected()
    {
        String ans = null;
        
        // go through all Selection boxes  ...
        for (Selection s: getObjects(Selection.class))
        {
            // if we find the current Selection box has been selected, return it. 
            if (s.isSelected())
                return s.getLabel();
        }
        return ans;
    }
}