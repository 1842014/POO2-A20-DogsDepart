package repositoryTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dogs.model.Dog;
import dogs.model.DogMemoryRepository;
import dogs.model.IDogRepository;

public class DogRepositoryTests {

	
	private static final String ANY_NAME = "Zeus";
	private static final String ANY_BREED = "Labrador";
	private IDogRepository repository;
	private Dog anyDog;
	
	@Before
	public void setUpRepository() {
		repository = new DogMemoryRepository();
		anyDog = new Dog(ANY_NAME, ANY_BREED);
	}
	
	
	@Test
	public void WHEN_dogRepositoryIsCreated_ShouldInstaciateList() {
		assertTrue(this.repository.getList().isEmpty());
	}
	
	
	@Test
	public void WHEN_dogRepositoryIsCreated_THEN_addShouldAddDog() {
		this.repository.add(anyDog);
		
		final int EXPECTED_LIST_SIZE = 1;
		assertEquals(EXPECTED_LIST_SIZE, this.repository.getList().size());
		assertTrue(this.repository.getList().contains(anyDog));
	}
	
	@Test
	public void WHEN_dogRepositoryIsCreated_WITH_multipleDogs_THEN_idShouldBeCorrect() {
		Dog anyDog1 = new Dog(ANY_NAME, ANY_BREED);
		Dog anyDog2 = new Dog(ANY_NAME, ANY_BREED);
		Dog anyDog3 = new Dog(ANY_NAME, ANY_BREED);
		
		this.repository.add(anyDog1);
		this.repository.add(anyDog2);
		this.repository.add(anyDog3);

		
		
		final int EXPECTED_ID = this.repository.getList().size();
		assertEquals(EXPECTED_ID, anyDog2.getId());
	}
	

}
