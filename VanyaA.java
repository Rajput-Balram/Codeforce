package cforces;

import java.util.*;
public class VanyaA{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int[] arr = new int[n];
        int wide = 0;
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
            if(arr[i] > h) wide += 2;
            else
              wide++;
        }
         
        System.out.println(wide);
        in.close();
    }
}