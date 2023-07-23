package string;

public class string {
    public static void main(String[] args) {
        String password = "abc1234";

        if (password.length() > 6) {
            System.out.print("Valid password");
        } else {
            System.out.println("Invalid password : must be more than 6");
        }

        System.out.println();

        //-----------------------------------------------------------
        String name = "Masai School";

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        System.out.println();

        //-----------------------------------------------------------
        String name1 = "NIkhil";

        for (int i = name1.length() - 1; i >= 0; i--) {
            System.out.println(name1.charAt(i));
        }

        System.out.println();

        //----------------------------------------------
        String m = "Masai School";
        String mnew = "";

        for (int i = 0; i < m.length(); i++) {
            mnew = mnew + m.charAt(i);
        }
        System.out.println(mnew);

        //----------------------------------------------------------
        //Q print and count the vowel in given string

        String nam = "Nikhil"; //2 vowels and count it and sum
        // Convert the string to lowercase to consider both uppercase and lowercase vowels
        String lowercaseStr = nam.toLowerCase();

        // Initialize a variable to count the vowels
        int vowelCount = 0;

        // Iterate through each character in the string
        for (char ch : lowercaseStr.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("No of vowels: " + vowelCount);
        // op=> no of vowel is 2

        // now print the vowel only from Nikhil (i i) 2 times

        String nam2 = "Nikhil";
        for (int i = 0; i < nam2.length(); i++) {
            char ch = nam2.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " ");
            }
        }
    }
}
