package Array;
public class LargestNumArray {
    public  static int largest(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,112,14,16,18,20};
        int max = largest(arr);
        System.out.println("The largest number in the array is: " + max);
    }
}
