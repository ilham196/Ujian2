package No1;

import java.util.Scanner;

public class No1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Masukkan nilai maksimal deret = ");
		int batas = in.nextInt();
		cetakFibonacci(batas);
		
	}
	
	static void cetakFibonacci(int batas) {
		int fibo[] = new int[batas];
		
		fibo[0] = 1;
		fibo[1] = 1;
		for (int i = 2; i < batas; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		for (int i = 0; i <= 5; i++) {
			System.out.print(fibo[i]+ " ");
		}
	}

}
