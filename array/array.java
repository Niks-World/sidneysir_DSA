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


// calcuating the sqare 2*2=4 4*4=16 until 100 *100 =10000

int[] squares = new int[100];

for(int i=0; i<squares.length; i++){
    squares[i]=(i+1)*(i+1);
}

for (int i=0; i<squares.length;i++){
    System.out.println(squares[i]);
}
/* op is
1  until 10000
4 
9
16
25
36
49
64
81
100
 */

// Note :  Once a array is created in java , its length is FiXED

// Q insert value 16 in index 2 of array there are 2 array A
// insert means i don't have to remove it i have to shift to right 

int[] A= new int[]{10,5,3,4,2,0,0};


int insIndex =2;
int insValue=16;

for(int i=0; i<A.length; i++){
    System.out.print(A[i]+" ");     // op=> 10 5 3 4 2 0 0 
}
System.out.println();  // breake line
// Step 1
for(int i = A.length-1; i> insIndex; i--){
    A[i] = A[i -1];
}
    A[insIndex] = insValue;   // Step 2

for(int i=0; i<A.length; i++){
    System.out.print(A[i]+" ");       // adding value 
}
System.out.println();
// op=> 10 5 16 3 4 2 0  // 16 is at 2 index position 



    }
}