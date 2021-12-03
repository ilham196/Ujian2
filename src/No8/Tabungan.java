package No8;

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
	
	public String toStirng() {
		return "Tabungan nomor "+nomor+" atas nama "+nama+" dengan saldo sebesar "+saldo;
	}
}
