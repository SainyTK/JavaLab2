import java.io.*;

public class Test
{
  public static void main(String args[])
  {
    Point p1,p2,p3;
    p1 = new Point();
    p2 = new Point(1.0,2.0,-1.0);
    p3 = new Point(5.5,6.6,7.7);
    p1.setXYZ(2.0,3.0,4.0);

    p1.showPoint("p1");
    p2.showPoint("p2");
    p3.showPoint("p3");

    p3.setX(0);
    p3.setY(0);
    p3.setZ(0);

    p2.setPoint(p3);

    p1.showPoint("p1");
    p2.showPoint("p2");
    p3.showPoint("p3");
  }
}