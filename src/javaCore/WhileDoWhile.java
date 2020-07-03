package javaCore;

public class WhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//While Loop -- Print 1 to 10
		
		int i=1;
		
		while(i<=10){
			System.out.println(i);
			i++;
		}
		
		System.out.println("----------------------------------------------------------------");
		
		//While Loop -- Print 10 to 1
		
		int j=10;
		
		while(j>=1){
			System.out.println(j);
			j--;
		}
		
		System.out.println("----------------------------------------------------------------");
		
		//Do While Loop -- Print 0 to 10
		
		int k=0;
		
		do{
			System.out.println(k);
			k++;
		}while(k<=10);
		
	}

}
