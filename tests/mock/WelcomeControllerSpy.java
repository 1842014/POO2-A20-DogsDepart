package mock;

import dogs.controller.IWelcomeController;

public class WelcomeControllerSpy implements IWelcomeController {

	public boolean wantToCreateDogCalled = false;
	public boolean wantToShowListDogCalled = false;
	
	@Override
	public void startApplication() {

	}

	@Override
	public void wantToCreateDog() {
		wantToCreateDogCalled = true;
	}

	@Override
	public void wantToShowListDog() {
		wantToShowListDogCalled = true;
	}
}
