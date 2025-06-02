
public class Animation extends MyFrame{
	public void run() {
		
		/*int y = 100;         //5-1
		int x = 200;
			
			while(x>=30) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(100,x,40,150);
				fillOval(100-1,x,100,100);
				x-=5;
				sleep(0.01);
				
				}
			while(y<=300) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(y,30,40,150);
				fillOval(y-1,30,100,100);
				y+=5;
				sleep(0.01);
				}*/
				
		
		/*int x = 50;     //5-2
		int y = 50;
		
		while(true) {
			
		
		while(x<=200) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,40,150);
			fillOval(x,y,100,100);
			x+=5;
			y+=5;
			sleep(0.01);
			
			}
		
		while(x>=50) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,40,150);
			fillOval(x,y,100,100);
			x-=5;
			sleep(0.01);
			
			}
		
		y=200;
		while(x<=200) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,40,150);
			fillOval(x,y,100,100);
			x+=5;
			y-=5;
			
			sleep(0.01);
			
			}
		
		while(x>=50) {
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,40,150);
			fillOval(x,y,100,100);
			x-=5;
			
			sleep(0.01);
			
			}
		}*/
		
		/*for(int i = 0; i < 3; i++) {     //5-3
			
			for(int x = 50; x <= 300; x += 5) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,50,40,150);
				fillOval(x,50,100,100);
				sleep(0.01);
			}
			
			for(int x = 300; x >= 50; x -= 5) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,50,40,150);
				fillOval(x,50,100,100);
				sleep(0.01);
			}
		}*/
		
		/*while(true) {     //5-EX
			
			int x = 50;
			int y = 50;
			
			while(x<=200) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,50,40,150);
				x+=5;
				sleep(0.01);
			}
			
			while(y<=200) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,y,40,150);
				y+=5;
				sleep(0.01);
			}
			
			while(x>=50) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,y,40,150);
				x-=5;
				sleep(0.01);
			}
			
			while(y>=50) {
				//画面を消す
				clear();
				//四角形を表示する
				setColor(0,128,0);
				fillRect(x,y,40,150);
				y-=5;
				sleep(0.01);
			}
		}*/
		
		/*int x = 50;     //5-EX2
		int y = 50;
		int count = 1;
		while(true) {
			if(x == 50&&y==50*count) {     //右に動く
				while(x<=200) {
					//画面を消す
					clear();
					//四角形を表示する
					setColor(0,128,0);
					fillRect(x,y,40,40);
					x+=5;
					sleep(0.01);
			    }
				count = count+1;
			}
			if(x == 205&&y==50*count) {     //左に動く
				while(x>50) {
					//画面を消す
					clear();
					//四角形を表示する
					setColor(0,128,0);
					fillRect(x,y,40,40);
					x-=5;
					sleep(0.01);
				}
				count = count+1;
			}
			
			//画面を消す
			clear();
			//四角形を表示する
			setColor(0,128,0);
			fillRect(x,y,40,40);
			y+=5;
			sleep(0.01);
			
			//if(y==400) {
			//	x = 50;
			//	y =50;
			//}
		}*/
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
