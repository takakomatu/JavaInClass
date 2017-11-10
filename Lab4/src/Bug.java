
public class Bug {
	private int position, minus = 1;
	public Bug(int initialPosition) {position = initialPosition;}
	public void turn() {minus = -1 * minus;}	
	public void move() { position = position + minus;}		
	public int getPosition() {return position;	}
}
