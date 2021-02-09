package com.company;
import java.io.*;
class Main
{
    public static void oddEvenSort(int arr[], int n)
    {
        boolean isSorted = false;
        while (!isSorted)
        {
            isSorted = true;
            int temp =0;
            for (int i=1; i<=n-2; i=i+2)
            {
                if (arr[i] > arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
            for (int i=0; i<=n-2; i=i+2)
            {
                if (arr[i] > arr[i+1])
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
        }
        return;
    }
    public static void main (String[] args)
    {
        int arr[] = {34, 2, 10, 15, 12, 102, -1, 4};
        int n = arr.length;
        oddEvenSort(arr, n);
        for (int i=0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println(" ");
    }
}
