package lab9_1;
import static lab9_1.ClearScreen.clear;

public class MovableRectangle implements Movable, Drawable {
	
	private MovablePoint topLeft;
	private MovablePoint bottomRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
		topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	public String toString(){
		return String.format("RECTANGLE Coordinates: topleft: %d %d, bottomright: %d %d with speeds x=%d y=%d", topLeft.x, topLeft.y, bottomRight.x, bottomRight.y, topLeft.xSpeed, topLeft.ySpeed);
	}

	public void moveUp() {
		topLeft.moveUp();
		bottomRight.moveUp();
	}

	public void moveDown() {
		topLeft.moveDown();
		bottomRight.moveDown();
	}

	public void moveLeft() {
		topLeft.moveLeft();
		bottomRight.moveLeft();
	}

	public void moveRight() {
		topLeft.moveRight();
		bottomRight.moveRight();
	}

	public void render() {
		ClearScreen clr = new ClearScreen();
		clr.clear();
		int i, j;
	   for(i=0, j=0; i <= y2; j++){
		if(j > x2 || i < y1){
			i++;
			j=0;
			System.out.println();
		}
		 else if(j == x1 || j == x2){
			System.out.print("*");
		}
		else if(j <= x1){
			System.out.print("-");
		 }
		 else if(i == y1 || i == y2){
			System.out.print("*");
		 }
		 else if(j == x1 || j == x2){
			System.out.print("*");
		 }
		 else{
		 System.out.print("-");
		}
	   }
	}
}
