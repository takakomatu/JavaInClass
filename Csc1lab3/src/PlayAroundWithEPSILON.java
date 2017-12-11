import java.util.*;
public class PlayAroundWithEPSILON {
	public static void main(String[] args) {
		int x =-1;
		if(0<x&&x<100||x==-1) System.out.println("Enter");

		final double EPSILON = 1E-14;// y do we have final?
		
		boolean b = Math.abs(x-10)<=1E-14;
		//EPSILON = 7;// cant do like this cuz finalized
		System.out.print(EPSILON);





	}
}
