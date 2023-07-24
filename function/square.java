package function;

public class square {

    // Method to calculate the square of a number
    public static int square(int x) {
        return x * x;
    }

    // Main method to test the square function
    public static void main(String[] args) {
        int a = 3, b = 4;

        int sq1 = square(a);
        int sq2 = square(b);

        System.out.print(sq1 + sq2);
    }
}
