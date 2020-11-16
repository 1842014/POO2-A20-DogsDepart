package dogs;

import dogs.model.Dog;
import dogs.model.IDogRepository;

public class DogDataSeeder {

	private IDogRepository repository;
	
	public DogDataSeeder(IDogRepository repository) {
		this.repository = repository;
		this.seedData();
	}

	private void seedData() {
		this.repository.add(new Dog("Django", "Bâtard"));
		this.repository.add(new Dog("Fitzou", "Husky"));
		this.repository.add(new Dog("Kalie", "Berger"));
		this.repository.add(new Dog("Filou", "Saucisse"));
		this.repository.add(new Dog("Django", "Husky / Caniche Royal"));

	}
	
}
