package cforces;
import java.util.Scanner;
public class BeautifulMatrix{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[5][5];
 
        int r= 0, c=0;
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(arr[i][j] == 1){
                     r = i;
                     c = j;
                     System.out.println(r);
                     System.out.println(c);
                }
        
                
            }
        }
         
            System.out.println((2-r)+(2-c));
        }
    }
