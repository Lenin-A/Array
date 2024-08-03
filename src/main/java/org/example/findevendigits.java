package org.example;
import java.util.Arrays;
public class findevendigits {
    public static void main(String[] args){
        int[] arr = {135,223,998,12343,998};
            //System.out.println(findnum(arr));
            System.out.println(countof(-3555));

    }
    static int findnum(int[] num){
        int count =0;
        for(int i =0;i<num.length;i++){
            if(even(num[i])){
                count++;
            }
        }return count;
    }
    static boolean even(int num){
        int digits = countof(num);
        if(digits %2 == 0){
            return true;
        }return false;


    }
    static int countof(int num){
        int count=0;
        if(num<0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }

        while(num>0){
            count++;
            num=num/10;
        }
        return count;

    }



}
