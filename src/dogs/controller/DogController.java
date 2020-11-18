package dogs.controller;

import java.util.ArrayList;
import java.util.List;

import dogs.dto.DogDTOForList;
import dogs.dto.DogDTOForCreate;
import dogs.model.Dog;
import dogs.model.IDogRepository;
import dogs.view.DogCreateView;
import dogs.view.DogListView;
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
	public void addDog(DogDTOForCreate dog) {
		this.repository.add(new Dog(dog.name, dog.breed));
	}

	@Override
	public void goToList() {
		IView dogListView = new DogListView(this);
		dogListView.display();
	}

	@Override
	public List<DogDTOForList> getDogList() {
		List<DogDTOForList> dogsDTO = new ArrayList<DogDTOForList>();
		for(Dog dog : this.repository.getList()) {
			dogsDTO.add(new DogDTOForList(dog.getId(), dog.getName(), dog.getBreed()));
		}
		return dogsDTO;
	}

}
