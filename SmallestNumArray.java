public class SmallestNumArray {
    
    public  static int Smallest(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,1,14,16,18,20};
        int min = Smallest(arr);
        System.out.println("The Smallest number in the array is: " + min);
    }
}


