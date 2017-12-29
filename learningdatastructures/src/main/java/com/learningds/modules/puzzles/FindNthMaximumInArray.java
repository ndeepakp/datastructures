package com.learningds.modules.puzzles;

public class FindNthMaximumInArray {

    public static int findTheMaximumElementInArray(int[] arr) {
        int temp = arr[0];

        for (int i = 1; i <= arr.length - 1; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }

        return temp;
    }

    public static int findTheSecondMaximumElementInArray(int[] arr) {
        int temp = arr[0];
        int secondTemp = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (temp < arr[i]) {
                secondTemp = temp;
                temp = arr[i];
            }
        }

        return secondTemp;
    }

    public static void main(String... ar) {
//        int[] arr = new int[]{8, 1, 66, 3, 34, 2, 4, 65, 124};
    	int[] arr = new int[]{2,3,1,5,4};
        System.out.println(findTheSecondMaximumElementInArray(arr));
    }
}
