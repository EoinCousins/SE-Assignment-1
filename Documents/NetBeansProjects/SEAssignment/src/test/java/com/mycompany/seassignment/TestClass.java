
package com.mycompany.seassignment;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestClass {
    
    public TestClass() {
    }

    @Test
    public void getUsername(){
        Student Eoin = new Student("Eoin Cousins", 22, "15/04/98", 17369166);
        assertEquals("Student: Eoin  Age: 22", "Student: Eoin  Age: 22");
    }
    
    @Test
    public void getName(){
        Module CT417 = new Module("Software Engineering III", "CT417");
        assertEquals(CT417.getName(), "Software Engineering III");
    }
    
    @Test
    public void setName(){
        Course ECE = new Course("ECE");
        ECE.setName("EEE");
        assertEquals(ECE.getName(), "EEE");
    }
    
}
