package main.subtask4;

public class Area {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Area(int x1,int y1,int x2,int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	
	public boolean isPointInArea(Point point) {
		if (point.getX() >= getX1() && point.getX() < getX2()) {
			if (point.getY() >= getY1() && point.getY() < getY2()) {
				return true;
			}
		}
		return false;
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}
	
}
