public class MaxSubarraySum {
    public static void subArray(int arr[]){
        int n=arr.length;
        int start;
        int end;
        int currentSum=0;
        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        for(int i=0;i<n;i++){
            start=i;
            for(int j=i;j<n;j++){
                end =j;
                currentSum = 0; // Reset current sum      
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k] + " ");
                    currentSum += arr[k]; // Calculate the sum of the current subarray
                }
                System.out.println();
                System.out.println("Current Sum:"+currentSum);
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
