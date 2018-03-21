# Object Oriented Programming 1 Exercise

Welcome to the 1st programming exercise! In this exercise, you will
implement some parts of the University Application.

### Part 1: Encapsulation

In the requirements of the University App, we have identified FR2, which
shows the need for a Course object:

> FR2: Check **course** details: A student can **see details** about a course
> such as the **course times**, the **location** of the lecture hall on a map
> and other course **attendees** including their name and picture.

**You have the following tasks:**

1. ✅[Course Object](testHierarchy[Checking class Course],testFields[Checking class Course])
Create a **`Course`** class (in the file Course.java). A Course class should have the following attributes. For now, make all attributes **`public`**.

    1.  **`title`**: Course name of type String
    2.  **`lecturer`**: Object of type Lecturer
    3.  **`dates`**: The course dates, which is a list of Date objects
        (`List<Date>`)
    4.  **`attendees`**: A list of Student objects (`List<Student>`)


@startuml
interface Person

class Student
class Lecturer


Student -up-|> Person
Lecturer -up-|> Person

class Course {
  +<color:testsColor(testFields[Checking class Course])>title: String</color>
  +<color:testsColor(testFields[Checking class Course])>dates: List<Date></color>
  +<color:testsColor(testMethods[Checking class Course],testPrintCourseTitle)>printCourseTitle(): void</color>
}


Student "*" -left-  Course #testsColor(testFields[Checking class Course]): attendees 
Lecturer "1" -right-  Course #testsColor(testFields[Checking class Course]): lecturer 

@enduml

 

2. ✅[Course Constructor](testConstructors[Checking class Course])
Create a constructor for Course with one argument **`title`** of type String,
which initializes the title value of Course objects.

3. ✅[printCourseTitle()](testMethods[Checking class Course],testPrintCourseTitle) 
Create a public method **`printCourseTitle()`** with return type void and no
arguments. Implement that the method prints out the course title using
`System.out.println()`. 

5. ✅[Course Instance](testCourseObject) 
Create an object (i.e. instantiate an object) of type `Course` in the **`main()`** method with the title "SEECx" and one course date "2017-05-30 12:00". Use the existing attribute **`course`** of the class `Main`. Invoke the method `printCourseTitle()` on the "SEECx" course object.

5. **Optional exercise**: Create a Lecturer and some student objects and reference them in the SEECx course object
 

### Part 2: Inheritance
``
We want the University App to both support *Online Courses* and *Lecture
Courses*. There are few differences between Online Courses and Lecture
Courses. Lecture course take place in a lecture hall which has an
location. Online courses however do not directly have an location.
Instead they have an URL where you can find the course material. To take
this into account, we create subclasses of the Course class.

**You have the following tasks:**

1. ✅[LectureCourse Subclass](testHierarchy[Checking class LectureCourse]) 
Create the subclass **`LectureCourse`** which extends the Course class
with:

    1.  ✅[LectureCourse Attributes](testFields[Checking class LectureCourse])
    Create an attribute **`location`** of the Java type Point. This will store
    the location of the lecture hall as x and y coordinates.
    2.  ✅[LectureCourse Constructor](testConstructors[Checking class LectureCourse])
    Create a constructor with two arguments: **`title`** of
    type String and **`location`** of type Point. The constructor should
    initialize both the title and location value
    of LectureCourse objects.
    3. ✅[LectureCourse Instance](testLectureCourseObject)  
    Instantiate the `LectureCourse` object with the title "POM" and the location "100, 70" in the `main()` method. Use the existing attribute **`lectureCourse`** of the class `Main`. Invoke the method `printCourseTitle()` on the "POM" course object.

2. ✅[OnlineCourse Subclass](testHierarchy[Checking class OnlineCourse]) 
Create another subclass of Course, named **`OnlineCourse`**:

    1.  ✅[OnlineCourse Attributes](testFields[Checking class OnlineCourse])
    Create an attribute **`url`** of the Java type URL. This will store the URL
    for the course material.
    2.  ✅[OnlineCourse Constructor](testConstructors[Checking class OnlineCourse])
    Create a constructor with two arguments: **`title`** of
    type String and **`url`** of type URL. The constructor should
    initialize both the title and url value of OnlineCourse objects.
    3. ✅[OnlineCourse Instance](testOnlineCourseObject)
    Instantiate the `OnlineCourse` object with the title "SEECx" and the URL "https://www.edx.org/course/software-engineering-essentials-tumx-seecx" in the `main()` method. Use the existing attribute **`onlineCourse`** of the class `Main`. Invoke the method `printCourseTitle()` on the "SEECx" course object.
 

@startuml

class Course {
  +title: String
  +dates: List<Date>
  +lecturer: Lecturer
  +attendees: List<Student>
}


class OnlineCourse {
    +<color:testsColor(testFields[Checking class OnlineCourse])>url: URL</color>
}
OnlineCourse -up-|> Course #testsColor(testHierarchy[Checking class OnlineCourse])



class LectureCourse {
    +<color:testsColor(testFields[Checking class LectureCourse])>location: Point</color>
}
LectureCourse -up-|> Course #testsColor(testHierarchy[Checking class LectureCourse])


@enduml
