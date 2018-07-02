import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("Write down the name of the person you would like to know about");
	if (name.equals("Sami")){
		JOptionPane.showMessageDialog(null, "Sami likes ice cream");
	}
	else if (name.equals("Nick")) {
		JOptionPane.showMessageDialog(null, "Nick likes chez and MARSHMELLOWS");
	}
	else if (name.equals("Matt")) {
		JOptionPane.showMessageDialog(null, "Matt taught scuba in Hawaii");
	}
	else if(name.equals("Jenna")) {
		JOptionPane.showMessageDialog(null, "Jenna plays volleyball");
	}
}
}
