package Array;
public class SubArray {
    public static void subArray(int arr[]){
        int n=arr.length;
        int start;
        int end;
        for(int i=0;i<n;i++){
            start=i;
            for(int j=i;j<n;j++){
                end =j;
        
                // System.out.print("Subarray from index " + arr[i] + " to " + j + ": ");
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        System.out.println("The subarrays in the array are:");
        subArray(arr);
    }
}
