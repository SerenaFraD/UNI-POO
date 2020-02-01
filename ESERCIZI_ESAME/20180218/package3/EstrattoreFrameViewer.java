package package3;

import javax.swing.JFrame;

public class EstrattoreFrameViewer {

	public static void main(String[] args) {
		JFrame frame = new EstrattoreFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
