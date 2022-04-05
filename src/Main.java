import java.awt.Robot;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		Random random = new Random();
		System.out.println("Script is active");
		while(true) {
			// adding 1 min delay
			robot.delay(1000 * 60);
			/*
			 * Assuming you have 640 * 480 resolution laptop screen
			 */
			int x = random.nextInt() % 640;
			int y = random.nextInt() % 480;
			System.out.println(x + " , " + y);
			robot.mouseMove(x, y);	//Moving the mouse
		}

	}

}
