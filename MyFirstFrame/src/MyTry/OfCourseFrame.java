package MyTry;

import java.awt.Component;

import javax.swing.JFrame;

public class OfCourseFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame myFrame = new JFrame();
		
		String myTitle = "Blank Frame";
		myFrame.setTitle(myTitle);
		myFrame.setSize(300, 200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFrame.setVisible(true);
		
		System.out.println("My first Frame get true");
		

	}

}
