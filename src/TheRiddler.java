import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score= 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer= JOptionPane.showInputDialog("If you have me, you want to share me. If you share me, you haven't got me. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equals("a secret")) {
	JOptionPane.showMessageDialog(null, "correct!");
	score = score + 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "wrong. the correct answer is a secret.");
}
		// 6. Add some more riddles
String riddle= JOptionPane.showInputDialog("What gets broken without being held?");
if (riddle.equals("a promise")) {
	JOptionPane.showMessageDialog(null, "correct!");
	score=score+1;
}
else {
	JOptionPane.showMessageDialog(null, "wrong. the correct answer was a promise");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "your score is " +score);
	}
}

