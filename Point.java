public class Point{
  
  private double x,y,z;
  
  public Point()
  {

  }

  public Point(double x,double y,double z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public double getX()
  {
    return this.x;
  }
  
   public double getY()
  {
    return this.y;
  }
   
   public double getZ()
  {
    return this.z;
  }
   
  public void setX(double x)
  {
    this.x = x;
  }
  
  public void setY(double y)
  {
    this.y = y;
  }
  
  public void setZ(double z)
  {
    this.z = z;
  }
  
  public void setXYZ(double x,double y,double z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  public void setPoint(Point p)
  {
    this.x = p.getX();
    this.y = p.getY();
    this.z = p.getZ();
  }

  public void showPoint(String pointName)
  {
    System.out.printf(pointName + " :: x : %.1f, y : %.1f, z : %.1f\n",this.x,this.y,this.z);
  }
}