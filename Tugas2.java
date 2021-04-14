package MOD4;


import java.awt.*;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Tugas2 extends Frame {

	private Frame f;
	
	public Tugas2(){
		f = new Frame("Hello Out There!");
	}
	
	public static void main(String args[]) {
		 
		Tugas2 fld = new Tugas2();
		 fld.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
		 fld.add(new Button("PRESS ME!!"));
		 fld.add(new Button("DON'T PRESS ME !!"));
		 fld.setSize(100, 100);
		 fld.setVisible(true);
		 
		 }
}