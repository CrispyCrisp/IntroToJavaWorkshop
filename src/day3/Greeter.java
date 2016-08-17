package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String answer = JOptionPane.showInputDialog("How's Life?");
JOptionPane.showMessageDialog(null, "Same, "+ answer);
String answer2 = JOptionPane.showInputDialog("Does The Sun Hurt Your Eyes?")
JOptionPane.showMessageDialog(null, "Really");
}
}
