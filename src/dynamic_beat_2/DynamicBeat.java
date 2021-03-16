package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

// JFrame ��� ���� : GUI ��� ����� ����.
public class DynamicBeat extends JFrame {
	
	// '������۸�'�� ���� �ν��Ͻ� ����.
	private Image screenImage;
	private Graphics screenGraphic;
	private Image introBackground;
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");	  // �츮�� ���� ���� �̸�.
		
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// �̰� �־��, ���� ���� �� ���α׷� �����. �ʼ�!!
		setVisible(true);	// ���״�� �츮 ���� ����â�� ���̰� ���ִ�.
		
		// introBackground ������ �ʱ�ȭ���ֱ�. (
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	}
	
	// GUI ���ӿ���, ���� ù��°�� ȭ���� �׷��ִ� �޼ҵ�. (�̰� �������̵��̱���?)
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);	// �� �޼ҵ带 �̿��ؼ� �׸���. �Ʒ��� ����.
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();		// �ٽ� ����Ʈ�Լ��� �ҷ��´�. ���α׷� ����� ������ �ݺ�.
	}
}
