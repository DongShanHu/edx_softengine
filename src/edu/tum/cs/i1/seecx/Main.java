package edu.tum.cs.i1.seecx;

import java.net.MalformedURLException;
import java.net.URL;
import java.awt.Point;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Main {


    // TODO: remove comment and instantiate Course object in main method
    //public static Course course;

    // TODO: remove comment and instantiate LectureCourse object in main method
    //public static LectureCourse lectureCourse;

    // TODO: remove comment and instantiate OnlineCourse object in main method
    //public static OnlineCourse onlineCourse;


    public static void main(String[] args) throws MalformedURLException {


        Date seecxStartDate = new Date(2017,05,30,12,0);
        List<Date> seecxDates = new ArrayList<>(1);
        seecxDates.add(seecxStartDate);


        // TODO: instantiate course here
        // And invoke printCourseTitle()
        // Use seecxDates for the list of course dates

        //course = 



        Point pomLocation = new Point(100,70);

        // TODO: instantiate lectureCourse here
        // And invoke printCourseTitle()
        // Use pomLocation for the course location

        //lectureCourse =



        URL seecxUrl = new URL("https://www.edx.org/course/software-engineering-essentials-tumx-seecx");

        // TODO: instantiate onlineCourse here
        // And invoke printCourseTitle()
        // Use seecxUrl for the course URL

        //onlineCourse = 




    }

}
