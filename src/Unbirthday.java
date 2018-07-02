import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday=JOptionPane.showInputDialog("When is your birthday? (mm/dd)");
	if (birthday.equals("07/02")) {
	System.out.println("Happy Birthday");
	}
	else {
		System.out.println("Happy Unbirthday");
	}
}
}
