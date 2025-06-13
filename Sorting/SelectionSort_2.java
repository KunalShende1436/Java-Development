package Sorting;

public class SelectionSort_2 {
    public static  void selectionSort(int arr[]) {
        int n = arr.length;
        System.out.println("Unsorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i=0;i<n-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos=j;
                }
            }
            //Swapping 
            if(minPos!=i)
            {
                int temp=arr[i];
                arr[i]=arr[minPos];
                arr[minPos]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        int[] arr2 = {1, 2, 3, 4, 5};
        selectionSort(arr2);
    }
}
