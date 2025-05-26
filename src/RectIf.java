
public class RectIf extends MyFrame{
	public void run() {
		
		int x = 30;
		setColor(0,128,0);
		int y = 0; 
		
		for(int i = 0; i < 20; i++) {
			
			if(i <= 9) {
				setColor(y,y,y);
				fillRect(x,0,10,100);
				y += 20;
			}else {
				setColor(y,y,y);
				fillRect(x,0,10,100);
				y -= 20;
			}
			x+=20;
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
