package MasaiAssigments;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class anagram {

/* Output
output True if they are anagrams else False;
Sample Input 1
2
abcd
dcab
in put = 2 aa => aaa output = false
Sample Output 1
True
False */

    public static void main(String[] args) {
        
    

    // public static void validAnagram(String str1, String str2){
        //write your code here
        String str1="abcd";
        String str2="dcab";
      if (str1.length() != str2.length()) {
                System.out.println("False");
            } else {
                HashMap<Character, Integer> m1 = new HashMap<>();
                for (int i = 0; i < str1.length(); i++) {
                    char ch = str1.charAt(i);
                    int freq = m1.getOrDefault(ch, 0);
                    freq++;
                    m1.put(ch, freq);
                }
    
                HashMap<Character, Integer> m2 = new HashMap<>();
                for (int i = 0; i < str2.length(); i++) {
                    char ch = str2.charAt(i);
                    int freq = m2.getOrDefault(ch, 0);
                    freq++;
                    m2.put(ch, freq);
                }
    
                if (m1.equals(m2)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            // }
        }
    }
}
