import java.util.Vector;

public class Carseven extends MyFrame{
	public void run() {
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		
		Vector<Car> cars=new Vector<Car>();
		cars.add(new Car(50,50,1));
		cars.add(new Car(50,125,2));
		cars.add(new Car(50,200,3));
		cars.add(new Car(50,275,4));
		cars.add(new Car(50,350,5));
		/*for(int i=0; i<30; i++) {     //練習問題７
			clear();
			for(int j=0; j<cars.size(); j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
			}
			sleep(0.1);
		}*/
		while(true) {
			clear();
		
			for(int i=0; i<70; i++) {     //練習問題７
				clear();
				for(int j=0; j<cars.size(); j++) {
					cars.get(j).draw(this);
					cars.get(j).move();
				}
				sleep(0.01);
		     }
	 }
	    }
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
