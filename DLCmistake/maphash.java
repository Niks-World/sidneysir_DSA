package DLCmistake;

import java.util.HashMap;
import java.util.Map;

public class maphash {
    
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(3 ,9);
        map.put(2, 4);
        map.put(1, 1);

      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        System.out.print(entry.getValue() + " "); // Use System.out.print to separate values by space
    }// output is => 1 4 9 or 9 4 1 or 4 1 9 these all the output sufle


    //-------------------------------------------------------------------

    HashMap<Integer, Integer> nmap = new HashMap<>();

        nmap.put(5 ,25);
        nmap.put(3, 8); //null
        nmap.put(2, 4);
        System.out.println(nmap.get(3)+ map.get(2));
        //output is => NullPointerException when null is a value
        // now output is => 1 4 9 12
   
 //-------------------------------------------------------------------
System.out.println();

    int[] arr= {1, 3 , 4 , 2 ,2};
    HashMap<Integer, Integer> map2 = new HashMap<>();

    int duplicate = -1;

    for(int num : arr){
        if(map2.containsKey((num))){
            duplicate = num;
            break;
        }
        else{
            map2.put(num,1);
        }
    }
    System.out.println(duplicate); //output is => 2
// This program finds the first duplicate element 
//in the array arr using a HashMap. The first duplicate element is 2.


    }

 
}
