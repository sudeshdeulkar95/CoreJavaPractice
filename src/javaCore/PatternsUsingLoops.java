package javaCore;

public class PatternsUsingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=1;
		int l=10;
		for(int i=0;i<=4;i++){
			System.out.println();
			for(int j=1;j<=4-i;j++){
				System.out.print(k + "\t");
				k++;
			}
		}System.out.println();
	
	
		for(int i=1;i<=4;i++){
			System.out.println();
			for(int j=1;j<=i;j++){
				System.out.print(l + "\t");
				l--;
			}
		}System.out.println();
	}
}


