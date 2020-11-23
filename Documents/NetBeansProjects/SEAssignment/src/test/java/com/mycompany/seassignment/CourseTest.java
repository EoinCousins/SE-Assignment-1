package com.mycompany.seassignment;

import org.junit.Test;
import static org.junit.Assert.*;

public class CourseTest {
    
    public CourseTest() {
    Student Eoin = new Student("Eoin Cousins", 22, "15/04/98", 17369166);
    System.out.println(Eoin.getUsername());
   
    Module CT417 = new Module("Software Engineering III", "CT417");
    CT417.students.add(Eoin);
   
    Course ECE = new Course("ECE");
    ECE.modules.add(CT417);
    }

    /**
     * Test of setName method, of class Course.
     */
    @Test
    public void testSetName() {
    }

    /**
     * Test of getName method, of class Course.
     */
    @Test
    public void testGetName() {
    }

    /**
     * Test of getStart method, of class Course.
     */
    @Test
    public void testGetStart() {
    }

    /**
     * Test of setStart method, of class Course.
     */
    @Test
    public void testSetStart() {
    }

    /**
     * Test of getEnd method, of class Course.
     */
    @Test
    public void testGetEnd() {
    }

    /**
     * Test of setEnd method, of class Course.
     */
    @Test
    public void testSetEnd() {
    }
    
}
