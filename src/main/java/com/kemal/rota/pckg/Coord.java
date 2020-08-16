package com.kemal.rota.pckg;

public class Coord {
	private float x;
	private float y;
	private String comment;


	public String getComment() {
		return comment;
	}







	public void setComment(String comment) {
		this.comment = comment;
	}







	public float getX() {
		return x;
	}







	public void setX(float x) {
		this.x = x;
	}



	public float getY() {
		return y;
	}



	public void setY(float y) {
		this.y = y;
	}



	public float calculateDist(float x,float y) {
		return (float) Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}

}
