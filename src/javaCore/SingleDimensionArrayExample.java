package javaCore;

public class SingleDimensionArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring an array object
		int a[] = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		
		//Declaring an array literal
		int b[] = {4,5,6};
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]);
		}
	}

}
