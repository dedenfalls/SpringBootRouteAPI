package com.kemal.rota.pckg;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.ToString;

@ToString

@Document(collection = "Route")
public class Route {
	
	@Id
	private int id;
	private String name;
	private Coord[] routePoints;
	private CriticPoint[] p;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CriticPoint[] getP() {
		return p;
	}

	public void setP(CriticPoint[] p) {
		this.p = p;
	}

	public Coord[] getRoutePoints() {
		return routePoints;
	}

	public void setRoutePoints(Coord[] routePoints) {
		this.routePoints = routePoints;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
