/*Simulate a circuit for controlling a hallway light that has switches at both ends of the hallway. 
  Each switch can be up or down, and the light can be on or off. Toggling either switch turns the lamp on or off. 
  Provide methods 
  public int getFirstSwitchState() // 0 for down, 1 for up 
  public int getSecondSwitchState() 
  public int getLampState() // 0 for off, 1 for on 
  public void toggleFirstSwitch() 
  public void toggleSecondSwitch() */
//use CircuitTest.java in the same folder to see how this works
public class Lab4SuggestedE3_3 {
	private int lampState;
	private int firstSwitchState;
	private int secondSwitchState;
	
	public Lab4SuggestedE3_3() {
		lampState = 0;
		firstSwitchState = 0;
		secondSwitchState = 0;
	}
	public int getFirstSwitchState() {
		return firstSwitchState;
	}
	public int getSecondSwitchState() {
		return secondSwitchState;
	}
	
	public int getLampState() {

		return lampState;
	}
	public void toggleFirstSwitch() {
		if(lampState==0&&firstSwitchState==0) {
			lampState =1;
			firstSwitchState=1;
		}
		else if(lampState==1&&firstSwitchState==0) {
			lampState =0;
			firstSwitchState=1;
		}		
		else if(lampState==0&&firstSwitchState==1) {
			lampState =1;
			firstSwitchState=0;
		}
		else if(lampState==1&&firstSwitchState==1) {
			lampState =0;
			firstSwitchState=0;
		}
	}
	public void toggleSecondSwitch() {
		if(lampState==0) {
			lampState =1;
			secondSwitchState = 1-secondSwitchState;
		}
		if(lampState==1){
			lampState =0;
			secondSwitchState = 1-secondSwitchState;
		}
	}
}


