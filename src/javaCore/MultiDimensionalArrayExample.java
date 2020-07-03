package javaCore;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[3][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 11;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		a[2][0] = -1;
		a[2][1] = 8;
		a[2][2] = 9;
		
		//Declaring an array literal
		/*int b[][] = {{1,2,3},{4,5,6},{7,8,9}};*/
		int smallest = a[0][0];
		int largest = a[0][0];
		int mincolumn = 0;
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j] + "\t");
			}System.out.println();
		}
		
		System.out.println("The smallest number is :");
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(a[i][j]<smallest){
					smallest = a[i][j];
					mincolumn = j;
				}
			}
		}System.out.println(smallest);
		
		int k = 0;
		int max = a[0][mincolumn];
		
		while(k<3){
			if(a[k][mincolumn]>max){
				max = a[k][mincolumn];
			}
			k++;
		}System.out.println("The largest number in the column within the lowest number in row is :" + max);
		
		System.out.println("The largest number is :");
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(a[i][j]>largest){
					largest = a[i][j];
				}
			}
		}System.out.println(largest);
	}
}


