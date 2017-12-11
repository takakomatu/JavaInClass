import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   private MessageBox messageBox; //declare an instance variable called messageBox.


    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        RectangleMeter rectangleMeter = new RectangleMeter(200);
        this.addObject(rectangleMeter, 30, 300);
        Selection selection1 = new Selection("selection1");
        this.addObject(selection1, 300, 30);
        Selection selection2 = new Selection("selection2");
        this.addObject(selection2, 400, 30);
        Selection selection3 = new Selection("selection3");
        this.addObject(selection3, 500, 30);
        Selection selection4 = new Selection("selection4");
        this.addObject(selection4, 620, 30);
        Selection selection5 = new Selection("selection5");
        this.addObject(selection5, 720, 30);        
        GolfBall golfBall = new GolfBall(100, 100);
        this.addObject(golfBall, 360, 395);        
        messageBox = new MessageBox(400);
        this.addObject(messageBox, 360, 10);           
        MessageBox mb = this.getMessageBox();//getMessageBox is a method that belongs to MyWorld so need MyWorld object
        messageBox.setText("Select a club");
        mb.setText("Select a club");
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
