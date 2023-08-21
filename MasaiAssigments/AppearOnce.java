package MasaiAssigments;
import java.util.HashMap;

public class AppearOnce {
    public static void main(String[] args) {
        
        /* Appear Once
Description
• You are given an array, whose size is stored in a variable with the name N
• The array is stored in a variable with the name arr
• You have to find the sum of all the elements of the array which are unique.
• For example, consider the value stored in N= 7 , 
    and the value stored in arr = . Since there are two numbers that are unique i.e 8 and 6.
• Then the required output will be 8+6 = 14 , which is the required output */

/*  Sample Input 1
7
3533856
Sample Output 1
14 */

// public static void appearOnce(int N, int[] arr){
    //write code here

    int[] arr ={3,5,3,3,8,5,6};
   
       HashMap<Integer, Integer> map= new HashMap<>();
       
   // Iterate over the arr to create key-value pairs
   for (int num : arr) {
             map.put(num, map.getOrDefault(num, 0) + 1);
         }
 
         int sum = 0;
 
     
         for (int num : arr) {
             if (map.get(num) == 1) {
                 sum += num;
             }
         }
 
 
   // Iterate over the created object to find unique Elements and calculate the sum.
   System.out.println(sum);
 
   
    // }
}
}