package No7;

public class Tabungan {
	private String nama = null;
	private int nomor=0;
	private int saldo=0;
	private int cekSaldo;
	private int cekSaldo1;
	private int setor;
	private int tarik;
	
	public Tabungan(String nama, int nomor, int saldo) {
		this.nama = nama;
		this.nomor = nomor;
		this.saldo = saldo;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getNomor() {
		return nomor;
	}
	public void setNomor(int nomor) {
		this.nomor = nomor;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	

	public void cekSaldo() {
		cekSaldo = saldo + setor;
	}
	public int getCekSaldo() {
		return cekSaldo;
	}
	public void cekSaldo1() {
		cekSaldo1 = saldo - tarik;
	}
	public int getCekSaldo1() {
		return cekSaldo1;
	}
	
	public void setor(int x) {
		setor = x ;
	}
	public int getSetor() {
		return setor;
	}
	
	public void tarik(int x) {
		if (cekSaldo <= tarik) {
			System.out.println("Penarikan anda tidak dapat dilakukan karena saldo tidak cukup");
		}else {
			tarik = x;
		}
	}
	public int getTarik() {
		return tarik;
	}
}
