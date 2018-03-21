package edu.tum.cs.i1.seecx;

import java.net.MalformedURLException;
import java.net.URL;
import java.awt.Point;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Main {


    // TODO: remove comment and instantiate Course object in main method
    public static Course course;

    // TODO: remove comment and instantiate LectureCourse object in main method
   
    public static LectureCourse lectureCourse;

    // TODO: remove comment and instantiate OnlineCourse object in main method
    public static OnlineCourse OnlineCourse;


    public static void main(String[] args) throws MalformedURLException {


        Date seecxStartDate = new Date(2017,05,30,12,0);
        List<Date> seecxDates = new ArrayList<>(1);
        seecxDates.add(seecxStartDate);


        // TODO: instantiate course here
        // And invoke printCourseTitle()
        // Use seecxDates for the list of course dates
        
        
        // with the title "SEECx" and one course date "2017-05-30 12:00". 
        //Use the existing attribute course of the class Main. Invoke the method 
       
        course = new Course("SEECx");
        
        course.dates = seecxDates;
        
        // //printCourseTitle() on the "SEECx" course object.
        course.printCourseTitle();

        Lecturer seecxLecturer = new Lecturer("Bernd", "Brügge", "1951");
        course.lecturer = seecxLecturer;


     
        Point pomLocation = new Point(100,70);
        
        lectureCourse =new LectureCourse("POM",pomLocation);
        
        lectureCourse.printCourseTitle();
        // TODO: instantiate lectureCourse here
        // And invoke printCourseTitle()
        // Use pomLocation for the course location

   
        
        
        


        URL seecxUrl = new URL("https://www.edx.org/course/software-engineering-essentials-tumx-seecx");

        // TODO: instantiate onlineCourse here
        // And invoke printCourseTitle()
        // Use seecxUrl for the course URL


        OnlineCourse = new OnlineCourse("SEECx", seecxUrl);
        OnlineCourse.printCourseTitle();




    }

}
