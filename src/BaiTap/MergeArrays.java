package BaiTap;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {5, 12, 8, 21, 3, 9, 15, 4, 10, 7, 27};
        int[] arr2 = {45, 2, 33, 19, 88, 56, 12, 7, 91, 24};
        int[] arr3 = new int[arr1.length + arr2.length];

        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
