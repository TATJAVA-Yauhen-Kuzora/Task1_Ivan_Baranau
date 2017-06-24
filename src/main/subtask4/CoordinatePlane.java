package main.subtask4;

import java.util.ArrayList;

public class CoordinatePlane {
	private ArrayList<Area> statedAreas=new ArrayList<>();
	
	public void addStatedArea(Area area){
		statedAreas.add(area);
	}
	
	public boolean checkPointOnPlane(Point point){
		for(Area area:statedAreas){
			if(area.isPointInArea(point)){
				return true;
			}
		}
		return false;
	}
	
}
