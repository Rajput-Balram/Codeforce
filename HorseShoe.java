package cforces;

import java.util.Scanner;
public class HorseShoe{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        in.close();
        int minNo=0;
        if(a == b||a==c||a==d)
             minNo += 1;
        if(b==c || b==d)
              minNo += 1;
        if(c==d)
            minNo += 1;
            
        System.out.println(minNo);
    }
}