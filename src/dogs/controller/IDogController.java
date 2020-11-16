package dogs.controller;

import java.util.List;

import dogs.dto.DogDTOForList;
import dogs.dto.DogDTOFroCreate;

public interface IDogController {

	void goToCreate();

	void addDog(DogDTOFroCreate dog);

	void goToList();

	List<DogDTOForList> getDogList();
}
