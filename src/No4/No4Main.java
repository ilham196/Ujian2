package No4;

import java.util.Scanner;

public class No4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan sisa BBM dalam tangki (liter) = ");
		double sisa = input.nextDouble();
		System.out.println("Masukkan konsumsi BBM kendaraan (km/liter) = ");
		double JarakPerLiter = input.nextDouble();
		
		System.out.println("Kendaraan anda dapat menempuh jarak  "+hitungSisaJarak(sisa, JarakPerLiter)+
				" kilometer dengan sisa BBM yang ada di tangki");
	}
	static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		return sisaJarak;
	}

}
