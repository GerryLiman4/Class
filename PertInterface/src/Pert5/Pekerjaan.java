package Pert5;

public abstract class Pekerjaan implements Using{

	
	private int JamKerja ; 
	
	public static void main(String[] args)
	{
		
		Engineer Bob = new Engineer(10 , "Membereskan Alat");
		Accountant Alex = new Accountant(7 , "Menghitung Uang");
		
		Bob.UsingSomething();
		Alex.UsingSomething();
		
	}
	public Pekerjaan( int JamKerja)
	{
		super();
		
		this.setJamKerja(JamKerja);
		
		
	}
	

	

	public int getJamKerja() {
		return JamKerja;
	}


	public void setJamKerja(int jamKerja) {
		JamKerja = jamKerja;
	}
	
		
	
}
