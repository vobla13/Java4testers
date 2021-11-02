package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Point p1 = new Point(9, -1);
    Point p2 = new Point(2, -25);
    assert p1.distance(p2) == 25;
  }

  @Test
  public void testDistance2() {
    Point p1 = new Point(9, -1);
    Point p2 = new Point(2, -25);
    Assert.assertEquals(p1.distance(p2), 25);
  }

}
