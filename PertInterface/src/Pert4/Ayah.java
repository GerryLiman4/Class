package Pert4;
import Pert5.Pakaian;

public class Ayah implements Pakaian{

	private String nama; 
	private int umur;
	public static void main(String[] args) {
		
		Ayah x = new Ayah("Budi", 50);
		Anak y = new Anak("Dono" , "Bulutangkis" , 15);
		//x.out();
		//String z = y.getSpesial();
		//y.out(z);
		x.PakaiBaju();
		y.PakaiBaju();

	}
	
	public Ayah(String nama , int umur)
	{
		super();
		this.nama = nama;
		this.umur = umur;
		
	
	}
	public String getnama() {
		return nama;
	}
	public void setnama(String nama) {
		this.nama = nama;
	}
	public int getumur() {
		return umur;
	}
	public void setumur(int umur) {
		this.umur = umur;
	}
	
	public void out()
	{
		System.out.println(getnama());
		System.out.println(getumur());
		
	}

	@Override
	public void PakaiBaju() {
		System.out.println(getnama() + " Pakai Baju ukuran XL "  );
		// TODO Auto-generated method stub
		
	}

}