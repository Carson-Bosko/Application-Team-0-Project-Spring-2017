package pck;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardGameController implements ActionListener{
	
	private CardGameModel model;
	private CardGameView view;
	
	public CardGameController(CardGameModel model, CardGameView view){
		this.model = model;
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent arg0){
	}
}
