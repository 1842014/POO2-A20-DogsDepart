package dogs.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dogs.controller.DogController;
import dogs.controller.IDogController;
import dogs.dto.DogDTOForList;

public class DogListView extends JDialog implements IView, ActionListener {

	private static final String DOG_LIST_TITLE = "Liste des chiens";
	private static final String OK_BUTTON_TEXT = "OK";
	private static final String ID_TITLE = "ID";
	private static final String NAME_TITLE = "NOM";
	private static final String BREED_TITLE = "RACE";
	private static final String OK_CLICKED_ACTION = "OK_CLICKED";
	
	private IDogController controller;
	private List<DogDTOForList> dogsDTO;

	public DogListView(DogController dogController, List<DogDTOForList> dogsDTO) {
		super();
		
		this.controller = dogController;
		this.dogsDTO = dogsDTO;
		
		this.initialize();
		this.setUpComponents();
		this.pack();	
	}

	@Override
	public void display() {
		this.setVisible(true);
	}
	
	private void initialize() {
		this.setTitle(DOG_LIST_TITLE);
		this.setModalityType(DEFAULT_MODALITY_TYPE);
	}

	private void setUpComponents() {
		this.setUpListPanel();
		this.setUpActionPanel();
	}

	private void setUpActionPanel() {
		JPanel actionPanel = new JPanel();
		this.add(actionPanel, BorderLayout.SOUTH);
		
		addButton(actionPanel, OK_BUTTON_TEXT, OK_CLICKED_ACTION);
	}
	
	private void addButton(JPanel actionPanel, String buttonText, String buttonAction) {   
		JButton button = new JButton(buttonText);
		button.setActionCommand(buttonAction);
		button.addActionListener(this);
		actionPanel.add(button);
	}
	
	

	private void setUpListPanel() {
		JPanel listPanel = new JPanel();
		this.add(listPanel, BorderLayout.CENTER);
		
		listPanel.setLayout(new GridLayout(0,3));
		addTitles(listPanel);
		addDogs(listPanel);
	}

	private void addDogs(JPanel listPanel) {
		for(DogDTOForList dog : this.dogsDTO) {
			listPanel.add(new JLabel(String.valueOf(dog.id)));
			listPanel.add(new JLabel(dog.name));
			listPanel.add(new JLabel(dog.breed));
		}
		
	}

	private void addTitles(JPanel listPanel) {
		listPanel.add(new JLabel(ID_TITLE));
		listPanel.add(new JLabel(NAME_TITLE));
		listPanel.add(new JLabel(BREED_TITLE));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().contains(OK_CLICKED_ACTION)) {
			this.dispose();
		}
	}

}
