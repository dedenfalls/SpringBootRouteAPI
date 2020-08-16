package com.kemal.rota.pckg;


public class CriticPoint {
	private String name;
	private String type;
	private Coord coordinate;
	
	
	public Coord getCoordinate() {
		return coordinate;
	}
	public void setCoordinate(Coord coordinate) {
		this.coordinate = coordinate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
