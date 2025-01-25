package Searching;

public class LinearSearch {
    static int search(int[] a, int n, int x) {
        for(int i=0; i<n; i++) {
            if(a[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {34, 5, 2, 33};
        int n = a.length;
        int x = 34;

        int search_index = search(a, n, x);
        if(search_index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + search_index);
        }
    } 
}
