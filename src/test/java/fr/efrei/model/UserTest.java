/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.efrei.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author extahliah
 */
public class UserTest {
    
    public UserTest() {
    }
    

    /**
     * Test of getLogin method, of class User.
     */
    @Test
    public void testGetLogin() {
        User instance = new User();
        instance.setLogin("user");
        String expResult = "user";
        String result = instance.getLogin();
        assertEquals(expResult, result);

    }


    /**
     * Test of getPwd method, of class User.
     */
    @Test
    public void testGetPwd() {
        User instance = new User();
        instance.setPwd("myPass");
        String expResult = "myPass";
        String result = instance.getPwd();
        assertEquals(expResult, result);
    }


    @Test
    public void testIsCorrect() {
        List<User> ids = new ArrayList();
        User instance = new User();
        instance.setLogin("login");
        instance.setPwd("pass");
        
        ids.add(instance); //to simulate that connection is accepted
        
        boolean expResult = false;
        boolean result = instance.isCorrect(ids);
        assertEquals(expResult, result);
    }
    
}
