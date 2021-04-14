package MOD4;

import java.awt.*;

public class Tugas1 extends Panel  {

	 public Tugas1() {
		 setBackground(Color.GRAY);
		 
		 
		 } 
	 
	 
	 public void paint(Graphics g) {
		 g.setColor(new Color(51-204-255)); //light blue
		 g.setFont(new Font("Helvetica",Font.ROMAN_BASELINE,37));
		 g.drawString("Hello GUI !", 30, 100);
		 g.setColor(new Color(102-102-102 )); //red
		 g.fillRect(30, 100, 150, 10);
		 
		 }
	 
	 
		 public static void main(String args[]) {
			 Frame f = new Frame("Testing Graphics Panel");
			 Tugas1 gp = new Tugas1();
			 f.add(gp);
			 f.setSize(600, 300);
			 f.setVisible(true);
		 }
		}
