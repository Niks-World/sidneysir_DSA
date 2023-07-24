package classAndfunction;

public class Cricle {
    double radius;

    public Cricle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Cricle c1 = new Cricle(5);

        System.out.println("Radius of circle C1 is: " + c1.getRadius());
        // op=> Radius of circle C1 is: 5.0

        c1.setRadius(6);

        System.out.println("Radius of Circle c1 is: " + c1.getRadius());
        //Radius of Circle c1 is: 6.0

        System.out.println("Area of Circle c1 is: " + c1.area());
        System.out.println("Perimeter of Circle c1 is: " + c1.perimeter());
    
        /* out put 
        Area of Circle c1 is: 113.09733552923255
        Perimeter of Circle c1 is: 37.69911184307752 
         */
    }
}
