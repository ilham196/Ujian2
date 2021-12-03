package No9;

import java.util.Scanner;

public class No9Main {
	static int[] nilai=new int[5];
	static int[] arr = new int[5];
	static Scanner in = new Scanner(System.in);
	
	public static int jumlahArray(int[] nilai) {
		System.out.println("Masukkan 5 angka");
		int sum=0;
		for (int i = 0; i < nilai.length; i++) {
			nilai[i] = in.nextInt();
			sum += nilai[i];
		}
		System.out.println("Hasilnya "+sum);
		
		return sum;
	}
	
	
	public static boolean cariNilai(int[] arr, int nilai) {
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == nilai) 
				return true;
			}
		System.out.println("Cari nilai array = "+cariNilai(arr, 0));
		return false;
	}
	public static void main(String[] args) {
		jumlahArray(nilai);
		cariNilai(arr, 0);
		
		
	}
}
