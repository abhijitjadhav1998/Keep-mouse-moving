# Keep-mouse-moving
This is fun java code to keep your mouse moving to make your PC stay awake and stop going your status away on Teams :wink:

# Code
```
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
			// Assuming you have 640 * 480 resolution laptop screen
			int x = random.nextInt() % 640;
			int y = random.nextInt() % 480;
			System.out.println(x + " , " + y);
			robot.mouseMove(x, y);	//Moving the mouse
		}
	}
}
```
# Steps to Run

You can paste the above code to your favourite editor and run the code to keep your mousing moving.

Its more simple to use my extracted executable file to run the code:

```
git clone https://github.com/abhijitjadhav1998/Keep-mouse-moving.git
```
Open the command prompt and navigate to the project directory which has "Keep-mouse-moving.jar" and use the below command to run the jar file.

```
java -jar Keep-mouse-moving.jar
```
Press ```Ctrl + C``` to terminate the script

:sunglasses: Now the script is active and your mouse will keep moving. You can go out and learn new things. 

# Output

```
D:\Github projects\Keep Mouse Moving>java -jar Keep-mouse-moving.jar
Script is active
-163 , 51
-404 , 465
599 , 54
260 , 329
```

