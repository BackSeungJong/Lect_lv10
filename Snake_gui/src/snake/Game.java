package snake;

import javax.swing.JFrame;

class panel extends MyUtil {

	private Rect[][] map;

	private int size;
	private Rect[] snake;

	public panel() {
		// TODO Auto-generated constructor stub

	}
}

public class Game extends JFrame {
	public Game() {
		super("Snake Game");
		setLayout(null);
		setBounds(50, 50, 700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		revalidate();
	}
}
