package Sorting;

public class BubbleSort {
    public static void bubbleSort(int[]arr)
    {
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }

        }
        if(flag==false)
        {
            System.out.println("Array is already sorted");
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        bubbleSort(arr);
        int [] arr2={1,2,3,4,5};
        bubbleSort(arr2);

    }
}
