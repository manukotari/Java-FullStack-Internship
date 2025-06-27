package abstraction;

public abstract class animal {
	private String name;
	
	public animal(String name) {
		this.name=name;
	}
	
	//abstract method
	public abstract void makesound();
	
	//signature method
	public void petname() {
		System.out.println("name:"+name);

	}
}
