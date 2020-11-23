package com.mycompany.seassignment;

public class Student {
    
//initialise attributes
private String name;
private int age;
private String DOB;
private int ID;
private String username;
private String course;
private String[] registeredModules;

//constructor
public Student(String name, int age, String DOB, int ID){
    this.name = name;
    this.age = age;
    this.DOB = DOB;
    this.ID = ID;
}  

public void setName(String name){
    this.name = name;
}

public String getName(){
    return name;
}

public void setAge(int age){
    this.age = age;
}

public int getAge(){
    return age;
}

public void setDOB(String DOB){
    this.DOB = DOB;
}

public String getDOB(){
    return DOB;
}

public void setID(int ID){
    this.ID = ID;
}

public int getID(){
    return ID;
}

public String getUsername(){
    return "Student: " + name + " Age:" + age;
}
}
