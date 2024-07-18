package pack1;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		System.out.println("Everything about dog :");
		displayAnimail(d);
		Cat c=new Cat();
		System.out.println("Everything about cat : ");
		displayAnimail(c);
				
	}

	private static void displayAnimail(Animal a) {
		// TODO Auto-generated method stub
		a.breath();
		a.eat();
		a.sleep();
		a.talk();
		
	}

}
