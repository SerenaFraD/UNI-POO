package package3;

import javax.swing.JFrame;

public class TesterFrameViewer {

	public static void main(String[] args) {
		JFrame frame = new TesterFrame();

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
}
