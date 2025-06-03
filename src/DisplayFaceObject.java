
public class DisplayFaceObject extends MyFrame{
	public void run() {
		Face face1=new Face(50,50,10,5);
		//face1.draw(this);
		
		Face face2=new Face(200,100,-10,-5);
		//face2.draw(this);
		
		//Face face3=new Face(250,50);
		//face3.draw(this);
		
		for(int i=0; i<30; i++) {
			clear();
			face1.draw(this);
			face2.draw(this);
			face1.move();
			face2.move();
			/*face1.x+=face1.vx;
			face1.y+=face1.vy;
			face2.x+=face2.vx;
			face2.y+=face2.vy;*/
			sleep(0.1);
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
