package javaCollections;

import java.util.ArrayList;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print the number of times the value is repeated in the array
		//Find the unique number
		
		int[] a = {4,5,5,5,4,6,6,9,4};
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++){
			int k = 0;
			if(!al.contains(a[i])){
				k++;
				al.add(a[i]);
				for(int j=i+1;j<a.length;j++){
					if(a[i]==a[j]){
						k++;
					}
				}
				System.out.println("The number is:" + a[i]);
				System.out.println("Repetitions are:" + k);
				if(k==1){
					System.out.println("The unique number is:" + a[i]);
				}
			}
		}
	}
}




