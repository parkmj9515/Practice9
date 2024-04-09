package com.javaex.ex04;

public abstract class Shape {
    
    public abstract double getArea(); // 넓이

    public abstract double getPerimeter(); // 둘레 길이
    
    private int countSides;
    
       
    public Shape(double getArea,double getPerimeter) {
    	this.getArea();
    	this.getPerimeter();
    }
    
    
}

