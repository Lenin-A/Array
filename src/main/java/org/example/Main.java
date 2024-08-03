package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];    // int[] - datatype  , arr - reference variable , new - create new object
        //System.out.println(arr[0]); // int[5] - creating object in the area of the heap memory


        String[] brr = new String[5];
        System.out.println(brr[1]);
    }
}