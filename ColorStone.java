package cforces;
import java.util.Scanner;

public class ColorStone{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String stone = in.nextLine();
        String inst = in.nextLine();
        int fposition=0;
        
        for(int i=0; i<inst.length(); i++){
            if(inst.charAt(i) == stone.charAt(fposition))
                 fposition++;
        }
        System.out.println(fposition+1);
        in.close();
    }
}
