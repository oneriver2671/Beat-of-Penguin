package dynamic_beat_1;

import javax.swing.JFrame;

// JFrame ��� ���� : GUI ��� ����� ����.
public class DynamicBeat extends JFrame {
	public DynamicBeat() {
		setTitle("Dynamic Beat");	  // �츮�� ���� ���� �̸�.
		
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// �̰� �־��, ���� ���� �� ���α׷� �����. �ʼ�!!
		setVisible(true);	// ���״�� �츮 ���� ����â�� ���̰� ���ִ�.
	}
}
