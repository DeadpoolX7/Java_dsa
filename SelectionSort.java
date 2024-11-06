package sorting;

import java.util.Scanner;

public class SelectionSort {
    static void selectionSort(int[] arr, int size) {
        for (int i = 0; i <= size - 1; i++) {
            int min_idx = i; // selecting i as minm index
            for (int j = i + 1; j <= size; j++) {
                // checking if it's the smallest
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }

            }
            // swap min index elem with it's correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner inpObj = new Scanner(System.in);
        System.err.println("Enter array size: ");
        try {
            int size = inpObj.nextInt();
            int[] arr = new int[size + 1];
            System.out.println("Input array elements: ");
            for (int i = 0; i <= size - 1; i++) {
                int elems = inpObj.nextInt();
                arr[i] = elems;
            }
            inpObj.close();
            selectionSort(arr, size);
            System.out.println("sorted array");
            for (int i : arr) {
                System.out.println(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.print(e);
        }

    }
}
