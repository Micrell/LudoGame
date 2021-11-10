package swing.components;

import java.awt.Dimension;
import javax.swing.JDesktopPane;

public class DesktopFrame extends JDesktopPane{

	private static final long serialVersionUID = 1L;
	
	public GameOverFrame gameOverInternalFrame;
	public StartGameFrame startGameInternalFrame;
	public ScoreBoardFrame scoreBoardInternalFrame;
	
	
	public DesktopFrame() {
		
		this.gameOverInternalFrame = new GameOverFrame();
		this.startGameInternalFrame = new StartGameFrame();
		this.scoreBoardInternalFrame = new ScoreBoardFrame();
		this.add(scoreBoardInternalFrame);
		this.add(this.gameOverInternalFrame);
		this.add(this.startGameInternalFrame);
		this.setPreferredSize(new Dimension(200,100));
		this.setVisible(true);
	}
}
