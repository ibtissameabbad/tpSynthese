/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Compte;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class CompteServiceTest {
    
    public CompteServiceTest() {
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
     * Test of initBd method, of class CompteService.
     */
//    @Test
//    public void testInitBd() {
//        System.out.println("initBd");
//        CompteService instance = new CompteService();
//        instance.initBd();
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }

    /**
     * Test of ouvrir method, of class CompteService.
     */
//    @Test
//    public void testOuvrir() {
//        System.out.println("ouvrir");
//        String rib = "";
//        double soldeInitial = 0.0;
//        CompteService instance = new CompteService();
//        Compte expResult = null;
//        Compte result = instance.ouvrir(rib, soldeInitial);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of crediter method, of class CompteService.
     */
    @Test
    public void testCrediter() {
        System.out.println("crediter");
        String rib = "cc1";
        double montant = 20;
        CompteService instance = new CompteService();
        int expResult = 1;
        int result = instance.crediter(rib, montant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of transferer method, of class CompteService.
     */
    @Test
    public void testTransferer() {
        System.out.println("transferer");
        String ribSource = "cc2";
        String ribDestination = "cc3";
        double montant = 40;
        CompteService instance = new CompteService();
        int expResult = 1;
        int result = instance.transferer(ribSource, ribDestination, montant);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
