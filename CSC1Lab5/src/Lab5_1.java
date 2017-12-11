import java.io.*;
import java.util.Scanner;

//import javax.swing.*;

public class Lab5_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) 
		throws FileNotFoundException{
		
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Type your filename: ");
		String fileName = keyboard.next(); 
		
		//String fileName;
		//JFileChooser fileChooser = new JFileChooser();
		
		
		File fileIn = new File(fileName);
		Scanner in = new Scanner (fileIn);
		
		int[][] scoreList = new int[101][2];
		
		for (int i = 0; i <= 100 ;i++){
			scoreList[i][0] = i;
			scoreList[i][1] = 0;
			
 		//	testing my scoreList
 		   
		/*	System.out.print(scoreList[i][0]+" ");
 			System.out.print(scoreList[i][1]+" ");
 			System.out.println();  */
 		
		}
		
		while (in.hasNextInt()){
			scoreList[in.nextInt()][1]++;
		}
		
		int mode = 0;
		int modeScore = 0;
		
		for (int i = 0; i <= 100 ; i++){
			
			if (mode < scoreList[i][1]) mode = scoreList[i][1];
			
		/*	System.out.print(scoreList[i][0]+" ");
			System.out.print(scoreList[i][1]+" ");
			System.out.println(); */
			
			if (scoreList[i][1] == mode) modeScore=scoreList[i][0];
		}
		
	//	System.out.println(mode); //This displays the Mode
		System.out.println("Most common grade is "+ modeScore);
	}
}
