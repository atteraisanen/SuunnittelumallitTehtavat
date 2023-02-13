import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
	private Timer timer;
	
	public DigitalClock(Timer timer) {
		this.timer = timer;
		timer.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Time: " + arg);
	}
	
	
}
