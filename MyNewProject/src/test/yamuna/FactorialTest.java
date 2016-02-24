package yamuna;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

  @Test
  public void canary() {
    assertTrue(true);
  }
  
  @Test
  public void factorialOfZeroIsOne(){
    Factorial fac = new Factorial();
    assertEquals(1, fac.findFact(0));
  }
  
  @Test
  public void factorialOfTwoIsTwo(){
    Factorial fac = new Factorial();
    assertEquals(2, fac.findFact(2));
  }
  
  @Test
  public void factorialOfFiveIs120(){
    Factorial fac = new Factorial();
    assertEquals(120, fac.findFact(5));
  }

}
