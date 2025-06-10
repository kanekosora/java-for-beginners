import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car extends Vehicle implements KeyListener{
	//int x,y,vx,vy;
	public Car(int x, int y, int vx, int vy) {
		super(x,y,vx,vy);
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x+20,y,40,20);
		frame.fillRect(x,y+20,80,20);
		frame.fillOval(x+10,y+40,20,20);	
		frame.fillOval(x+50,y+40,20,20);
	}
	public void move() {
		x+=vx;
		y+=vy;
	}
	public void move1() {
		x-=vx;
	}
	public void move2() {
		x=50;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}
	@Override
	public void keyTyped(KeyEvent e) {     //文字入力「
		// TODO 自動生成されたメソッド・スタブ
		
	}
	@Override     
	public void keyPressed(KeyEvent e) {     //キーが押されたら
		// TODO 自動生成されたメソッド・スタブ
		//System.out.println("キーが入力されました");
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=-5;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=5;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			vy=-5;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			vy=5;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {     //キーが離れたら
		// TODO 自動生成されたメソッド・スタブ
		vx=0;
		vy=0;
	}

}
