//  Реализовать алгоритм сортировки слиянием.

import java.util.ArrayList;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
//        создадим массив
        int[] arr = new int[]{5, 1, 2, 6, 8, -11, 9, 14, 22, -3, 16, 2, 4, 1};
        mergeArr(arr,14);
        for (int el:
             arr) {
            System.out.print(el + " ");
        }
    }
    public static void mergeArr(int[] nums, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = nums[i];
        }
        mergeArr(left, mid);
        mergeArr(right, n - mid);
        merge(nums, left, right, mid, n - mid);
    }

    public static void merge(int[] nums, int[] leftArr, int[] rightArr,
                             int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                nums[k++] = leftArr[i++];
            }
            else {
                nums[k++] = rightArr[j++];
            }
        }
        while (i < left) {
            nums[k++] = leftArr[i++];
        }
        while (j < right) {
            nums[k++] = rightArr[j++];
        }
    }
}

