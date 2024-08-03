package org.example;
import java.util.Arrays;
import java.util.Scanner;
public class string {
    public static void main(String[] args){
        String[] str = new String[4];
        for(int i =0; i<str.length;i++){
            Scanner in = new Scanner(System.in);
            str[i] = in.nextLine();
                   System.out.print(Arrays.toString(str));
        }


    }          //  System.out.print(Arrays.toString(str));

    }



