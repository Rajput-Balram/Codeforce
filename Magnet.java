package cforces;
import java.util.Scanner;
public class Magnet{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int i=0, group =0;
        while(i!=n){
            arr[i++] = in.nextInt();
            
        }
        in.close();
        for(int j=0; j<n-1; j++){
            if(arr[j] != arr[j+1]) group++;
        }
        System.out.println(group+1);
    } 
} 