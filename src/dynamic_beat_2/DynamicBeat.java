package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

// JFrame 상속 이유 : GUI 기반 만들기 위해.
public class DynamicBeat extends JFrame {
	
	// '더블버퍼링'을 위한 인스턴스 생성.
	private Image screenImage;
	private Graphics screenGraphic;
	private Image introBackground;
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");	  // 우리가 만들 게임 이름.
		
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 이게 있어야, 게임 종료 시 프로그램 종료됨. 필수!!
		setVisible(true);	// 말그대로 우리 눈에 게임창이 보이게 해주는.
		
		// introBackground 변수에 초기화해주기. (
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	}
	
	// GUI 게임에서, 가장 첫번째로 화면을 그려주는 메소드. (이거 오버라이딩이구나?)
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);	// 이 메소드를 이용해서 그린다. 아래에 있음.
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();		// 다시 페인트함수를 불러온다. 프로그램 종료될 때까지 반복.
	}
}
