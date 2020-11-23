package com.mycompany.seassignment;

import org.joda.time.*;
import java.util.ArrayList;
import java.util.List;

public class Course {
    
//initialise attributes
private String name;
List modules = new ArrayList();
List courses = new ArrayList();
private DateTime start;
private DateTime end;

//constructor
public Course(String name){
    this.name = name;
}

public void setName(String name){
    this.name = name;
}

public String getName(){
    return name;
}

public DateTime getStart(){
    return start;
}

public void setStart(DateTime start){
    this.start = start;
}

public DateTime getEnd(){
    return end;
}

public void setEnd(DateTime end){
    this.end = end;
}

}
