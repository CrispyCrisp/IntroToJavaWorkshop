package day3;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class stalker {
public static void main(String[] args) {
String answer = JOptionPane.showInputDialog("What's Your Name?");
String answer2 = JOptionPane.showInputDialog("How Old Are You?");
String answer3 = JOptionPane.showInputDialog("Are You Stupid?");
String answer4 = JOptionPane.showInputDialog("What's Your Favorite Emoji? ");
String answer5 = JOptionPane.showInputDialog("What's Your Phone Number?");
JOptionPane.showMessageDialog(null, "HaHaHaHa I Know Your Name "+ answer);
JOptionPane.showMessageDialog(null, "I Know Your "+ answer2 +"Years Old! ");
JOptionPane.showMessageDialog(null,"I Know Your Stupid " + answer);
JOptionPane.showMessageDialog(null, "I Know You Like The "+ answer4 +"Emoji");
JOptionPane.showMessageDialog(null, "I know Your Phone Number"+ answer);
JOptionPane.showMessageDialog(null, "Why Did You Tell A Strange Computer all Your Info?"+ answer+ "You Really Are Stupid");
}
}
