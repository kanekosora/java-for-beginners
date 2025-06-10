
public class DisplayCarsTrain extends MyFrame{
	public void run() {
		Vehicle[] vehicles=new Vehicle[6];
		vehicles[0]=new Car(30,30,5,0);
		vehicles[1]=new Car(30,100,5,0);
		vehicles[2]=new Train(30,170,5,0);
		vehicles[3]=new Train(30,220,5,0);
		vehicles[4]=new Truck(30,280,5,0);
		vehicles[5]=new Truck(30,350,5,0);
		/*for(int i=0; i<30; i++) {     //練習問題8-1
			clear();
			for(int j=0; j<vehicles.length; j++) {
				vehicles[j].draw(this);
				if(j==0||j==2||j==4||j==5) {
				    vehicles[j].move();
				}
				if(j==1||j==3) {
					vehicles[j].move1();
				}
			}
			sleep(0.1);
		}*/
		/*while(true) {   //練習問題8-EX
		    clear();
		    for(int j=0; j<vehicles.length; j++) {
			    vehicles[j].draw(this);
			    if(j==0||j==2||j==4||j==5) {
			        vehicles[j].move2();
		    	}
		    	if(j==1||j==3) {
				    vehicles[j].move3();
		    	}
		    }
		    sleep(0.1);
	    }*/
		while(true) {   //練習問題8-CHALLENGE
	    clear();
	    for(int j=0; j<vehicles.length; j++) {
		    vehicles[j].draw(this);
		    if(j==0||j==2||j==4||j==5) {
		        vehicles[j].move4(this);
	    	}
	    	if(j==1||j==3) {
			    vehicles[j].move5(this);
	    	}
	    }
	    sleep(0.01);
    }
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
