package controllerTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mock.DogControllerSpy;

public class DogControllerTests {

	private DogControllerSpy controller;
	
	@Before
	public void setUpController() {
		controller = new DogControllerSpy();
	}
	
	@Test
	public void WHEN_dogControllerIsCreated_WITH_goToCreateCalled_THEN_ShouldGoInMethod() {
		this.controller.goToCreate();
		
		assertTrue(this.controller.goToCreateCalled);
	}
	
	@Test
	public void WHEN_dogControllerIsCreated_WITH_addDogCalled_THEN_ShouldGoInMethod() {
		this.controller.addDog(null);
		
		assertTrue(this.controller.addDogCalled);
	}
	
	@Test
	public void WHEN_dogControllerIsCreated_WITH_goToListCalled_THEN_ShouldGoInMethod() {
		this.controller.goToList();
		
		assertTrue(this.controller.goToListCalled);
	}
	
	@Test
	public void WHEN_dogControllerIsCreated_WITH_noMethodCalled_THEN_ShouldNotGoInMethod() {
		
		assertFalse(this.controller.goToCreateCalled);
		assertFalse(this.controller.addDogCalled);
		assertFalse(this.controller.getDogListCalled);
		assertFalse(this.controller.goToListCalled);

	}

}
