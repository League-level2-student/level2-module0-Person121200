package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {

	// 1. make a main method
	public static void main(String[] args) {
		Random rand = new Random();
		Robot rob[] = new Robot[5];
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
			rob[i].setSpeed(50);
			rob[i].setX(i * 200 + 48);
			rob[i].setY(550);
		}
		boolean raceOn = true;
		int winner = 0;
		while (raceOn == true) {
			for (int i = 0; i < rob.length; i++) {
				rob[i].move(rand.nextInt(50));
				if (rob[i].getY() <= 0) {
					winner = i + 1;
					raceOn = false;
				}

			}
			
		}
		JOptionPane.showMessageDialog(null, "THE WINNER IS CAR NUMBER "+ winner);


	}

	// 2. create an array of 5 robots.
	// 3. use a for loop to initialize the robots.

	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
