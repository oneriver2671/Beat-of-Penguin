package dynamic_beat_3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	
	private Player player;
	private boolean isLoop;		// 현재 곡이 반복인지, 1번 재생인지 설정해주는.
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;

	public Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	// 현재 실행되고 있는 음악이, 현재 어떤 위치에 있는지.
	public int getTime() {
		if (player == null)
			return 0;
		return player.getPosition();
	}
	
	// 음악이 언제 실행되던지 항상 종료할 수 있도록.
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt();		// 해당 스레드를 중지상태로 만드는 기능.
	}
	@Override
	public void run() {			// 스레드를 상속하면 '무조건' 사용해야하는 메소드.
		try {
			do {
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			} while (isLoop);		// isLoop가 true라면, 곡이 무한반복.
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
