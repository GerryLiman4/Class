package Pert4;

public class Anak extends Ayah {

	
	private String spesial ;
	public Anak(  String nama, String spesial  , int umur)
	{
		super(nama , umur);
		this.setSpesial(spesial);
	}
	
	public String getSpesial() {
		return spesial;
	}
	public void setSpesial(String spesial) {
		this.spesial = spesial;
	}
	
	public void out()
	{
		System.out.println(getnama());
		System.out.println(getumur());
		System.out.println(getSpesial());
	}
	
	
	
}
