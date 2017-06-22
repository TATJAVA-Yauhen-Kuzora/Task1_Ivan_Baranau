package main.subtask4;

public class Point {
	private int x;
	private int y;
	
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public boolean isPointInArea(Area area) {
		if (x >= area.getX1() && x < area.getX2()) {
			if (y >= area.getY1() && y < area.getY2()) {
				return true;
			}
		}
		return false;
	}
}
