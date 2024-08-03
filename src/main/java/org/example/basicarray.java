package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class basicarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
      /*   a[0] = 25;
        a[1] = 3425;
        a[2] = 2545;
        a[3] = 255;
        a[4] = 44;*/
        //System.out.println(a[3]);//
       for(int i =0; i < a.length;i++){
           a[i] = in.nextInt();
            //System.out.print(a[i] + " ");
        }
        for(int num : a){
           // System.out.print(num + " ");
        }
        System.out.print(Arrays.toString(a));



    }

}
