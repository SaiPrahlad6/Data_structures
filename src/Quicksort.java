// Java program for implementation of QuickSort
import java.util.*;
class QuickSort
{
    int divide(int arr[], int low, int high)
    {
        int pivot = arr[high];
        System.out.println(pivot+" : pivotelement");
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {

            int pi = divide(arr, low, high);
            System.out.println("left Partition");
            //System.out.println(arr[pi]);
            for(int i : arr) {
                if(i<arr[pi])
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("Right Partition");
            for(int i : arr) {
                if(i>arr[pi])
                    System.out.print(i + " ");
            }
            System.out.println();
            // Recursively sort elements before
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array ");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}

