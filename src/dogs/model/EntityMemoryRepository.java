package dogs.model;

import java.util.Collection;

public class EntityMemoryRepository<T extends Entity> implements IEntityRepository<T> {

	@Override
	public void add(T newEntity) {
			newEntity.getId();
	}

	@Override
	public Collection<T> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
