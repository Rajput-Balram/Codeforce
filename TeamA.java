package cforces;
import java.util.Scanner;
public class TeamA{
    public static void main(String[] arrg){
        Scanner in = new Scanner(System.in);
        int a, b, c, max=0;
        int n = in.nextInt();
        while(n-- >0){
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            if(a+b+c >=2) max++;
        }
        System.out.println(max);
        
    }
}