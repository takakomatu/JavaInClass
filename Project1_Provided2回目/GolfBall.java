import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GolfBall - the golf ball for CSC14400 project#1
 * 
 * @author Stephen Blythe
 * @version 9/2017
 * 
 * NOTE: You **WILL** want to add code to this class in various locations!!!
 */
public class GolfBall extends Actor
{

    private double xSpeed;
    private double ySpeed;    
    private double accurateX;    
    private double accurateY;        
    public GolfBall(double xVel, double yVel)
    {
        xVel = 0;
        yVel = 0;
        xSpeed = xVel;
        ySpeed = yVel;       
    }

    /**
     * getBallImage - gets image of a black circle filled with white. 
     * 
     * @return a new golf ball image. 
     * 
     *   YOU WILL LIKELY WANT TO CALL THIS METHOD FROM YOUR CONSTRUCTOR AND POSSIBLY ELSEWHERE,
     *      ALTHOUGH YOU ARE ***NOT*** REQUIRED TO DO SO
     */
    public GreenfootImage getBallImage()
    {
        // build a (small) image for the golf ball
        GreenfootImage img = new GreenfootImage(15,15);
        
        // draw white circle for golf ball. 
        img.setColor(Color.WHITE);
        img.fillOval(0,0,14,14);
        
        // draw black outline of golf ball
        img.setColor(Color.BLACK);
        img.drawOval(0,0,14,14);
        img.drawOval(1,1,12,12);
        
        // return the image we just built. 
        return img;
    }
    
    protected void addedToWorld(World w){
        this.setImage(this.getBallImage());
        //accurateX=this.getHolePosition();
        accurateX = this.getX();
        accurateY = this.getY();
    }
        
    /**
     * getRightArrowImage - gets image of an arrow pointing to the right
     * 
     * @param col - the color to draw the arrow with. 
     * @return a new right arrow image. 
     * 
     *   YOU WILL LIKELY WANT TO CALL THIS METHOD FROM YOUR ACT METHOD AND POSSIBLY ELSEWHERE,
     *      ALTHOUGH YOU ARE ***NOT*** REQUIRED TO DO SO
     */
    public GreenfootImage getRightArrowImage( Color col )
    {
        // build a (small) image for the arrow image
        GreenfootImage img = new GreenfootImage(22,15);
        
        img.setColor( col ); // use requested color
        
        img.fillRect(0,6, 15, 2);
        
        img.drawLine(7,0, 14, 6);
        img.drawLine(6,0, 13, 6);
        
        img.drawLine(7,14, 14,7);
        img.drawLine(6,14, 13,7);
        
        
        // return the image we just built. 
        return img;
    }
    
    /**
     * Act - do whatever the GolfBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        MyWorld w = (MyWorld) this.getWorld();
        MessageBox mb = w.getMessageBox();
        String a = w.getClubSelected();
        double ratio = w.getRectangleMeter();
        double power = 10 * ratio;
        int angle = 60;        
        if(a==null){
            mb.setText("Select a club");//y does
        }

        boolean f = Greenfoot.isKeyDown("space");//gonna be true if user hits space
        if (f){
            if(a==null){
                mb.setText("Select a club!");//y does
            }
            else if(a.equals("selection1")){
                mb.setText("you hit the ball with selection1 with power " + power);
                angle = 60;
            }
            else if(a.equals("selection2")){
                mb.setText("you hit the ball with selection1 with power " + power);
                angle = 65;            
            }
            else if(a.equals("selection3")){
                mb.setText("you hit the ball with selection1 with power " + power);
                angle = 70;   
            }
            else if(a.equals("selection4")){
                mb.setText("you hit the ball with selection1 with power " + power);
                angle = 80;   
            }
            else if(a.equals("selection5")){
                mb.setText("you hit the ball with selection1 with power " + power);
                angle = 1;   
            }        
            double radian = Math.toRadians(angle);
            xSpeed = power * Math.cos(radian);
            ySpeed = power * Math.sin(radian);
        }//right now its in golfBall so "this" refers to golfball
        accurateX = accurateX + xSpeed;
        accurateY = accurateY - ySpeed;        
        this.setLocation((int) accurateX, (int)accurateY);
    }//and act() is in  golfBall class, so methods inside need to be called with the object that is in type GolfBall
}
