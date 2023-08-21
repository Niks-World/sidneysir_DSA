package MasaiAssigments;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class Partyplan {

    /* Planning for a party
Description

Jim and Pam are inviting friends for a party. But, they want to invite only those friends who have helped them in any wayc So, they have made two arrays, indicating the number of p
eople they have taken help from. Each person, has been assigned a unique ID, in the form of a number.
Both, Jim and Pam make their separate invite list A and B based on the number of people, they have taken help from. Find out if the lists created by the two of them are same or no
t.
Note: A person might have helped them multiple times, and obviously would be invited only once

Output
For each test case, print Yes , if the lists created by Jim and Pam are same, else print No
Sample Input 1
6
122345
Sample Output 1
Yes

input
6
123455
output = No

Hint
In the first sample test case, the list created by Pam is 1 2 3 4 5 , while the one created by Jim is 1 2 3 a 5 . Since, both of them are equal, therefore, the answer is Yes
In the second sample test case, the list created by Pam will be 1 2 3 4 , while the one created by Jim is 1 2 3 4 5 . Since, both of them are not equal, therefore, the answer is No
*/




    public static void main(String[] args) {

        // public static void partyPlanning(int n,int[] arr1, int m , int[] arr2){
            int n=123455;
            int m=122345;
            int[] arr1={6};
            int[] arr2= {6};
            //write your code here
             Set<Integer> pamSet = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    pamSet.add(arr1[i]);
                }
        
                Set<Integer> jimSet = new HashSet<>();
                for (int i = 0; i < m; i++) {
                    jimSet.add(arr2[i]);
                }
        
                if (pamSet.equals(jimSet)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            // }
        }
        
        

    }

