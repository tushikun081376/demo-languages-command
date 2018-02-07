package demo.languages.java.enumx;
/**
 * 
 * @author tsk
 *
 */
public class TrafficLight {
	//
	Signal color = Signal.RED;
	/*
	 * 
	 */
	public void change() {
		switch (color) {
		case RED:
			color = Signal.GREEN;
			break;
		case YELLOW:
			color = Signal.RED;
			break;
		case GREEN:
			color = Signal.YELLOW;
			break;
		}
		//byte、short、int、char
		char a = 1;
		switch (a) {
		case 2:
			color = Signal.GREEN;
			break;
		case 3:
			color = Signal.RED;
			break;
		case 4:
			color = Signal.YELLOW;
			break;
		}
	}
}
