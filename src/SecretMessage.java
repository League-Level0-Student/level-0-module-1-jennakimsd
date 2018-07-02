import javax.swing.JOptionPane;

public class SecretMessage {
public static void main(String[] args) {
	String password="password";
	String message=JOptionPane.showInputDialog("Enter your secret message");
	String guess=JOptionPane.showInputDialog("You can only know the secret message if you write the correct password");
	if (guess.equals("password")) {
		JOptionPane.showMessageDialog(null, message);
	}
	else {
		JOptionPane.showMessageDialog(null, "INTRUDER");
	}
}
}
