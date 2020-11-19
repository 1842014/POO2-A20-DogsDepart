package dogs.model;

import java.util.Collection;

public interface IEntityRepository<T extends Entity> {

	void add(T newEntity);
	
	Collection<T> getList();
}
