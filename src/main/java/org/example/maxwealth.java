package org.example;
import java.util.Arrays;
public class maxwealth {
    public static void main(String[] args){
        int[][] acc = {  {1,2,3},
                {5,6,7},
                {8,2,3}

        };
        System.out.println(Arrays.toString(sum(acc)));
    }
    static int[] sum(int[][] acc){
        int ans = Integer.MIN_VALUE;
       // int sum = 0;
        for( int per = 0 ;per < acc.length; per++){
            int sum=0;
            for(int well =0; well<acc[per].length;well++){
                sum= sum + acc[per][well];
            }
            if(sum>ans){
                ans = sum;
            }
        }return new int[]{ans};

    }
}
