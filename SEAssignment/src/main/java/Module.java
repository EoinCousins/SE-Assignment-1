

import java.util.ArrayList;
import java.util.List;

public class Module {
    
//initialise attributes
private String name;
private String ID;
List students = new ArrayList();
List associatedCourses = new ArrayList();

//constructor
public Module(String name, String ID){
    this.name = name;
    this.ID = ID;
}

public void setName(String name){
    this.name = name;
}

public String getName(){
    return name;
}

public void setID(String ID){
    this.ID = ID;
}

public String getID(){
    return ID;
}
}
