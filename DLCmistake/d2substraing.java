package DLCmistake;


import java.util.Arrays;

import string.string;

// import String.string;
public class d2substraing {
    public static void main(String[] args) {
        String s = "abc";
        for(int i = 0; i < s.length(); i++){
            for(int j = i+1; j < s.length(); j++){
                System.out.println(s.substring(i, j-1));
            } //output => a
        }
        // -----------------------------------------------

        int[] number ={5, 2, 9, 1, 5, 6};

        for(int i = 0; i < number.length - 1 ; i++){
            for(int j =0; j < number.length-1 ; j++){

                if(number[j] > number [j +1 ]){
                    int temp = number[j];
                    number[j] = number[ j + 1];
                    number [j = 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(number));
        // output => [2, 9, 1, 1, 5, 6]
///---------------------------------------------------------

        int[] source ={2, 4 ,6 ,8, 10};
        int[] destination = new int[source.length];

        for(int i = 0; i < source.length-1; i++){
            destination[i] = source[i];
        }
        System.out.println(Arrays.toString(destination));
        // output => [2, 4, 6, 8, 0]

        //--------------------------------------------------

        String text = "abababab";
        String subString = "aba" ;
        int count = 0;

        for(int i = 0; i <= text.length() - subString.length(); i++){
            if(text.substring(i, i + subString.length()).equals(subString)){
                  count++;
            }
          
        }
        System.out.println(count);
        // output => 3

        //-----------------------------------------------------------

        String[] names = {"Alice", "Bob", "Charlie" , "David"};
        String concatenated ="";

        for(int i = 0; i < names.length; i++){
            concatenated += names[i] + " ";
        }
        System.out.print(concatenated);
        // output => 3 its conting the spcae between nams
    }
}
