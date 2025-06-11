package Array;

import java.util.Arrays;

public class MaxSubArraySum_KadaneAlgo {
    public static void maxSum(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int CurrentSum=0;
        boolean flag=false;
        int neg_arr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)// Check if there is any negative number in the array
        {
            if(arr[i]<0)
            {
                neg_arr[i]=arr[i];
            }
        }
        if(Arrays.stream(neg_arr).allMatch(x -> x < 0)) // If all numbers are negative
        {
            flag=true;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(flag){
                maxSum=Arrays.stream(arr).min().getAsInt();
                break;
            }
            // If there is no negative number, we can apply Kadane's algorithm
            CurrentSum+=arr[i];
            if(CurrentSum < 0 ){
                CurrentSum=0;
            }
            maxSum=Math.max(maxSum, CurrentSum);

        }
        System.out.println("Maximum Subarray Sum is: " + maxSum);

    }
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        maxSum(arr);
        int[] arr2={-1,-2,-3,-4};
        maxSum(arr2);
    }
}
