package creatingObjects;

public class Main {
	
	public static class Puppy{
		public Puppy(String name) {
			System.out.println("Passed name is : " + name);
		}
	}
	
	public static void main(String []args) {
		Puppy myPuppy = new Puppy("tommy");
	}
}
