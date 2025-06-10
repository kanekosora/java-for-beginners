
public class PlayerAnimation extends MyFrame{
	public void run() {
		Car player = new Car(100,200,0,0);
		addKeyListener(player);
		while(true) {
			clear();
			player.draw(this);
			player.move();
			sleep(0.01);
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}
	
}
