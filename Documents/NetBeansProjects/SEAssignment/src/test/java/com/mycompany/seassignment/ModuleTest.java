/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seassignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModuleTest {
    
    public ModuleTest() {
    Student Eoin = new Student("Eoin Cousins", 22, "15/04/98", 17369166);

    Module CT417 = new Module("Software Engineering III", "CT417");
    CT417.students.add(Eoin);
    }

    /**
     * Test of setName method, of class Module.
     */
    @Test
    public void testSetName() {
    }

    /**
     * Test of getName method, of class Module.
     */
    @Test
    public void testGetName() {
    }

    /**
     * Test of setID method, of class Module.
     */
    @Test
    public void testSetID() {
    }

    /**
     * Test of getID method, of class Module.
     */
    @Test
    public void testGetID() {
    }
    
}
