package No6;

import java.util.Scanner;

class BebasException extends Exception{
	public BebasException(String s) {
		super(s);
	}
}

public class No6Main {

	static int JenKel, menikah = 1;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println(">>>>> Wanita/Belum Menikah = 0 ||||| Pria/Menikah = 1 <<<<<");
		System.out.println("Masukkan Jenis Kelamin = ");
		JenKel = in.nextInt();
		System.out.println("Masukkan Status = ");
		menikah = in.nextInt();
		
		try {
			switch(JenKel) {
			case 1:
				switch(menikah) {
				case 1:
					throw new BebasException("Pria Menikah Pajak 5%");
				case 0:
					throw new BebasException("Pria Belum Menikah Pajak 10%");
				}	
			case 0:
				switch(menikah) {
				case 1:
					throw new BebasException("Wanita Menikah Pajak 3%");
				case 0:
					throw new BebasException("Wanita Belum Menikah Pajak 7%");
				}
			}

			throw new BebasException("Throw Custom Message Error");
		}catch(BebasException bebas) {
			System.out.println("Bebas Exception");
			System.out.println(bebas.getMessage());
			}

		}
}
