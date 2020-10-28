/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombreParfait;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author insset
 */
public class ParfaitTest {
    
    public ParfaitTest() {
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
     * Test of estDivisiblePar method, of class Parfait.
     */
    @org.junit.Test
    public void testEstDivisiblePar() {
        //given
        long n = 3;
        long val =6;
        Parfait instance = new Parfait();
        boolean expResult = true;
        
        //when
        boolean result = instance.estDivisiblePar(n, val);
        //then
        assertEquals(expResult, result);
    }

   

    /**
     * Test of estParfait method, of class Parfait.
     */
    @org.junit.Test
    public void testEstParfait() {
        //given
        int n=6;
        Parfait instance= new Parfait();
        boolean expResult = true;
        //when
        boolean result = instance.estParfait(n);
        //then
        assertEquals(expResult, result);
    }

    /**
     * Test of formaterResult method, of class Parfait.
     */
    @org.junit.Test
    public void testFormaterResult() {
        
        //given
        boolean estParfait= true;
        int n=6;
        Parfait instance = new Parfait();
        String expResult= "le nombre 6 est parfait";
        
        //when
        String result= instance.formaterResult(estParfait, n);
        
        //then
        assertEquals(expResult, result);
        Assert.assertNotNull(result);
    }
    
}
   



