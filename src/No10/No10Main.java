package No10;

public class No10Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sekolah sekolah = new Sekolah();
		SMK set = new SMK();
		
		
		set.nama("Sekolah Menengah Kejuruan Walisongo");
		set.alamat("Jl. Ki Mangunsarkoro");
		set.jenjang("Sekolah Menengah Kejuruan Swasta");
		
		sekolah.nama(); System.out.println(set.getNama());
		sekolah.alamat(); System.out.println(set.getAlamat());
		sekolah.jenjang(); System.out.println(set.getJenjang());
		
		SMA set1 = new SMA();
		set1.nama("Sekolah Menengah Atas Walisongo");
		set1.alamat("Jl. Ki Mangunsarkoro");
		set1.jenjang("Sekolah Menengah Atas Swasta");
		
		sekolah.nama(); System.out.println(set1.getNama());
		sekolah.alamat(); System.out.println(set1.getAlamat());
		sekolah.jenjang(); System.out.println(set1.getJenjang());
		
		
	}

}
