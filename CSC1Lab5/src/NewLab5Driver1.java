import java.awt.FileDialog;  // gives GUI FIleDialog component
import java.io.*;            // gives Java File classes
import java.util.Scanner;    // give Scanner class for input

/**
 * 
 * Driver class for the GradeStatistics class that is required for Lab #5
 * 
 * @author Stephen Blythe
 * @version 11/2017
 *
 */
public class NewLab5Driver1 {

	public static void main(String[] args) {
		
		// prompt the user to enter a file via a FileDialog GUI
		FileDialog fd = null;
		fd  =new FileDialog(fd, "Select a Grade File", FileDialog.LOAD);
		fd.setVisible(true);
		
		// get the file name (and target folder) that the user selected,
		//   and build a File from it
		File fileToRead = new File(fd.getDirectory()+fd.getFile());
		
		// build a Scanner from the user selected file.
		Scanner gradeStream;
		try 
		{
			// build Scanner out of chosen file. Exception happens if file does
			//   not exist. 
			 gradeStream = new Scanner(fileToRead);
		}
		catch (FileNotFoundException fnfe) // user selected a non-existent file. Use default data instead
		{
			System.out.println("Error: " + fileToRead.getName() + " cannot be read!");
			String defaultData = "10 8 5 3 4 5 0 1 7 2 8 9 5 3";
			System.out.println("Using: " + defaultData);
			gradeStream = new Scanner(defaultData);
		}
		
		// using Scanner, build a GradStatistics object
		GradeStatistics normal = new GradeStatistics(gradeStream);
		
		//dump a histogram to the screen
		normal.showDistribution();
		
		// show the mode of the data
		System.out.println("mode=" + normal.findMode());
	
		// close the Scanner 
		gradeStream.close();
	}

}
