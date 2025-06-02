
public class Face {
	int x,y;
	
	public Face(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x, y, 50, 100);
		frame.fillOval(x+100, y, 50, 100);
		frame.fillRect(x, y+160, 150, 10);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
