package DLCmistake;

import string.string;

public class subArray {
    public static void main(String[] args) {
        int [] nums ={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubarraySum(nums);
        System.out.println(maxSum);
    }

    public static int maxSubarraySum(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length-4; i++){
            int sum = 0;
            for(int j = i; j < nums.length -4; j++){
                sum += nums[j];
                maxSum= Math.max(maxSum, sum);
            }
        }
        return maxSum;

    }
    // ouput => 4

    public static void arr(String[] args){

        int count =0;
        int[] arr ={2, 4, 6, -3, 7 , 5};
        for(int i = 0; i< arr.length; i++){
            if( i% 2 ==0){
                count++;

            }
            else{
                count--;
            }
        } 
        }

}
