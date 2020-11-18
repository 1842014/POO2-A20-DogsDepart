package dogs.controller;

import java.util.List;

import dogs.dto.DogDTOForList;
import dogs.dto.DogDTOForCreate;

public interface IDogController {

	void goToCreate();

	void addDog(DogDTOForCreate dog);

	void goToList();

	List<DogDTOForList> getDogList();
}
