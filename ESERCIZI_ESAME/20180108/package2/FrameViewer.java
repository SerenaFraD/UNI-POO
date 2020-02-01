package package2;

import javax.swing.JFrame;

public class FrameViewer {

	public static void main(String[] args) throws Exception {
		JFrame frame = new ReaderFrame();

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
}
