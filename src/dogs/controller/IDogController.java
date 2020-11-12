package dogs.controller;

import dogs.dto.DogDTOFroCreate;

public interface IDogController {

	void goToCreate();

	void addDog(DogDTOFroCreate dog);
}
