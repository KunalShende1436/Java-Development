package Array;
public class MaxSubarraySum_Prefixsum {
public static void subArray(int arr[]){
        int n=arr.length;
        int start;
        int end;
        int currentSum=0;
        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        int prefixSum[] = new int[n];
        prefixSum[0] = arr[0]; // Initialize the first element of prefixSum
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i]; // Calculate prefix sum
        }
        for(int i=0;i<n;i++){
            start=i;
            for(int j=i;j<n;j++){
                end =j;
                currentSum = 0; // Reset current sum
                if(start == 0) {
                    currentSum = prefixSum[end]; // If start is 0, take the prefix sum directly
                } else {
                    currentSum = prefixSum[end] - prefixSum[start - 1]; // Calculate sum using prefix sums
                }    
              
            }
            System.out.println();
            if(currentSum > maxSum) {
                maxSum = currentSum; // Update maxSum 
            }
        }
        System.out.println("Maximum subarray sum is: " + maxSum);
    }        
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        System.out.println("The subarrays in the array are:");
        subArray(arr);
    }    
    
}
