package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import pruebasunitarias.CalculosCNegra;
import pruebasunitarias.Miexceptionpersonalizada;

@RunWith(value=Parameterized.class)
public class TestCNegra {
    
    private int edad;
    private boolean esperado;
    
    public TestCNegra(int edad,boolean esperado)
    {
    	this.edad = edad;
    	this.esperado = esperado;
    }
        
    @Parameters
    public static ArrayList<Object[]> getData()
    {
        ArrayList<Object[]> d = new ArrayList<>();
        d.add(new Object[] {8,false});
        d.add(new Object[] {17,false});
        d.add(new Object[] {18,true});
        d.add(new Object[] {40,true});
        d.add(new Object[] {41,false});
        d.add(new Object[] {90,false});
        return d;
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
    }
    
    
    @Before
    public void setUp() {
        System.out.println("Before");        
    }
    
    @Test
    public void testVerificar() throws Miexceptionpersonalizada
    {
        CalculosCNegra cn= new CalculosCNegra();
        assertEquals(esperado,cn.verificar(edad)); 
    }
    
    @After
    public void tearDown() {
        System.out.println("After");        
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }
        
}