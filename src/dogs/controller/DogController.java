package dogs.controller;

import dogs.dto.DogDTOFroCreate;
import dogs.model.Dog;
import dogs.model.IDogRepository;
import dogs.view.DogCreateView;
import dogs.view.IView;

public class DogController implements IDogController {

	
	private IDogRepository repository;

	public DogController(IDogRepository dogRepository) {
		this.repository = dogRepository;
	}

	@Override
	public void goToCreate() {
		IView dogCreateView = new DogCreateView(this);
		dogCreateView.display();
	}

	@Override
	public void addDog(DogDTOFroCreate dog) {
		this.repository.add(new Dog(dog.name, dog.breed));
	}

}
