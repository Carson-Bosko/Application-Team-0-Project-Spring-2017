package pck;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardComponent extends JComponent{
	
	private Card cardReference;
	
	private JPanel basePanel;
	private JLabel lblcardStats;
	
	//used to selection then selling.
	private boolean selected;
	
	private final int HEIGHT = 100, WIDTH = 75;
	
	public CardComponent(){
		this(null);
	}
	
	public CardComponent(Card cardReference){
		setCardReference(cardReference);
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		basePanel = new JPanel();
		
		lblcardStats = new JLabel();
		
		add(basePanel);
	}
	
	public void setCardReference(Card cardReference){
		this.cardReference = cardReference;
		if(cardReference != null){
			lblcardStats.setText("" + cardReference);
		}
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.fillRect(0, 0, WIDTH, HEIGHT);
	}
}