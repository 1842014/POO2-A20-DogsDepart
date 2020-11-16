package controllerTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mock.WelcomeControllerSpy;

public class WelcomeControllerTests {

	private WelcomeControllerSpy controller;
	
	@Before
	public void setUpController() {
		this.controller = new WelcomeControllerSpy();
	}
	
	
	
	@Test
	public void WHEN_controllerIsCreated_WITH_wantToCreateDogCalled_THEN_ShouldGoInMethod() {
		this.controller.wantToCreateDog();
		
		assertTrue(this.controller.wantToCreateDogCalled);
	}
	
	@Test
	public void WHEN_controllerIsCreated_WITH_wantToShowListDogCalled_THEN_ShouldGoInMethod() {
		this.controller.wantToShowListDog();
		
		assertTrue(this.controller.wantToShowListDogCalled);
	}
	
	@Test
	public void WHEN_controllerIsCreated_WITH_noMethodCalled_THEN_ShouldNotGoInMethod() {
		
		assertFalse(this.controller.wantToShowListDogCalled);
		assertFalse(this.controller.wantToCreateDogCalled);
	}

}
