package day3;

import javax.swing.JOptionPane;

public class Noah_Madlibs_Anime {
public static void main(String[] args) {
String awake = JOptionPane.showInputDialog("You Are Binge Watching Anime And To Stay Awake You Need To...");
JOptionPane.showMessageDialog(null, "You Are Binge Watching Anime And To Stay Awake You Need To..." + awake);
JOptionPane.showInputDialog("After A While Your Method Of "+ awake+ " Fails You. To Comprimise, You Have To Drink Energy Drinks What Brand Do You Choose");
String ache = JOptionPane.showInputDialog("You Drank To Much Liquid And Now Have To Lie Down, Not Wanting To Fall Asleep How Do You Continue Watching Anime?");
String late =JOptionPane.showInputDialog("Your Strategy To Stay Up Late By " + ache+"Starts To Wear Off, In A Last Atempt To Stay Awake You..." );
JOptionPane.showMessageDialog(null, "Tired And Your" + late+ " Attempt Being Your Last  Resource You Fall Asleep And Don't Wake Up For 48 Hours");


}
}
