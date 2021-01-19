package cforces;
import java.util.Scanner;
public class WordA{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int upper =0, lower =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >96) lower++;
            else
              upper++;
        }
        if(upper > lower) s = s.toUpperCase();
        else
           s = s.toLowerCase();
        System.out.println(s);
    }
}
