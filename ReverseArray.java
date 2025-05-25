public class ReverseArray {
    public static void ReverseArr(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int arr[]){
        int start=0;
        int end = arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16,18,20};
        System.out.println("The elements in the array in reverse order are:");
        ReverseArr(arr);
        System.out.println("\nThe elements in the array after reversing are:");
        reverse(arr);
    }
}
