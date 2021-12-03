package No7;

public class No7Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tabungan simpedes = new Tabungan("Tessy Wahyuni Riwayati", 89, 100000);
		simpedes.cekSaldo();
		simpedes.setor(8000);
		simpedes.cekSaldo();
		simpedes.tarik(230000);
		simpedes.tarik(60000);
		simpedes.cekSaldo();
		simpedes.toString();
		System.out.println("Saldo anda saat ini adalah "+simpedes.getSaldo());
		System.out.println("Setoran sebesar "+simpedes.getSetor()+" berhasil dilakukan, Saldo anda sekarang "+simpedes.getCekSaldo());
		System.out.println("Saldo anda saat ini adalah "+simpedes.getCekSaldo());
//		System.out.println("Penarikan tidak dapat dilakukan karena saldo anda tidak cukup");
		System.out.println("Penarikan sebesar "+simpedes.getTarik()+" saldo anda sekarang "+simpedes.getCekSaldo1());
		System.out.println("Saldo anda saat ini adalah "+simpedes.getCekSaldo1());
		
		
		
	}

}
