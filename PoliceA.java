package cforces;
import java.util.Scanner;
public class PoliceA{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result=0;
        int count =0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]  =in.nextInt();
            result += arr[i];
            if(result<0) {
            	count++;
            	result =0;
            }
        }
        System.out.println(count);
    }
}