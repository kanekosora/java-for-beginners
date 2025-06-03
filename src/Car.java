

public class Car {
	int x,y,vx;
	public Car(int x, int y, int vx) {
		this.x=x;
		this.y=y;
		this.vx=vx;
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x,y,100,30);
		frame.fillRect(x+20,y-20,60,30);
		frame.fillOval(x+15,y+30,30,25);	
		frame.fillOval(x+60,y+30,25,25);
	}
	public void move() {
		x+=vx;
	}
	public void move1() {
		x-=vx;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
