package dynamic_beat_1;

import javax.swing.JFrame;

// JFrame 상속 이유 : GUI 기반 만들기 위해.
public class DynamicBeat extends JFrame {
	public DynamicBeat() {
		setTitle("Dynamic Beat");	  // 우리가 만들 게임 이름.
		
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 이게 있어야, 게임 종료 시 프로그램 종료됨. 필수!!
		setVisible(true);	// 말그대로 우리 눈에 게임창이 보이게 해주는.
	}
}
