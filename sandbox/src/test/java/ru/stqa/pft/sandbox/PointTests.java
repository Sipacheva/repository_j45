package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;
import org.testng.Assert;

public class PointTests {
  @Test
  public void testDistance()
  {
    Point p1 = new Point(0, 0);
    Point p2 = new Point(0, 0);
    Assert.assertEquals(p1.distance(p2),0.0);

    p1 = new Point(0, -9.3);
    p2 = new Point(-18.5, 25.15);
    Assert.assertEquals(p1.distance(p2),39.10310090005651);


    p1 = new Point(1, 1);
    p2 = new Point(1, 1);
    Assert.assertEquals(p1.distance(p2),0.0);
  }
}
