/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.efrei.model.entities;

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
public class EmployesTest {
    
    public EmployesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of getId method, of class Employes.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Employes instance = new Employes();
        instance.setId(5);
        Integer expResult = 5;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /*
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Employes instance = new Employes();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Employes instance = new Employes();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Employes instance = new Employes();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Employes instance = new Employes();
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom = "";
        Employes instance = new Employes();
        instance.setPrenom(prenom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testGetTeldom() {
        System.out.println("getTeldom");
        Employes instance = new Employes();
        String expResult = "";
        String result = instance.getTeldom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testSetTeldom() {
        System.out.println("setTeldom");
        String teldom = "";
        Employes instance = new Employes();
        instance.setTeldom(teldom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testGetTelport() {
        System.out.println("getTelport");
        Employes instance = new Employes();
        String expResult = "";
        String result = instance.getTelport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testSetTelport() {
        System.out.println("setTelport");
        String telport = "";
        Employes instance = new Employes();
        instance.setTelport(telport);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testGetTelpro() {
        System.out.println("getTelpro");
        Employes instance = new Employes();
        String expResult = "";
        String result = instance.getTelpro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTelpro() {
        System.out.println("setTelpro");
        String telpro = "";
        Employes instance = new Employes();
        instance.setTelpro(telpro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testGetAdresse() {
        System.out.println("getAdresse");
        Employes instance = new Employes();
        String expResult = "";
        String result = instance.getAdresse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testSetAdresse() {
        System.out.println("setAdresse");
        String adresse = "";
        Employes instance = new Employes();
        instance.setAdresse(adresse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testGetCodepostal() {
        System.out.println("getCodepostal");
        Employes instance = new Employes();
        String expResult = "";
        String result = instance.getCodepostal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testSetCodepostal() {
        System.out.println("setCodepostal");
        String codepostal = "";
        Employes instance = new Employes();
        instance.setCodepostal(codepostal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testGetVille() {
        System.out.println("getVille");
        Employes instance = new Employes();
        String expResult = "";
        String result = instance.getVille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testSetVille() {
        System.out.println("setVille");
        String ville = "";
        Employes instance = new Employes();
        instance.setVille(ville);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Employes instance = new Employes();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Employes instance = new Employes();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Employes instance = new Employes();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Employes instance = new Employes();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Employes instance = new Employes();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
