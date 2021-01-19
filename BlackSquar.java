package cforces;
import java.util.Scanner;
public class BlackSquar{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    	int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();
        int a4 = in.nextInt();
        int calories=0;
        in.nextLine();
        String s = in.next();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1') calories += a1;
            else if(s.charAt(i) == '2') calories += a2;
            else if(s.charAt(i) == '3') calories += a3;
            else calories += a4;
        }
        System.out.println(calories);
        in.close();
    }
}