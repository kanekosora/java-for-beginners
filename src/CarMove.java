
public class CarMove extends MyFrame{
	public void run() {
		Car Car1=new Car(50,140,10);
		Car1.draw(this);
		Car Car2=new Car(250,240,10);
		Car2.draw(this);
		
		for(int i=0; i<30; i++) {
			clear();
			Car1.draw(this);
			Car1.move();
			Car2.draw(this);
			Car2.move1();
			sleep(0.1);
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
