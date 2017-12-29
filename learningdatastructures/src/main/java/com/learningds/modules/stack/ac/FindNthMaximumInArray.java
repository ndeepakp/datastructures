package com.learningds.modules.stack.ac;

public class FindNthMaximumInArray {

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
    
    public static int secondMax(int[] a) {
        int max = (a[0] > a[1]) ? a[0] : a[1];
        int secMax = (a[0] > a[1]) ? a[1] : a[0];
        for (int i = 2; i < a.length; i++) {
        	if (a[i] > max) {
        		secMax = max;
        		max = a[i];
        	} 
            secMax = (a[i] < max && a[i] > secMax) ? a[i] : secMax;
        }

        return secMax;
    }


    public static void main(String... ar) {
//        int[] arr = new int[]{8, 1, 66, 3, 34, 2, 4, 65, 124};
    	int[] arr = new int[]{2,3,1,5,4};
        System.out.println(findTheSecondMaximumElementInArray(arr));
        System.out.println(secondMax(arr));
    }
}
