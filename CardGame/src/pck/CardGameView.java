package pck;

import java.awt.*;

import javax.swing.*;

public class CardGameView extends JFrame{
	
	private JPanel basePanel, player1Panel, player2Panel, neutralPanel;
	
	private CardComponent[] player1CardComps, player2CardComps, neutralCardComps;
	
	//width doesn't matter, it is handled by BorderLayout
	private final Dimension fieldSize = new Dimension(0, 200);
	
	public CardGameView (){
		
		//this is temp code for the array sizes, can change this later
		player1CardComps = new CardComponent[CardGame.HAND_SIZE];
		player2CardComps = new CardComponent[CardGame.HAND_SIZE];
		neutralCardComps = new CardComponent[CardGame.HAND_SIZE];
		
		basePanel = new JPanel(new BorderLayout());
		
		//I will mess with gridbaglayouts later when we decide on the actual component we need
		GridBagLayout gbLayout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 5, 5, 0);
		
		player1Panel = new JPanel(gbLayout);
		player1Panel.setBackground(Color.GREEN);
		player1Panel.setPreferredSize(fieldSize);
		
		player2Panel = new JPanel(gbLayout);
		player2Panel.setPreferredSize(fieldSize);
		player2Panel.setBackground(Color.BLUE);
		
		neutralPanel = new JPanel(gbLayout);
		neutralPanel.setBackground(Color.RED);
		
		for(int i = 0; i < CardGame.HAND_SIZE; i++){
			player1CardComps[i] = new CardComponent();
			player2CardComps[i] = new CardComponent();
			neutralCardComps[i] = new CardComponent();
			
			player1Panel.add(player1CardComps[i], gbc);
			player2Panel.add(player2CardComps[i], gbc);
			neutralPanel.add(neutralCardComps[i], gbc);
		}
		
		basePanel.add(neutralPanel, BorderLayout.CENTER);
		basePanel.add(player1Panel, BorderLayout.SOUTH);
		basePanel.add(player2Panel, BorderLayout.NORTH);
		
		add(basePanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setVisible(true);
	}
	
	public void registerListener(CardGameController controller){
	}
}
