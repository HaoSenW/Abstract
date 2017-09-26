package com.mec.about_abstract;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		this(0);
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius*radius*3.14;
	}

	@Override
	public double getPerimeter() {
		return 2*3.14*radius;
	}
}
