package dogs.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DogMemoryRepository implements IDogRepository{

	private Map<Integer, Dog> dogs = new HashMap<Integer, Dog>();
	
	@Override
	public void add(Dog newDog) {
		dogs.put(newDog.getId(), newDog);
	}

	@Override
	public Collection<Dog> getList() {
		return this.dogs.values();
	}

}
