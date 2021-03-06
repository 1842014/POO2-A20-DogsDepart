package mock;

import java.util.List;

import dogs.controller.IDogController;
import dogs.dto.DogDTOForList;
import dogs.dto.DogDTOForCreate;

public class DogControllerSpy implements IDogController {

	public boolean goToCreateCalled = false;
	public boolean addDogCalled = false;
	public boolean goToListCalled = false;
	public boolean getDogListCalled = false;
	
	@Override
	public void goToCreate() {
		goToCreateCalled = true;
	}

	@Override
	public void addDog(DogDTOForCreate dog) {
		addDogCalled = true;
	}

	@Override
	public void goToList() {
		goToListCalled = true;
	}
}
