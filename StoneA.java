package cforces;
import java.util.Scanner;
public class StoneA{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pair =0;
        String s = in.next();
        System.out.println(s.length());
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1))
                pair++;
        }
        System.out.println(pair);
    }
}