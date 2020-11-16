
package dogs.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dogs.controller.IDogController;
import dogs.dto.DogDTOFroCreate;


public class DogCreateView extends JDialog implements IView, ActionListener {
	
	private static final String REGISTER_DOG_ACTION = "REGISTER_DOG";


	private static final String REGISTER_BUTTON_TEXT = "Inscrire";


	private static final String BREED_LABEL_TEXT = "Race: ";


	private static final String NAME_LABEL_TEXT = "Nom: ";


	private static final String VIEW_TITLE = "Inscription d'un chien";


	private JTextField id = new JTextField(3);
	private JTextField name = new JTextField(15);
	private JTextField breed = new JTextField(20);

	private IDogController controller;


	public DogCreateView(IDogController controller) {
		super();
		
		this.controller = controller;
		
		this.initialize();
		this.setUpComponents();
		this.pack();
	}

	@Override
	public void display() {
		this.setVisible(true);
	}
	
	private void initialize() {
		this.setTitle(VIEW_TITLE);		
		this.setModalityType(DEFAULT_MODALITY_TYPE);
	}

	private void setUpComponents() {
		this.setUpInputDataPanel();
		this.setUpActionPanel();		
	}

	private void setUpInputDataPanel() {
		// container intermédiaire JPanel qui contient les étiquettes (JLabel) et les zones de textes (JTextField)
		// utiliser un GridLayout comme LayoutManager
		
		JPanel inputDataPanel = new JPanel();
		this.add(inputDataPanel, BorderLayout.NORTH);
		
		
		inputDataPanel.setLayout(new GridLayout(0,2));
		addTextField(inputDataPanel, NAME_LABEL_TEXT,this.name);
		addTextField(inputDataPanel, BREED_LABEL_TEXT, this.breed);
	}
	
	private void addTextField(JPanel panel, String labelText, JTextField textField) {
		// Pour ajouter successivement une étiquette et une zone de texte au panel
		JLabel txtLabel = new JLabel(labelText);
		panel.add(txtLabel);
		panel.add(textField);
	}

	private void setUpActionPanel() {
		// container intermédiaire JPanel qui contient le bouton pour inscrire le chien
		JPanel actionPanel = new JPanel();
		this.add(actionPanel, BorderLayout.SOUTH);
		
		addButton(actionPanel, REGISTER_BUTTON_TEXT, REGISTER_DOG_ACTION);
	}

	// même méthode que dans WelcomeView
	// DRY -> méthode utilitaire à extraire dans une classe utilitaire util.view.ViewUtil 
	private void addButton(JPanel actionPanel, String buttonText, String buttonAction) {   
		// Pour ajouter un bouton au panel	
		JButton button = new JButton(buttonText);
		button.setActionCommand(buttonAction);
		button.addActionListener(this);
		actionPanel.add(button);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().contentEquals(REGISTER_DOG_ACTION)) {
			this.createDog();
		}
	}

	private void createDog() {
		DogDTOFroCreate dogDTO = new DogDTOFroCreate(this.name.getText(), this.breed.getText());
		this.controller.addDog(dogDTO);
		JOptionPane.showMessageDialog(this, "Le " + breed.getText() + " " + name.getText() + " a été inscrit!");
		this.dispose();
	}

}
