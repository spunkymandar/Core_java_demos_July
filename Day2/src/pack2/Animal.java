package pack2;
//super class
public abstract class Animal {
	String animalName;
	
	public abstract void eat();
	public abstract void talk();

	public void sleep() {
		System.out.println("Animal sleeping generically");
	}
	public void breath() {
		System.out.println("Animal breathing generically");
	}
	
}
