package Basics;

import java.util.Arrays;

public class arraylist {
    public static class ArrayList {
        int[] arr = new int[2];
        int index = 0;
        int size = 0;
        public void add(int ele) {
            if(size == arr.length) {
                int[] brr = Arrays.copyOf(arr, arr.length*2);
                arr = brr;
            }
            arr[index] = ele;
            index++;
            size++;
        }
    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size);
        arr.add(5);
        System.out.println(arr.size);
    }
}
