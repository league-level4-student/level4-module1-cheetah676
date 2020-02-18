package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("Dreading tomorrow");
			break;
		case "Monday":
			System.out.println("Worst day of the week");
			break;
		case "Tuesday":
			System.out.println("Should already be Friday");
			break;
		case "Wednesday":
		System.out.println("Halfway through the week");
		break;
		case "Thursday":
			System.out.println("Nothing special about today");
			break;
		case "Friday":
			System.out.println("End of the week");
			break;
		case "Saturday":
			System.out.println("Best day of the week");
			break;
		default:
			System.out.println("I guess you didn't want the fun of choosing a day of the week");
			break;
		}
	}
}
