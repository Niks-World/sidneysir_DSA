package MasaiAssigments;
import java.util.HashMap;
public class MapSymbolSum {

/* Map Symbols & Sum
Description
• You are given a string, stored in a variable str , and the length of the string is stored in a variable N
• The string contains characters only from the below symbols
Ended
• Now every character is mapped to a certain value, such that the mapping starts from 1 and the difference between the values of two characters, is 1. Therefore, the mapping I
ooks as follows
• You have to find the sum of all characters in the string
• For example, consider the value stored in N = 4 , and str -
-8
then the required output will be
1 (value of l) + 2 (value of @) + 3 (value of #) + 4 (value of $ )
10, which is the required output
Note : The string contains only the symbols mentioned above, and no other characters are present in the string

Sample Input 1
4
!@#$
op= 10
Hint
In the sample test case, the value stored in N = 4 , and str =
I(value of l) + 2 (value of @) + 3 (value of #) + 4 (value of
Sample Output 1
10
then the required output will be
10, which is the required output*/


    public static void main(String[] args) {
        
        // public static void mapSymbolsSum(int n,String str){
            //write your code here
            String str="!@#$";
            int n=str.length();
            HashMap<String , Integer> map=new HashMap<>();
            map.put("!",1);
            map.put("@",2);
            map.put("#",3);
            map.put("$",4);
            map.put("%",5);
            map.put("^",6);
            map.put("&",7);
            map.put("*",8);
            // int count = 0;
            for (int i = 0; i < n; i++) {
                 String ch = String.valueOf(str.charAt(i));
                //  count +=str.charAt(i);
                     System.out.print(map.get(ch));
                }
        // }output is 10= 1+2+3+4
        
        

    }
}
