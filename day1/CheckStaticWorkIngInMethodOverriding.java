package week3.day1;

class Game {
	public  void play() {
		System.out.println("Im playing a game");
	}
}
class OfflineGame extends Game {
	public  void play() {
		System.out.println("Im playing offline games");
	}
}
class OnlineGame extends Game {
	public  void play() {
		System.out.println("Im playing Online games");
	}
}
public class CheckStaticWorkIngInMethodOverriding {

	public static void main(String[] args) {
		Game gam1 = new Game();
		Game gam2 =new OfflineGame();
		Game gam3 = new OnlineGame();
		
		gam1.play();
		gam2.play();
		gam3.play();
	}

}

// with use of static keyword we cannot override the method it will say the mehodtype is 
//undefined 
