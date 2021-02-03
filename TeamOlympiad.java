package cforces;

 import java.util.ArrayList;
import java.util.Scanner;

public class TeamOlympiad {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int no = in.nextInt();
		 int[] arr = new int[no];
		 ArrayList<Integer> index1 = new ArrayList<>(); 
		 ArrayList<Integer> index2 = new ArrayList<>(); 
		 ArrayList<Integer> index3 = new ArrayList<>(); 
		 
		 int i=0;
		 while(i<no) {
			arr[i++]=in.nextInt();
		 }
		  
		 for(int j=0; j<no; j++) {
			 if(arr[j] == 1)
				 index1.add(j+1);
			 if(arr[j] == 2)
				 index2.add(j+1);
			 if(arr[j] == 3)
				 index3.add(j+1);
		 }
		 
		 int group =0;
		 if(index1.size()<index2.size()) {
			 if(index1.size()<index3.size())
				 group = index1.size();
			 else
				 group = index3.size();
		 }else {
			 if(index2.size()<index3.size()) 
			      group = index2.size();
			 else
				  group = index3.size();
		 }
		 
			 if(group>0) {
				 System.out.println(group);
				 for(int x=0; x<group; x++) {
					 System.out.print(index1.get(x)+" ");
					 System.out.print(index2.get(x)+" ");

					 System.out.println(index3.get(x)+" ");
				 }
			 }else
				 System.out.println(group);
	}

}
