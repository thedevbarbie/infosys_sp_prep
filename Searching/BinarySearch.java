package Searching;

import java.util.Arrays;

public class BinarySearch {
    static int binary_search_iterative(int[] a, int x) {
        int low=0, high = a.length-1;
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(a[mid] == x) {
                    return mid;
                } else if(x > a[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }


    public static void main(String[] args) {
        int a[] = {34, 5, 2, 33};
        int x = 34;
        Arrays.sort(a); 
        System.out.println(Arrays.toString(a));
        int search_index = binary_search_iterative(a, x);
        if(search_index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + search_index);
        }
    }
}
