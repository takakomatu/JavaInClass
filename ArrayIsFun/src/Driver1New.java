import java.awt.FileDialog;
import java.io.*;
import java.util.Scanner;

public class Driver1New {

	public static void main(String[] args) {
		
		PartiallyFilledArrayNew turkey = new PartiallyFilledArrayNew();
		
		FileDialog fd = null;
		fd = new FileDialog(fd, "Pick an input file" , FileDialog.LOAD);
		fd.setVisible(true);
		
		Scanner s=null;
		
		try
		{
			s = new Scanner(new File( fd.getDirectory()+fd.getFile() ) );
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error on file open.");
			return;
		}
		
		while ( s.hasNext() )
		{
			int nextVal = s.nextInt();
			turkey.addElement(nextVal);
		}
		s.close();
		
		turkey.print();
		
		Scanner kbd = new Scanner(System.in);
		System.out.print("What value do you want to search for?");
		int val = kbd.nextInt();
		
		System.out.println("Found " + val + " at position " + turkey.linearSearch(val) );
		
		turkey.bubbleSort();
		turkey.print();
		
		System.out.println("Found " + val + " at position " + turkey.binarySearch(val) );

	}

}
