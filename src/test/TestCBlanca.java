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

import pruebasunitarias.CalculosCBlanca;

@RunWith(value=Parameterized.class)
public class TestCBlanca {
	private boolean caso1,caso2,caso3;
    private int esperado;
    
    
    public TestCBlanca(boolean caso1, boolean caso2, boolean caso3, int esperado) {

       this.caso1=caso1;
       this.caso2=caso2;
       this.caso3=caso3;
       this.esperado=esperado;
    }
    
    @Parameters
    public static ArrayList<Object[]> getData()
    {
        ArrayList<Object[]> d = new ArrayList<>();
        d.add(new Object[] {false,false,false,3});
        d.add(new Object[] {false,true,false,3});
        d.add(new Object[] {false,false,true,2});
        d.add(new Object[] {false,true,true,2});
        d.add(new Object[] {true,true,false,1});
        d.add(new Object[] {true,true,true,1});
        d.add(new Object[] {true,false,true,2});
        d.add(new Object[] {true,false,false,3});                
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
    public void testnivelAcceso()
    {
        CalculosCBlanca cb = new CalculosCBlanca();
        assertEquals(esperado,cb.nivelAcceso(caso1, caso2, caso3)); 
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