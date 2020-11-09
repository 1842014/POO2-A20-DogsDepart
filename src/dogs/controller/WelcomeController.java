package dogs.controller;

import dogs.view.IView;
import dogs.view.WelcomeView;

public class WelcomeController implements IWelcomeController {


	public void startApplication() {;
		IView welcomeView = new WelcomeView(this);
		welcomeView.display();
	}

	@Override
	public void wantToCreateDog() {
		System.out.println("Create Dog");
	}

	@Override
	public void wantToShowListDog() {
		System.out.println("List Dog");
	}
}
