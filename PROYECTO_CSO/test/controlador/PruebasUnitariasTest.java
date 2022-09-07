/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Exceptions.LoginException;
import Exceptions.NoUserException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



/**
 *
 * @author GAMER
 */
public class PruebasUnitariasTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of PruebasUnitarias method, of class PruebasUnitarias.
     */
    @Test
    public void testPruebasUnitarias() throws NoUserException, LoginException {
        System.out.println("PruebasUnitarias");
        PruebasUnitarias instance = new PruebasUnitarias();
        instance.PruebasUnitarias();
        // TODO review the generated test code and remove the default call to fail.
        
    }

   
}
