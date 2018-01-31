import java.io.*;

public class Test
{
  public static void main(String args[])
  {
    Point a,b;
    a = new Point(1.0f,2.0f,-1.0f);
    System.out.printf("Point a : x = %.1f , y = %.1f , z = %.1f\n",a.getX(),a.getY(),a.getZ());
    
    a.setX(5.5f);
    a.setY(6.6f);
    a.setZ(7.7f);
    System.out.printf("Point a : x = %.1f , y = %.1f , z = %.1f\n",a.getX(),a.getY(),a.getZ());
    
    a.setXYZ(1.0f,2.0f,-1.0f);
    System.out.printf("Point a : x = %.1f , y = %.1f , z = %.1f\n",a.getX(),a.getY(),a.getZ());
    
    b = new Point(0f,0f,0f);
    System.out.printf("Point b : x = %.1f , y = %.1f , z = %.1f\n",b.getX(),b.getY(),b.getZ());
    b.setPoint(a);
    System.out.printf("Point b : x = %.1f , y = %.1f , z = %.1f\n",b.getX(),b.getY(),b.getZ());
  }
}