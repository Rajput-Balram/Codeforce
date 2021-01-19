package cforces;
import java.util.Scanner;
public class SerejaA{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sereja=0, dima=0;
        int l = 0, r = n-1;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
             
        }
        int i=0;
        while(l<=r && i<n) {
        	if(i%2 ==0) {
        		if(arr[l] > arr[r])
                  sereja += arr[l++];
              else
                 sereja += arr[r--];
        	  i++;	
        	} else {
        		if(arr[l] > arr[r])
                  dima += arr[l++];
              else
                 dima += arr[r--];
        	  i++;	
        	}
        		
        }
 
        System.out.println(sereja+" "+dima);
    }
}