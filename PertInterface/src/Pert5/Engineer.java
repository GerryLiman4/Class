package Pert5;

public class Engineer extends Pekerjaan {

	private String DoSomething;
	
	public Engineer( int JamKerja , String DoSomething) {
		super( JamKerja);
		
		this.setDoSomething(DoSomething) ;
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
		System.out.println("Using Wrench");
		
	}

}
