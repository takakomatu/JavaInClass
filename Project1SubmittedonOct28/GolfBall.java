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
    private boolean inhole;//true if the ball is in the hole and has the speed of less than 0.1
    private boolean fsd;
    /**
     * build a GolfBall with an initial speed
     * 
     */
    public GolfBall()
    {   
        xSpeed = 0;
        ySpeed = 0; 
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
        if(0<this.getX()&&this.getX()<800) this.setImage(this.getBallImage());
    }    
    
    private RectangleMeter rectangleMeter;
    private boolean sdf;
    
    /**
     * Act - do whatever the GolfBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        java.lang.String a, b, c, d, e;
        a="1W";
        b="3W";
        c="1I";
        d="5I";
        e="P";
        MyWorld w;        //MyWorld w = new MyWorld(); y not this?
        w=(MyWorld) this.getWorld();//getWorld() returns World but this should be MyWorld
        MessageBox mb = w.getMessageBox();//get messagebox a message
        if(w.getClubSelected() == null)  mb.setText("Select a club");//when no club is selected
        
        if(accurateX>=799){
            Color color = new Color(255, 0, 0);//make it red
            if(fsd){ 
                this.turn(180);
            }//when the ball is out of bounds on the right side, it will happen
            this.setImage(this.getRightArrowImage(color));//make the ball a Right Arrow
            mb.setText("Out of Bounds");//message that says "Out of bounds"
            sdf = true;//get sdf true
        }
        
        else if(accurateX<=0){
            Color color = new Color(255, 0, 0);//make it red
            this.setImage(this.getRightArrowImage(color));//make the ball a Right Arrow
            this.turn(180);//make the arrow left
            mb.setText("Out of Bounds!");//message that says "Out of bounds!"
            sdf = true;//get sdf true
            fsd = true;//get fsd true
        }
        
        else {
            this.setImage(this.getBallImage());
            if(sdf) mb.setText("It came back!");//this if statement will be done when sdf is true
        }

        boolean f = Greenfoot.isKeyDown("space");//gonna be true if user hits space
        if (f){//if a user hits space
            // boolean prev = f;
            //if this is true or false to judge if space has been pressed **in the past**
            MyWorld w1 = (MyWorld) this.getWorld();//getWorld return something in World class
            double ratio = w1.getRectangleMeter();
            String string = w1.getClubSelected();
            double degree = 45.0;
            sdf= false;//without this, "It came back!" gonna appear every time.
            
            if(w.getClubSelected() == null){
               mb.setText("Select a club!");
            }//I used to have these outside the method but 
            
            else if(w.getClubSelected().equals(a))  {//have "else" so that it will not compare 1W with null, which will cause an error
               degree = 60.0;
               double radian = Math.toRadians(degree);
               xSpeed = (ratio*10*Math.cos(radian));//*.995;
               if(accurateX>w.getX()) xSpeed = -xSpeed;//if the ball is on the right side of the flag
               ySpeed = (ratio*10*Math.sin(radian));//*.995;
               //accurateX = accurateX + xSpeed;
               //accurateY = accurateY - ySpeed;
               if(w.getClubSelected() == null)  mb.setText("");//I used to have these outside the method but 
               else if(w.getClubSelected().equals(a)) mb.setText("Using the 1W, you swung with a power of " + ratio*10);
            }
            
            else if(w.getClubSelected().equals(b))  {
               degree = 65.0;
               double radian = Math.toRadians(degree);
               xSpeed = (ratio*10*Math.cos(radian));//*.995;
               if(accurateX>w.getX()) xSpeed = -xSpeed;
               ySpeed = (ratio*10*Math.sin(radian));//*.995;        
               //accurateX = accurateX + xSpeed;
               //accurateY = accurateY - ySpeed;
               if(w.getClubSelected() == null)  mb.setText("");//I used to have these outside the method but 
               else if(w.getClubSelected().equals(b))  mb.setText("Using the 3W, you swung with a power of " + ratio*10);
            }
            else if(w.getClubSelected().equals(c))  {
               degree = 70.0;
               double radian = Math.toRadians(degree);
               xSpeed = (ratio*10*Math.cos(radian));//*.995;
               if(accurateX>w.getX()) xSpeed = -xSpeed;
               ySpeed = (ratio*10*Math.sin(radian));//*.995;        
               //accurateX = accurateX + xSpeed;
               //accurateY = accurateY - ySpeed;
               if(w.getClubSelected() == null)  mb.setText("");//I used to have these outside the method but 
               else if(w.getClubSelected().equals(c))  mb.setText("Using the 1I, you swung with a power of " + ratio*10);
            }
            else if(w.getClubSelected().equals(d))  {
               degree = 80.0;
               double radian = Math.toRadians(degree);
               xSpeed = (ratio*10*Math.cos(radian));//*.995;
               if(accurateX>w.getX()) xSpeed = -xSpeed;
               ySpeed = (ratio*10*Math.sin(radian));//*.995;        
               //accurateX = accurateX + xSpeed;
               //accurateY = accurateY - ySpeed;
               if(w.getClubSelected() == null)  mb.setText("Select a club");//I used to have these outside the method but                
               else if(w.getClubSelected().equals(d))  mb.setText("Using the 5I, you swung with a power of " + ratio*10);  
            }
            else if(w.getClubSelected().equals(e))  {
               degree = 1.0;
               double radian = Math.toRadians(degree);
               xSpeed = (ratio*10*Math.cos(radian));//*.995;
               if(accurateX>w.getX()) xSpeed = -xSpeed;
               ySpeed = (ratio*10*Math.sin(radian));//*.995;    
               //accurateX = accurateX + xSpeed;
               //accurateY = accurateY - ySpeed;
               if(w.getClubSelected() == null)  mb.setText("");//I used to have these outside the method but 
               else if(w.getClubSelected().equals(e))  mb.setText("Using the P, you swung with a power of " + ratio*10);
            }
        }
        
        ySpeed = ySpeed -.1;
        ySpeed = ySpeed * .995;
        xSpeed = xSpeed * .995;
        if(accurateY >= 399){//if the ball is on the ground
            xSpeed = xSpeed * 0.7;//friction reduces x speed by 30%
        }
        if(inhole == true){//if it is in the hole, it never move
            xSpeed = 0;
            ySpeed = 0;
        }
            
        accurateX = accurateX + xSpeed;
        accurateY = accurateY - ySpeed;
        
        if(accurateY >= 399){//it bounces , if the ball tries to tunnel through earth
           accurateY = 399;
           ySpeed = -ySpeed*.4;//reduces y speed by 60% when it bounces
        }

        double xSpeedSquiare = Math.pow(xSpeed, 2);
        double ySpeedSquiare = Math.pow(ySpeed, 2);
        double speed = xSpeedSquiare + ySpeedSquiare;
        //speed = Math.pow(speed, 1/2); dunno why but it only returns 1???
        //System.out.println(speed);
        //if(w.getClubSelected() == null)  mb.setText("");//I used to have these outside the method but 
        //else if(w.getClubSelected().equals(a)) mb.setText("Using the 1W, you swung with a power of " + ratio*10);
   
        this.setLocation( (int) accurateX, (int) accurateY);  
        //boolean prev = f;
            
        Hole hittingHole;
        hittingHole = (Hole) this.getOneIntersectingObject(Hole.class);
        
        if(Math.pow(xSpeed, 2)+Math.pow(ySpeed, 2)<.01 && accurateY == 399){//if the speed <0.1 and the ball is on the bottom
            xSpeed = 0;
            ySpeed = 0;
        }
        
        if (hittingHole!=null){//when the ball hits the flag or hole.
            mb.setText("Wow! That was close");
            if((Math.pow(xSpeed, 2)+Math.pow(ySpeed, 2))<.01 && accurateX <=w.getX()+5 && accurateX >=w.getX()-5){
                //if the speed <0.1 and the ball is within 5 pixels of the center of the hole.
                mb.setText("It's in the hole!");
                inhole = true;
                
            }
        }      
    }     
}