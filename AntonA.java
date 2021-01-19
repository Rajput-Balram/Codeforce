package cforces;
import java.util.Scanner;
public class AntonA{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int count =0;
        String s = in.next();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'A') count++;
            else
                count--;
        }
        if(count > 0) System.out.println("Anton");
        else if(count <0) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}