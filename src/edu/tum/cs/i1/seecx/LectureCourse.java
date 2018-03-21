package edu.tum.cs.i1.seecx;

import java.awt.Point;

// TODO: Implement LectureCourse Class

public  class LectureCourse extends Course{
	
	public Point location;
	
	public LectureCourse(String title,Point location) {
		super(title);
		// TODO Auto-generated constructor stub
		this.location=location;
	}
	
	
	
}