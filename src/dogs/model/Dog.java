package dogs.model;

public class Dog extends Entity {  // La classe est très simple ici mais il pourrait avoir des validations ou des algos plus complexes.
	
	//private static int numberOfDogs = 0;
	//private int id;
	private String name;
	private String breed;  // Idéalement faire une classe Breed (préférer à une enum)
	
	public Dog(String name, String breed) {
		super();
		//this.id = getNextId();
		this.name = name;
		this.breed = breed;
	}

	/*private int getNextId() {
		numberOfDogs++;
		return numberOfDogs;
	}*/
	
	/*public int getId() {
		return this.id;
	}*/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}

}
