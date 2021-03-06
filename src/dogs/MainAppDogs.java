package dogs;

import dogs.controller.DogController;
import dogs.controller.IDogController;
import dogs.controller.IWelcomeController;
import dogs.controller.WelcomeController;
import dogs.model.DogMemoryRepository;
import dogs.model.IDogRepository;

public class MainAppDogs {

	private IDogRepository dogRepository;
	
	public static void main(String[] args) {
		new MainAppDogs();
	}

	public MainAppDogs() {
		this.dogRepository =  new DogMemoryRepository();
		this.seedData();
		this.createControllers();
	}
	
	private void seedData() {
		new DogDataSeeder(this.dogRepository);
	}

	private void createControllers() {
		IDogController dogController = new DogController(dogRepository);
		IWelcomeController appController = new WelcomeController(dogController);
		appController.startApplication();
	}

}
