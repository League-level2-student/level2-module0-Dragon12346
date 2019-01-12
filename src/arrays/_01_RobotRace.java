package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {

	// 1. make a main method
	public static void main(String[] args) {
		 Robot[] rob = new Robot[5];



					
		for (int i = 0; i < rob.length; i++) {
			Robot r = rob[i] = new Robot();

			r.setX(i * 100 + 200);
		}
		int i = 0;
		for (int j = 0; j < 1000; j++) {
			rob[i].penDown();
			rob[i].setPenWidth(43);
		 int rand2 = new Random().nextInt(256);
		 int rand3 = new Random().nextInt(256);
		 int rand4 = new Random().nextInt(256);
		 rob[i].setPenColor(rand4,rand3,rand2);
			rob[i].setSpeed(10);
			int rand = new Random().nextInt(50);
			rob[i].move(rand);

			int y = rob[i].getY();
			System.out.println(y);
			if (y < 0) {
				JOptionPane.showMessageDialog(null, "Robot " + i + " has won!");
				j += 100000;
			}
			i++;
			if (i == 5) {
				i = 0;
			}
		}

	
	
	
	
	
	}
	// 2. create an array of 5 robots.


	// 3. use a for loop to initialize the robots.

	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

}
