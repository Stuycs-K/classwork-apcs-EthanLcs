public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    // point a get x minus point b get x squared
    // point a get y minus point b get y squared
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    Point p4 = new Point(p3);
    System.out.println(p3 + " = " + p4);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    //start of equilateral triangle
    Point a = new Point(0,0);
    Point b = new Point(0,1);
    Point c = new Point((Math.sqrt(3.0) / 2.0), 1.0/2.0);
    System.out.println(distance(a,c));
    System.out.println(distance(b,c));

  }
}

