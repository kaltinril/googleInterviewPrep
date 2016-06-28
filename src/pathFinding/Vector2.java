package pathFinding;

public class Vector2 {
	private int x;
	private int y;
	
	public Vector2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Vector2(Vector2 inVec){
		this.x = inVec.getX();
		this.y = inVec.getY();
	}
	
	public int getX(){
		return x;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setY(int y){
		this.y = y;
	}
}
