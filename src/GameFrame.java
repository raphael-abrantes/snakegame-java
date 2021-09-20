import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GameFrame extends JFrame{
	

	GameFrame () {
		
		ImageIcon icon = new ImageIcon("snakeIcon.png");

		this.add(new GamePanel());
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(icon.getImage());
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
	
}
