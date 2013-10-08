/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testsonarwithdefaultnetbeans;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author DickD
 */
public class TestSonarWithDefaultNetbeansTest
{
  TestSonarWithDefaultNetbeans instance;

  @Before
  public void setup()
  {
    instance = new TestSonarWithDefaultNetbeans();
  }

  @Test
  public void testAdd()
  {

    Assert.assertEquals(6, instance.add(2, 4));
  }

  @Test
  public void testSubtract()
  {

    Assert.assertEquals(2, instance.subtract(6, 4));
  }
}
