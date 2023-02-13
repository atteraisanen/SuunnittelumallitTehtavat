
public class Main {
	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();
		timer.addObserver(new DigitalClock(timer));
		new Thread(timer).start();
	}
}
