package function;

  import java.util.ArrayList;

public class fuction {
  
        // public static void print2DArr(int[][] A, int m, int n) {
        //     // Remove these two lines as m and n are already declared as parameters
        //     // int m = A.length;
        //     // int n = A[0].length;
    
        //     for (int i = 0; i < m; i++) {
        //         for (int j = 0; j < n; j++) {
        //             System.out.print(A[i][j] + " ");
        //         }
        //         System.out.println();
        //     }
        // }
    
        // public static void main(String[] args) {
    
        //     int[][] nums = new int[][]{
        //         {4, 0, 2, 5},
        //         {3, -1, 8, 9},
        //         {2, 0, 10, 15},
        //     };
    
        //     int m = nums.length;
        //     int n = nums[0].length;
    
        //     print2DArr(nums, m, n);
    
        //     nums[0][0] = 24;
        //     System.out.println();
        //     print2DArr(nums, m, n); // You need to pass m and n again for the updated array
    
        //     int[][] newnums = new int[4][6];
        //     print2DArr(newnums, 4, 6);
        // }
    
      //Q check even 
    
    //   public static void print2DArr(int[][] A, int m, int n) {
    
    //  for (int i = 0; i < m; i++) {
    //             for (int j = 0; j < n; j++) {
    //                 System.out.print(A[i][j] + " ");
    //             }
    //             System.out.println();
    //         }
    //     }
    // public static boolean isEven(int m){
    //   if((m%2)==0)
    //     return true;
    //   else
    //     return false;
    // }
      
    //   public static void main(String [] args){
    
    //     int n = 10;
    
    //     boolean flag =isEven(n);
    //     System.out.println(flag);
    //   }
    // printing function in function 
      // public static int add(int m, int n){
      //   return m+n;
      // }
      // public static int add(int m, int n, int o){
      //   return m+n+o;
      // }
      // public static void main(String[] args){
    
      //   int a=3, b=4,c=5;
    
      //   System.out.println(add(a,b));
      //   System.out.println(add(a,b,c));
      // }
      
    // checking is prime or not form 1 to 100 
    
      // public static boolean isPrime(int n){
      //   boolean flag = true; 
      //   for(int i=2 ; i<n; i++){
      //     if((n%i)==0 ){
      //       flag = false;
      //       break;
      //     }
      //   }
      //  return flag;  
      // }
    
      // public static void main(String[] args){
      //   for(int n=2; n<=100; n++){
      //     if(isPrime(n)){
      //       System.out.println(n+ ": Prime");
      //     }
      //     else{
      //       System.out.println(n+": Not Prime");
      //     }
      //   }
      // } 
    public static char toLowerCase(char c){
      return Character.toLowerCase(c);
    }
    
    public static String toLowerCase(String s){
      String ssmall  = "";
      for(int i= 0; i<s.length(); i++){
        ssmall = ssmall + toLowerCase(s.charAt(i));
      }
      return ssmall;
    }
    
      public static void toLowerCase(String[] sArr){
        for(int i=0; i<sArr.length; i++){
          System.out.print(toLowerCase(sArr[i])+" ");
        }
      }
      
      public static void main (String[] args){
        //Input : {"AMAN","RAJ","MADHU","FIDA"}
        // Output: {"aman","raj","madhu","faida"}
    
        String[] sarr = new String[]
          {"AMAN","RAJ","MADHU","FIDA"};
        toLowerCase(sarr);
      }
    
    
      
    }

    
    
      
    
    


 


