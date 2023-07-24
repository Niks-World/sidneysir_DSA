package classAndfunction;

public class point {
    
    // Instance Variables
    double x;
    double y;

    // Constructor
    public point(double xc, double yc){
        x = xc;
        y = yc;
    }

    public double distanceFromOrigin(){
        double dSq = x * x + y * y;
        return Math.sqrt(dSq);
    }

    public double distanceTo(point q){
        // Calcuate distance between this point and q.
       // (x1 -x2 )^2  + (y1 -y2)^2
        double dSq = Math.pow((x-q.x), 2) + Math.pow((y-q.y),2);
        return Math.sqrt(dSq); 

    }

    public static void main(String[] args) {
        point p1 = new point(3, 4);
        point p2 = new point(5, 12); 

        // double d1 = p1.distanceFromOrigin(); // Method call
        // System.out.println("Distance of p1 from 0: " + d1);

        // double d2 = p2.distanceFromOrigin(); // Method call 
        // System.out.println("Distance of p2 from 0: " + d2);
    
        /*  Out put 
          Distance of p1 from 0: 5.0
          Distance of p2 from 0: 13.0 */


        //Q Compute distance between p1 and p2

        // double d = p1.distanceTo(p2);
        System.out.println(p1.distanceTo(p2));
        // op=> 8.246211251235321
    }   
}
