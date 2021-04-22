/*Java Program to implement Bubble Sort*/
import java.util.Scanner;

public class BubbleSort {
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}

