/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;
	JButton[] buttons;
	JButton button;

	// 1. create an array of JButtons. Don't initialize it yet.
	int hiddenButton;
	// 2 create an int variable called hiddenButton

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {

		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// 3. Ask the user to enter a positive number and convert it to an int
		String num = JOptionPane.showInputDialog("Enter a positive number");
		int an = Integer.parseInt(num);
		int rand = new Random().nextInt(an);

		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3

		buttons = new JButton[an];
		JOptionPane.showMessageDialog(null, "Find the hidden button.");
		for (int i = 0; i < an; i++) {
			buttons[i] = new JButton();
			panel.add(buttons[i]);
			buttons[i].addActionListener(this);
		}

		buttons[rand].setText("ME");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		buttons[rand].setText("");
	
		// 5. Make a for loop to iterate through the JButton array
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel

		// 9 add the panel to the window

		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.

		// 11. set the JFrame to visible.

		// 12. Give the user the instructions for the game.

		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3
		hiddenButton = rand;

		// 14. Set the text of the JButton located at hiddenButton read "ME"

		// 15. Use Thread.sleep(100); to pause the program.
		// Surround it with a try/catch

		// 16. Set the text of the JButton located at hiddenButton to be blank.

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		// 17. if the hiddenButton is clicked, tell the user that they win.
		System.out.println(buttonClicked);
		System.out.println(buttons[hiddenButton]);
		System.out.println(hiddenButton);
		if (buttonClicked == buttons[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "You win");
		} else {
			JOptionPane.showMessageDialog(null, "Try again.");
		}
		// 18. else tell them to try again
	}
}
