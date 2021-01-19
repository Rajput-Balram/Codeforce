package cforces;
import java.util.Scanner;
public class PetyaStringA{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        in.close();
        int m = 0;
        s1  = s1.toLowerCase();
        s2  = s2.toLowerCase();
        m = s1.compareTo(s2);
        if(m > 0) m = 1;
        else if(m<0) m = -1;
        System.out.println(m);
    }
}