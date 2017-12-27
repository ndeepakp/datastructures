package com.learningds.modules.stack;

public class InsertionSort {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public void insertionSortCustom(int[] arr) {

        int key;

        for (int j = 1; j < arr.length; j++) {
            key = arr[j];
            int i = j - 1;

            while( (i > -1) && (arr[i] > key) ) {
                arr[i + 1] = arr[i];
                i--;
            }

            arr[i + 1] = key;
        }
    }

    public static void main(String... ar) {

        int[] arr = new int[]{34,2,12,56,9,7,44,333};
        
        // Print the second maximum number
        insertionSort(arr);
        System.out.println(arr[arr.length - 2]);
    }
}

/**
 * To learn more: http://www.geeksforgeeks.org/insertion-sort/
 **/
