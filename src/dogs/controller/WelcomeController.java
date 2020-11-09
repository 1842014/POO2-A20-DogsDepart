package dogs.controller;

import dogs.view.IView;
import dogs.view.WelcomeView;

public class WelcomeController implements IWelcomeController {

	IDogController dogController = new DogController();

	public void startApplication() {;
		IView welcomeView = new WelcomeView(this);
		welcomeView.display();
	}

	@Override
	public void wantToCreateDog() {
		dogController.goToCreate();
	}

	@Override
	public void wantToShowListDog() {
		System.out.println("List Dog");
	}
}
