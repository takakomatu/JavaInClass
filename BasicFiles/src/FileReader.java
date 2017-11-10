import java.awt.FileDialog;
import java.io.*;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileDialog fd = null;
		fd = new FileDialog(fd , "CSC 144 File Chooser" , FileDialog.LOAD );
		
		fd.setVisible(true);
		
		String fileName = fd.getFile();
		String directoryName = fd.getDirectory();
		
		String fullFileName = directoryName + fileName;
		
		File myFile = new File(fullFileName);
		
		Scanner s = new Scanner(myFile);
		
		while(s.hasNext())
		{
			String value = s.next();
			System.out.println(value);
		}
		
		System.out.println("***** DONE READING *****");
		
		s.close();
		
	}

}
