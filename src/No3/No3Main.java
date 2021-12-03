package No3;

import java.util.Scanner;

public class No3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan Jarak (kilometer) = ");
		double jarak = input.nextDouble();
		System.out.println("Masukkan Waktu (jam) = ");
		double waktu = input.nextDouble();
		
		System.out.println("Kecepatan rata-rata anda adalah "+hitungKecepatan(jarak, waktu)+" km/jam");
	}
	static double hitungKecepatan (double jarak, double waktu) {
		return (jarak/waktu);
	}

}
