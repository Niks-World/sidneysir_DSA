package classAndfunction;

public class student {

    String name;
    int age;
    String batch;
    String address;

    public student(String n, int a, String b, String addr) {
        name = n;
        age = a;
        batch = b;
        address = addr;
    }

    public void setAge(int a) {
        age = a;
    }

    public static void main(String[] args) {
        student s1 = new student("Aman", 18, "PT-web28", "GOA");

        System.out.println(s1.name);
        System.out.println(s1.age);

        s1.setAge(21);

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
/*  out put is 
Aman
18
Aman
21
 done
 */