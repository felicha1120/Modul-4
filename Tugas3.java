package MOD4;

import java.awt.*; 

public class Tugas3 extends Frame  {

	public Tugas3() {
	 }
	
	 public static void main(String args[]) {
		 
		 Tugas3 bld = new Tugas3();
		 
		 Panel panelNorth	= 	new Panel();
		 Panel panelCenter	= 	new Panel();
		 Panel panelSouth	= 	new Panel();
		 
		panelNorth.add(new Button ("File")); 
		panelNorth.add(new Button ("Help")); 
		 
		
		panelSouth.setLayout(new BorderLayout (0,0));
		panelSouth.add(new Button("Wors Space Region "), BorderLayout.EAST);
		panelSouth.add(new Button("West "), BorderLayout.WEST);
		
		
		bld.add(panelNorth, BorderLayout.NORTH);
		bld.add(panelCenter, BorderLayout.CENTER);
		bld.add(panelSouth, BorderLayout.SOUTH);
		bld.setSize(200, 200);
		bld.setVisible(true);

	 }
}
