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









    }
}