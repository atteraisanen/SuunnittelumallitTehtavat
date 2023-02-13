import java.util.Date;
import java.util.Observable;
import java.text.SimpleDateFormat;
public class Timer extends Observable implements Runnable {
	private SimpleDateFormat currentTime;
	
	public Timer() {
		currentTime = new SimpleDateFormat("HH::mm:ss");
	}
	
	public void run() {
		while(true) {
			try {
				setChanged();
				notifyObservers(currentTime.format(new Date()));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
