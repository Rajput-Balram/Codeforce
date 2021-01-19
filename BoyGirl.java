package cforces;
import java.util.Arrays;
import java.util.Scanner;
public class BoyGirl{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String s = in.next();
        String ans = "CHAT WITH HER!";
        char[] arr = s.toCharArray();
        char[] arr1 = new char[s.length()];
        int len =0;
        
        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                if(arr[j] < arr[i]){
                    char temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                } 
            }
        }
        
       // System.out.println(Arrays.toString(arr));
        for(int k=0; k<s.length()-1; k++){
            if(arr[k] != arr[k+1]) {
            	arr1[k] = arr[k];
            	len++; 
            }
        }
        
        if(len %2 == 0) ans = "IGNORE HIM!";
        System.out.println(ans);
        
    }
}