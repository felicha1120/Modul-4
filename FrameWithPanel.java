package MOD4;
import java.awt.*;

import javax.swing.JFrame;

	public class FrameWithPanel {
		 private Frame f;
		 public FrameWithPanel(String title) {
		 f = new Frame(title);
		 
		 }

		 public void launchFrame() {
			 
		
			 
			 Panel yellowpan = new Panel();
			 yellowpan.setBackground(Color.yellow);
			 yellowpan.setBounds(0,0,250,250);
			
			
			 Panel redpan = new Panel();
			 redpan.setBackground(Color.red);
			 redpan.setBounds(250,0,250,250);
			
			 Panel green = new Panel();
			 green.setBackground(Color.green);
			 green.setBounds(0,250,500,250);
			 
			 
			 JFrame f = new JFrame();
			 f.setSize(200,200);
			 f.setBackground(Color.blue);
			 f.setLayout(null); // Override default layout mgr
			 f.setVisible(true);
			 f.add(yellowpan);
			 f.add(redpan);
			 f.add(green);
			 
	
		 }
		 
		 	public static void main(String args[]) {
		 		FrameWithPanel guiWindow = new FrameWithPanel("Frame with Panel");
		 		guiWindow.launchFrame();
		 }
		}



