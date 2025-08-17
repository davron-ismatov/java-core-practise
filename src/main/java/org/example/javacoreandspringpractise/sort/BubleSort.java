package org.example.javacoreandspringpractise.sort;

public class BubleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,3,5,6,4,2};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
