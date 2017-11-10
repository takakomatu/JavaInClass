
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
		if(firstSwitchState+secondSwitchState==2 || firstSwitchState+secondSwitchState==0) lampState=0;
		if(firstSwitchState+secondSwitchState==1) lampState=1;
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


