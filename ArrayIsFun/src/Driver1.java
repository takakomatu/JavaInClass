import java.awt.FileDialog;
import java.io.*;
import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		
		PartiallyFilledArray turkey = new PartiallyFilledArray();
		PartiallyFilledArrayNew turkeyNew = new PartiallyFilledArrayNew();
		
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
		System.out.println();
		turkey.selectionSort();
		turkey.print();
		System.out.println();
	
		/*turkeyNew.print();
		System.out.println();
		turkeyNew.selectionSort();
		turkeyNew.print();
		System.out.println();*/
		
	}

}
