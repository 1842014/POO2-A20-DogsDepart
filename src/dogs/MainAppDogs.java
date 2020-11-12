package dogs;

import dogs.controller.DogController;
import dogs.controller.IDogController;
import dogs.controller.IWelcomeController;
import dogs.controller.WelcomeController;
import dogs.model.DogMemoryRepository;
import dogs.model.IDogRepository;
import dogs.view.WelcomeView;

public class MainAppDogs {

	private IDogRepository dogRepository = new DogMemoryRepository();
	
	public static void main(String[] args) {
		new MainAppDogs();
	}

	public MainAppDogs() {
		this.createControllers();
	}
	
	private void createControllers() {
		IDogController dogController = new DogController(dogRepository);
		
		IWelcomeController appController = new WelcomeController(dogController);
		appController.startApplication();
	}

}
