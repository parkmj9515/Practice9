package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable{
    //	필드
	private double width;
    private double height;

    //	생성자
    public Rectangle (double width, double height) {
    	super(5,6);
    	this.width = width;
    	this.height = height;
    }
    
    
	@Override
	public void resize(double s) {
		
	}


	@Override
	public double getArea() {
		return width * height;
	}


	@Override
	public double getPerimeter() {
		return  (width+height)*2;
	}	
	
	
}