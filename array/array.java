public class array{
    public static void main(String[] args) {
        // print  i=0 ,0*1=0

        int n =10;
        int[] nums = new int[n];

        for(int i=0; i< n; i++){
            nums[i]= 0; // if =3 still op is 0
        }
        System.out.println(nums[0]);
  // op=> 0

  // How we print all the element 
  
  for( int i=0; i<n; i++){
    System.out.println(nums[i]);
  }
/* out put is 
 0
0
0
0
0
0
0 
 */
// how do we print a single name from array 

String[] names = new String[]
{ "Sidney","Amit","Raynsh","KAmal","faizan"};

System.out.println(names[2]);  // op=> Raynsh

// HOW do we replace the a single element form array 

int[] num= new int[]{4,0,-1,2,6,8,13,24};

for(int i=0; i<num.length ; i++){
    System.out.println(num[i]);  // this is my orignal arr
} // op=> 4 0 -1 2 6 8 13 24

num[7] = 1024; // here we are replace index of 7 with 1024

System.out.println();  // this is for giving space

for(int i=0; i<num.length; i++){   // here is new array  
    System.out.println(num[i]);    
} // new op after converting=> 4 0 -1 2 6 8 13 1024


//




    }
}