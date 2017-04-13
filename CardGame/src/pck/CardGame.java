package pck;

public class CardGame {
	
	public final static int HAND_SIZE = 5;
	
	public static void main(String[] args){
		/* create new model, view and controller */
		CardGameModel model = new CardGameModel();
		CardGameView view = new CardGameView();
		CardGameController controller = new CardGameController(model, view);
		
		/* register controller as listener */
		view.registerListener(controller);
	}
}
