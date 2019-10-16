import java.util.Scanner;
public class object{
	public static void main(String[] args){
		Scanner input= new Scanner (System.in);
		double totalbayar;
		double kembalian;
		kelas x = new kelas();
		System.out.println("|----|----|--------|-------------|");
		System.out.println("|Kode|Tipe|  Blok  | 	Harga 	 |");
		System.out.println("|----|----|--------|-------------|");
		System.out.println("| 1  | 36 |    A   | Rp. 500.000 |");
		System.out.println("| 2  | 36 |    B   | Rp. 300.000 |");
		System.out.println("| 3  | 37 |    A   | Rp. 800.000 |");;
		System.out.println("| 4  | 37 |    B   | Rp. 600.000 |");
		System.out.println("|----|----|--------|-------------|");
	
		System.out.println();
		System.out.print("Nama          : ");
		x.nama=input.nextLine();
		System.out.print("Alamat        : ");
		x.alamat=input.nextLine();
		System.out.println();
		
		int harga;
		System.out.print("Kode : ");
		harga=input.nextInt();
		if(harga==1){
			System.out.println("Blok :" +" 36");
			System.out.println("Tipe :" +" A");
			harga=500000;
		}
		else if(harga==2){
			System.out.println("Blok :" +" 36");
			System.out.println("Tipe :" +" B");
			harga=300000;
		}
		else if(harga==3){
			System.out.println("Blok :" +" 37");
			System.out.println("Tipe :" +" A");
			harga=800000;
		}
		else if(harga==4){
			System.out.println("Blok :" +" 37");
			System.out.println("Tipe :" +" B");
			harga=600000;
		}
		else{
			System.out.println("Maaf anda salah memasukkan tipe pesawat");
			}
		System.out.println("Harga Pesawat: "+harga);
		System.out.print("Bayar	     : ");
		x.bayar=input.nextInt();
		System.out.println();
		kembalian=x.bayar-harga;
		System.out.println("Kembalian    : "+kembalian);
	}
}
