package dogs.model;

import java.util.Collection;

public interface IDogRepository {
	public void add(Dog newDog);
	
	public Collection<Dog> getList();
}
