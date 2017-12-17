import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.FileDialog;
import java.io.*;
import java.util.Scanner;

/**
 * MyWorld - MyWorld for CSC14400 project#3
 * 
 * @author Takaaki Komatsu
 * @version 12/06/2017
 */
public class MyWorld extends World
{
    private  Present[] arrayPresent;//declare an instance variable called arrayPresent, an array of Present
    private int sumWidth;//declare an instance variable called sumWidth, sum of width
    private int sumHeight;//declare an instance variable called sumHeight, sum of height
    private int counter;//declare an instance variable called counter, the number of presents in arrayPresent
    private Color colorRed;//declare an instance variable called colorRed
    private Color colorBlue;//declare an instance variable called colorBlue
    private Color colorGreen;//declare an instance variable called colorGreen
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); //super calls World class constructer, 800 width, 600 height
        sumWidth = 0;//the initial value of sumWidth = 0
        sumHeight = 100;//the initial value of sumHeight = 100        
        Load load = new Load();//create an object of Load        
        this.addObject(load, 500, 10);// put the object above at (500, 10), (xlocation, ylocation)        
        ByPeeks byPeeks = new ByPeeks();//create an object of ByPeeks         
        this.addObject(byPeeks, 100, 10);// put the object above at (100, 10), (xlocation, ylocation)              
        ByArea byArea = new ByArea();//create an object of ByArea         
        this.addObject(byArea, 200, 10);// put the object above at (200, 10), (xlocation, ylocation)          
        ByColor byColor = new ByColor();//create an object of ByColor                 
        this.addObject(byColor, 300, 10);// put the object above at (300, 10), (xlocation, ylocation)            
        Add add = new Add();//create an object of Add             
        this.addObject(add, 400, 10);// put the object above at (400, 10), (xlocation, ylocation)    
        counter = 0;//the initial value of counter = 0
        arrayPresent = new Present[10000]; //give arrayPresent 10000 of slots
    }
    
    /**
     * return the index that has the largest number of peeks
     * 
     * @return maxIndex - the index that has the largest number of peeks
     * @param startIndex - the requested starting index
     * 
     */      
    public int findmaxIndexFrom(int startIndex)
    {
        int maxIndex = startIndex;//for now, maximum index = starting index
        for(int searchIndex=startIndex+1; searchIndex<counter; searchIndex++)
        //this for loop has an initializer as startIndex+1, and ends when it reaches the current size of arrayPresent, the initializer increases by 1
        {
            if (arrayPresent[searchIndex].getPeeks() > arrayPresent[maxIndex].getPeeks())
                maxIndex = searchIndex;//the maximum index is the index that has the largest number of peeks
        }
        return maxIndex;//return the index that has the largest number of peeks
    }        
    
    /**
     * return the index that has the largest area
     * 
     * @return maxIndex - the index that has the largest area
     * @param startIndex - the requested starting index
     * 
     */      
    public int findmaxIndexFromArea(int startIndex)
    {
        int maxIndex = startIndex;//for now, maximum index = starting index
        for(int searchIndex=startIndex+1; searchIndex<counter; searchIndex++)
        //this for loop has an initializer as startIndex+1, and ends when it reaches the current size of arrayPresent, the initializer increases by 1
        {
            if (arrayPresent[searchIndex].getWidth()*arrayPresent[searchIndex].getHeight() > arrayPresent[maxIndex].getWidth()*arrayPresent[maxIndex].getHeight())
                maxIndex = searchIndex;//the maximum index is the index that has the largest area
        }
        return maxIndex;//return the index that has the largest area
    }    
    
    /**
     * swap the present at pos1 with the present at pos2 in a array
     * 
     * @param pos1 - the requested first index
     * @param pos2 - the requested second index
     */  
    public void swap(int pos1, int pos2)
    {
        Present temp = arrayPresent[pos1];//take the present at pos1 in an array and store it in temp
        arrayPresent[pos1] = arrayPresent[pos2];//take the present at pos2 in an array and replace the present at pos1 with that
        arrayPresent[pos2] = temp;//replace the present at pos2 with temp
    }
    
    /**
     * sort presents according to their number of peeks
     * 
     */     
    public void selectionSort()
    {
        for (int currPos = 0; currPos< counter; currPos++)
        {
            // find the maximum piece
            int maxIndex = findmaxIndexFrom(currPos);
                        
            // swap maximum piece into currPos
            swap(currPos, maxIndex);
        }
    }       
    
    /**
     * sort presents according to their sizes of area
     * 
     */     
    public void areaSort()// a small tip, these methods belong to a class, MyClass, need an object of type MyWorld
    {
        for (int currPos = 0; currPos< counter; currPos++)
        {
            // find the maximum piece
            int maxIndex = findmaxIndexFromArea(currPos);
                        
            // swap maximum piece into currPos
            swap(currPos,   maxIndex);
        }
    }   
    
    /**
     * When byPeeks button is pressed, this will be executed and arrange the presents in the world in a descending order concerning its peeks.
     * 
     */
    public void byPeeks(){   
        sumWidth = 0;
        sumHeight = 100;
        this.selectionSort();//sort the array of presents according to the number of peeks
        this.removeObjects(this.getObjects(Present.class));//remove objects of Present from the world    
        for(int j = 0; j<counter; j++){//this loop puts the sorted presents in the world
            int widthPeeks = arrayPresent[j].getWidth();//width of the present at j in an array
            double halfWidthPeeks = widthPeeks / 2.0;//half of that
            boolean ifStartNewLine = sumWidth + halfWidthPeeks > 800;//true if accumurations of presents gonna over the edge 
            if(ifStartNewLine){//and start from a left lower line
                sumHeight = sumHeight + 100;       
                sumWidth = 0;
            }                     
            this.addObject(arrayPresent[j], (int) (sumWidth + halfWidthPeeks), sumHeight);
            sumWidth += widthPeeks;//update sumWidth
        }
    }
    
    /**
     * When byArea button is pressed, this will be executed and arrange the presents in the world in a descending order concerning its size.
     * 
     */
    public void byArea(){   
        sumWidth = 0;
        sumHeight = 100;
        this.areaSort();//sort the array of presents according to the sizes
        this.removeObjects(this.getObjects(Present.class));//remove objects of Present from the world    
        for(int j = 0; j<counter; j++){//this loop puts the sorted presents in the world
            int widthAreas = arrayPresent[j].getWidth();//width of the present at j in an array
            double halfWidthAreas = widthAreas /2.0;//half of that
            boolean ifStartNewLine = sumWidth + halfWidthAreas > 800;//true if accumurations of presents gonna over the edge 
            if(ifStartNewLine){//and start from a left lower line
                sumHeight = sumHeight + 100;       
                sumWidth = 0;
            }                     
            this.addObject(arrayPresent[j], (int) (sumWidth + halfWidthAreas), sumHeight);
            sumWidth += widthAreas;//update sumWidth
        }
    }
    
    /**
     * When byColor button is pressed, this will be executed and arrange the presents in the world according to its color, red, green and blue .
     * 
     */
    public void byColor(){   
        sumWidth = 0;
        sumHeight = 100;
        this.removeObjects(this.getObjects(Present.class));//remove objects of Present from the world    
        for(int j = 0; j<counter; j++){//put only red objects
            int widthColors = 0;//temporary value
            if(arrayPresent[j].getColor()==colorRed){//if the color of present at j in an array is red
                widthColors = arrayPresent[j].getWidth();//width of the present at j in an array
                double halfWidthColors = widthColors /2.0;
                boolean ifStartNewLine = sumWidth + halfWidthColors > 800;//true if accumurations of presents gonna over the edge 
                if(ifStartNewLine){//and start from a left lower line
                    sumHeight = sumHeight + 100;       
                    sumWidth = 0;
                }                            
                this.addObject(arrayPresent[j], (int) (sumWidth + halfWidthColors), sumHeight);
            }            
            sumWidth += widthColors;//update sumWidth
        }        
        
        for(int j = 0; j<counter; j++){//put only green objects
            int widthColors = 0;
            if(arrayPresent[j].getColor()==colorGreen){//if the color of present at j in an array is blue
                widthColors = arrayPresent[j].getWidth();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double halfWidthColors = widthColors /2.0;
                boolean ifStartNewLine = sumWidth + halfWidthColors > 800;//true if accumurations of presents gonna over the edge 
                if(ifStartNewLine){//and start from a left lower line
                    sumHeight = sumHeight + 100;       
                    sumWidth = 0;
                }                            
                this.addObject(arrayPresent[j], (int) (sumWidth + halfWidthColors), sumHeight);
            }            
            sumWidth += widthColors;//update sumWidth
        }
        
        for(int j = 0; j<counter; j++){//put only blue objects
            int widthColors = 0;
            if(arrayPresent[j].getColor()==colorBlue){//if the color of present at j in an array is green
                widthColors = arrayPresent[j].getWidth();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double halfWidthColors = widthColors /2.0;
                boolean ifStartNewLine = sumWidth + halfWidthColors > 800;//true if accumurations of presents gonna over the edge and start from a left lower line
                if(ifStartNewLine){//and start from a left lower line
                    sumHeight = sumHeight + 100;       
                    sumWidth = 0;
                }                            
                this.addObject(arrayPresent[j], (int) (sumWidth + halfWidthColors), sumHeight);
            }            
            sumWidth += widthColors;//update sumWidth
        }        
    }
    
    /**
     * When add button is pressed, this will be executed and add the presents in the world according to the file selected.
     * 
     */
    public void add(){    
        FileDialog file = null;// prompt the user to enter a file via a FileDialog GUI
        file = new FileDialog(file , "CSC 144 File Chooser" , FileDialog.LOAD );
        file.setVisible(true);
        // get the file name (and target folder) that the user selected,
        //   and build a File from it        
        String fileName = file.getFile();
        String directoryName = file.getDirectory();
        String fullFileName = directoryName + fileName;
        File myFile = new File(fullFileName);
        // build a Scanner from the user selected file.        
        Scanner reader=null;
        try
        {
            // build Scanner out of chosen file. Exception happens if file does
            //   not exist.             
            reader= new Scanner(myFile);
        }
        catch (FileNotFoundException e)//catch FileNotFoundException
        {
            System.out.println("Bad user error.");
            return;
        }
        catch (NullPointerException e)//catch NullPointerException
        {
            System.out.println("NPE");
        }

        int width, height;
        while(reader.hasNext())//read content of a file that a user selected
        {
            String redBlueGreen = reader.next();//read the string in a file
            if(redBlueGreen.equals("red")){//if string that was read is "red"
                width = reader.nextInt();//read the first number in a file and assign that number to width 
                double halfWidth = width /2.0;//half of that
                height = reader.nextInt();//read the second number in a file and assign that number to height 
                boolean ifStartNewLine = sumWidth+halfWidth > this.getWidth();//true if accumurations of presents gonna over the edge and start from a left lower line
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;       
                    sumWidth = 0;
                }
                colorRed = Color.RED;
                Present red = new Present(width, height, colorRed);//make a object of Present that is red      
                arrayPresent[counter] = red;//store the present object in the array at counter  
                counter++;//update counter                
                this.addObject(red, (int) (sumWidth + halfWidth), sumHeight);//add the object in the world
                sumWidth = sumWidth + width;//update sumWidth            
            }    
            else if(redBlueGreen.equals("blue")){//if string that was read was "blue"
                width = reader.nextInt();//read the first number in a file and assign that number to width 
                double halfWidth = width /2.0;//half of that      
                height = reader.nextInt();//read the second number in a file and assign that number to height 
                boolean ifStartNewLine = sumWidth+halfWidth > this.getWidth();//true if accumurations of presents gonna over the edge and start from a left lower line
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;     
                    sumWidth = 0;
                }                 
                colorBlue = Color.BLUE;                
                Present blue = new Present(width, height, colorBlue);//make a object of Present that is blue 
                arrayPresent[counter] = blue;//store the present object in the array at counter  
                counter++;//update counter                         
                this.addObject(blue, (int) (sumWidth + halfWidth), sumHeight);//add the object above accoring to width and height 
                sumWidth = sumWidth + width;//update sumWidth                   
            }                        
            else if(redBlueGreen.equals("green")){//if string that was read was "green"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double halfWidth = width /2.0;                                
                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location
                boolean ifStartNewLine = sumWidth+halfWidth > this.getWidth();//true if accumurations of presents gonna over the edge and start from a left lower line
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;    
                    sumWidth = 0;
                }                    
                colorGreen = Color.GREEN;                       
                Present green = new Present(width, height, colorGreen);//make a object of Present that is green 
                arrayPresent[counter] = green;//store the present object in the array at counter    
                counter++;//update counter                    
                this.addObject(green, (int) (sumWidth + halfWidth), sumHeight);//add the object in the world
                sumWidth = sumWidth + width;//update sumWidth                   
            }
        }
        reader.close();        
    }
    
    /**
     * When load button is pressed, this will be executed and load the presents in the world according to the file selected.
     * 
     */
    public void load(){
        this.removeObjects(this.getObjects(Present.class));//remove objects of Present from the world 
        // prompt the user to enter a file via a FileDialog GUI
        FileDialog file = null;//Im trying to have a user select a file properly in the code below
        // get the file name (and target folder) that the user selected,
        //   and build a File from it              
        file = new FileDialog(file , "CSC 144 File Chooser" , FileDialog.LOAD );
        file.setVisible(true);
        String fileName = file.getFile();
        String directoryName = file.getDirectory();
        String fullFileName = directoryName + fileName;
        File myFile = new File(fullFileName);
        // build a Scanner from the user selected file.   
        Scanner reader=null;
        try
        {
            // build Scanner out of chosen file. Exception happens if file does
            //   not exist.                   
            reader= new Scanner(myFile);
        }
        catch (FileNotFoundException e)//catch FileNotFoundException
        {
            System.out.println("Bad user error.");
            return;
        }
        catch (NullPointerException e)//catch NullPointerException
        {
            System.out.println("NPE");
        }
        sumWidth = 0;
        sumHeight = 100;              
        int width, height;
        counter = 0;//set the counter to 0
        while(reader.hasNext())//read content of a file that a user selected
        {
            String redBlueGreen = reader.next();//as long as it reads content of a file that a user selected
            if(redBlueGreen.equals("red")){//read the string in a file
                width = reader.nextInt();//read the first number in a file and assign that number to width 
                double halfWidth = width /2.0;
                height = reader.nextInt();//read the second number in a file and assign that number to height 
                boolean ifStartNewLine = sumWidth+halfWidth > this.getWidth();//true if accumurations of presents gonna over the edge and start from a left lower line
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;       
                    sumWidth = 0;
                }
                colorRed = Color.RED;
                Present red = new Present(width, height, colorRed);//make a object of Present that is red     
                arrayPresent[counter] = red;//store the present object in the array at counter                 
                counter++;//update counter                 
                this.addObject(red, (int) (sumWidth + halfWidth), sumHeight);//add the object in the world
                sumWidth = sumWidth + width;//update sumWidth                 
            }    
            else if(redBlueGreen.equals("blue")){//if string that was read was "blue"
                width = reader.nextInt();//read the first number in a file and assign that number to width 
                double halfWidth = width /2.0;//half of that                    
                height = reader.nextInt();//read the second number in a file and assign that number to height 
                boolean ifStartNewLine = sumWidth+halfWidth > this.getWidth();//true if accumurations of presents gonna over the edge and start from a left low
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;     
                    sumWidth = 0;
                }                    
                colorBlue = Color.BLUE;     
                Present blue = new Present(width, height, colorBlue);//make a object of Restaurant 
                arrayPresent[counter] = blue;//store the present object in the array at counter      
                counter++;//update counter                 
                this.addObject(blue, (int) (sumWidth + halfWidth), sumHeight);//add the object in the world
                sumWidth = sumWidth + width;//update sumWidth                
            }            
            
            else if(redBlueGreen.equals("green")){//if string that was read was "green"
                width = reader.nextInt();//read the first number of Stationary in a file and assign that number to width as a value of x location
                double halfWidth = width /2.0;                                
                height = reader.nextInt();//read the second number of Stationary in a file and assign that number to height as a value of y location
                boolean ifStartNewLine = sumWidth+halfWidth > this.getWidth();//true if accumurations of presents gonna over the edge and start from a left low
                if(ifStartNewLine){
                    sumHeight = sumHeight + 100;    
                    sumWidth = 0;
                }              
                colorGreen = Color.GREEN;  
                Present green = new Present(width, height, colorGreen);//make a object of Present that is green
                arrayPresent[counter] = green;//store the present object in the array at counter        
                counter++;//update counter                  
                this.addObject(green, (int) (sumWidth + halfWidth), sumHeight);//add the object in the world
                sumWidth = sumWidth + width;//update sumWidth                
            }
        }
        reader.close();
    }
}
