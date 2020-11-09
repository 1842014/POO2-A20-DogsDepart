package dogs.controller;

import dogs.view.DogCreateView;
import dogs.view.IView;

public class DogController implements IDogController {

	@Override
	public void goToCreate() {
		IView dogCreateView = new DogCreateView(this);
		dogCreateView.display();
	}

}
