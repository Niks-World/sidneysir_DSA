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

    public static void main(String[] args) {
        point p1 = new point(3, 4);
        point p2 = new point(5, 12); 

        double d1 = p1.distanceFromOrigin(); // Method call
        System.out.println("Distance of p1 from 0: " + d1);

        double d2 = p2.distanceFromOrigin(); // Method call 
        System.out.println("Distance of p2 from 0: " + d2);
    }   
}
