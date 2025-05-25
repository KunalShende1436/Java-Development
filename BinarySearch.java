public class BinarySearch {
    public static int binarySearch(int arr[],int key){
        int left=0;
        int right=arr.length-1;
        while (left<= right){
            int mid=(left+right)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                mid=mid+1;
            }
            else{
                mid=mid-1;
            }

        } 
            
        return -1; // Element not found
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16,18,20};
        int key = 10; 
        int index= binarySearch(arr, key);
        if(index==-1){
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}
