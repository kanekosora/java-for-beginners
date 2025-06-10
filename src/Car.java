

public class Car extends Vehicle{
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
	/*public void move() {
		x+=vx;
		y+=vy;
	}*/
	public void move1() {
		x-=vx;
	}
	/*public void move2() {
		x=50;
	}*/
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
