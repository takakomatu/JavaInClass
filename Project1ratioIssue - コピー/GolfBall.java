import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;

/**
 * GolfBall - the golf ball for CSC14400 project#1
 * 
 * @author Takaaki Komatsu
 * @version 10/19/2017
 * 
 * NOTE: You **WILL** want to add code to this class in various locations!!!
 */
public class GolfBall extends Actor
{   
    private double xSpeed;//declare an instance variable called xSpeed and get the speed of x
    private double ySpeed;//declare an instance variable called ySpeed and get the speed of y
    private double accurateX;//declare an instance variable called accurateX and get the location of X
    private double accurateY;//declare an instance variable called accurateY and get the location of Y
    private RectangleMeter rectangleMeter;
    private MessageBox mb;
    private boolean ab;//we have intance variables right after the class
    private MyWorld w1;
    /**
     * build a GolfBall with an initial speed
     * 
     */
    public GolfBall(double xVel, double yVel)//the primary purpose of constructor is give instance variable their starting value
    {//since constructor is called only once for each object, we cant have rightArrow cuz it chages
        yVel=0;
        xVel=0;
        xSpeed = xVel;
        ySpeed = yVel; 
        ab=false;
        this.setImage(this.getBallImage());        
    }
    
    /**
     * getBallImage - gets this golf ball's image to a black circle filled with white. 
     * 
     * @return a new golf ball image. 
     * 
     *   YOU WILL LIKELY WANT TO CALL THIS METHOD FROM YOUR CONSTRUCTOR AND POSSIBLY ELSEWHERE,
     *      ALTHOUGH YOU ARE ***NOT*** REQUIRED TO DO SO
     */
    public GreenfootImage getBallImage()//method that gives us golfball
    {// build a (small) image for the golf ball
        GreenfootImage img = new GreenfootImage(15,15);
        // draw white circle for golf ball. 
        img.setColor(Color.WHITE);
        img.fillOval(0,0,14,14);
        // draw black outline of golf ball
        img.setColor(Color.BLACK);
        img.drawOval(1,1,12,12);
        img.drawOval(0,0,14,14);
        // return the image we just built. 
        return img;
    }

    /**
     * getRightArrowImage - gets this golf ball's image to a black circle filled with white. 
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
        img.drawLine(6,14, 13,7);
        img.drawLine(7,14, 14,7);
        img.drawLine(7,0, 14, 6);
        img.drawLine(6,0, 13, 6);        
        // return the image we just built. 
        return img;
    }
     
    protected void addedToWorld(World w){//this will be executed after this object is added in the world.
        accurateX=getX();
        accurateY=getY();
        Color color;
        color = new Color(255, 0, 0);
        /*MyWorld w;
        w=(MyWorld) this.getWorld();//getWorld() returns World but this should be MyWorld*/
        w1=(MyWorld) w;
        mb = w1.getMessageBox();//getMessageBox is a method that belongs to MyWorld so need MyWorld object
        mb.setText("Select a club");
    } 

    /**
     * Act - do whatever the GolfBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(accurateX>0&&accurateX<799)
        this.setImage(this.getBallImage());        
       else{    
            this.setImage(this.getRightArrowImage(Color.RED));//the letters of the constant is all capitalized, like PI, E
            mb.setText("Out of bounds");
        }    
        java.lang.String a, b, c, d, e;
        a="1W";
        b="3W";
        c="1I";
        d="5I";
        e="P";

        if(w1.getClubSelected() == null)  {
            xSpeed = 0;
            ySpeed=0;
        }

        boolean f = Greenfoot.isKeyDown("space");//gonna be true if user hits space
        if(!ab && accurateY>=399 && xSpeed == 0 && ySpeed == 0){
        if (f){//if a user hits space
            // boolean prev = f;
            //if this is true or false to judge if space has been pressed **in the past**
            MyWorld w1 = (MyWorld) this.getWorld();//getWorld return something in World class
            double ratio = w1.getRectangleMeter();
            
            if(w1.getClubSelected() == null){
               mb.setText("Select a club!");
               xSpeed=0;
               ySpeed=0;               
            }//I used to have these outside the method but 
            
            else if(w1.getClubSelected().equals(a))  {//have "else" so that it will not compare 1W with null, which will cause an error
                mb.setText("Using the 1W, you swung with a power of " + ratio*10);
                double angle = 60;
                double radian = Math.toRadians(angle);
                xSpeed = 10*ratio*Math.cos(radian);
                ySpeed = 10*ratio*Math.sin(radian);
            }
            
            else if(w1.getClubSelected().equals(b))  {
                mb.setText("Using the 3W, you swung with a power of " + ratio*10);
                double angle = 65;
                double radian = Math.toRadians(angle);
                xSpeed = 10*ratio*Math.cos(radian);     
                ySpeed = 10*ratio*Math.sin(radian);                
            }
            else if(w1.getClubSelected().equals(c))  {
                mb.setText("Using the 1I, you swung with a power of " + ratio*10);
                double angle = 70;
                double radian = Math.toRadians(angle);
                xSpeed = 10*ratio*Math.cos(radian);     
                ySpeed = 10*ratio*Math.sin(radian);                   
            }
            else if(w1.getClubSelected().equals(d))  {
                mb.setText("Using the 5I, you swung with a power of " + ratio*10);  
                double angle = 80;
                double radian = Math.toRadians(angle);
                xSpeed = 10*ratio*Math.cos(radian);     
                ySpeed = 10*ratio*Math.sin(radian);                   
            }
            else if(w1.getClubSelected().equals(e))  {
                mb.setText("Using the P, you swung with a power of " + ratio*10);
                double angle = 1;
                double radian = Math.toRadians(angle);
                xSpeed = 10*ratio*Math.cos(radian);     
                ySpeed = 10*ratio*Math.sin(radian);                    
            }
            if(w1.getlocationOfHole()<accurateX){
                xSpeed = -xSpeed;
            }            
        }
    }
            if(accurateY<399){
                ySpeed = ySpeed-.1;
            }                        
            xSpeed = xSpeed*.995;
            ySpeed = ySpeed*.995;
            accurateX = accurateX+xSpeed;
            accurateY = accurateY-ySpeed;    
            if(accurateY>399){
                accurateY=399;
                xSpeed = xSpeed*.7;
                ySpeed = -.4*ySpeed;
            }              
            double xsquare = Math.pow(xSpeed, 2);
            double ysquare = Math.pow(ySpeed, 2);       
            double speed = Math.pow((xsquare+ysquare), 1.0/2);       
            if(speed<.1 && accurateY>=399){
                xSpeed=0;
                ySpeed=0;
            }
            this.setLocation( (int) accurateX, (int) accurateY);     
            
       Hole hittingGolfBall = (Hole) this.getOneIntersectingObject(Hole.class);
       if(!(hittingGolfBall==null)){
           mb.setText("Hitting the hole");
           ab = speed<0.1&&(w1.getlocationOfHole()-5<=accurateX&&w1.getlocationOfHole()+5>=accurateX);
           if(ab){
               mb.setText("It's in the hole");     
                xSpeed=0;
                ySpeed=0;   
           }
        }
        
    }     
}