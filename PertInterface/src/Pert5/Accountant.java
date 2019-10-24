package Pert5;

public class Accountant extends Pekerjaan{

	private String DoSomething;
	public Accountant( int JamKerja , String DoSomething) {
		super (JamKerja );
		
		this.setDoSomething(DoSomething);
		// TODO Auto-generated constructor stub
	}
	public String getDoSomething() {
		return DoSomething;
	}
	public void setDoSomething(String doSomething) {
		DoSomething = doSomething;
	}
	
			
	@Override
	public void UsingSomething() {
		// TODO Auto-generated method stub
		System.out.println("Using Calculator");
		
	}

}
