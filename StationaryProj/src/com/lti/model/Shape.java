package com.lti.model;

public abstract class Shape implements Changeable {
	protected  int noSides ;
	protected float length;
	protected float breadth;
	
	public abstract float calcArea();
	public abstract float calcVol();
	
	public abstract void draw();
	
	/*public int getNoSides() {
		return noSides;
	}
	public void setNoSides(int noSides) {
		this.noSides = noSides;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	public Shape() {
		super();
	}
	public Shape(int noSides, float length, float breadth) {
		super();
		this.noSides = noSides;
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public String toString() {
		return "Shape [noSides=" + noSides + ", length=" + length + ", breadth=" + breadth + "]";
	}*/
	
	
}
