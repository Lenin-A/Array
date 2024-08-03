package org.example;
import java.util.Arrays;
public class optimizeddigits {
    public static void main(String[] args){
        int[] arr = {12,445,5664,66644,33};
        System.out.println(find(arr));

    }static int find(int[] nums){
        int count = 0;
        for(int num: nums ){
            if(even(num)){
                count++;
            }

        }return count;
    }
    static boolean even(int num){
        int digits = countof(num);
        if(digits % 2 == 0){
            return true;
        }return false;
    }
    static int countof(int num){
        int count =0;
        if(num<0){
            num = num * -1;
        }
        return (int)(Math.log10(num))+1;
    }
}
