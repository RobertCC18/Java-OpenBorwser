/*
 * Project Created By Robert Crawford 12/19/16 
 * Project Goal Is To Open My Web Browser For A Java App
 */
import java.lang.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.Desktop;
import java.net.*;

public class browseropen extends JFrame { 
	public static JTextField urltxt;
	public browseropen() {
	
		setDefaultCloseOperation(EXIT_ON_CLOSE); // setting app close on exit 
		JPanel panel = new JPanel(); // creating new app panel
		
		urltxt = new JTextField("https://google.com");
		urltxt.addActionListener(new ActionListener() { // adding event for enter key
		    @Override
		    public void actionPerformed(ActionEvent event ) {
		        runClient();              // run browser open command
		    }
		});
		
		
				JButton gourl = new JButton("Go To URL"); // button that executes our openbrowserurl command
			gourl.addActionListener(new ActionListener() { // the actionlistener 
	         public void actionPerformed(ActionEvent e) {
	            runClient();  // running method that calls to the openbrowserurl class 
	         		} });
				
			
		JLabel text = new JLabel("Enter Url Here"); // setting up our JLabel for instructions 
				setVisible(true); // getting our swing GUI to show
				this.setSize(400,400); // set window size
				 setLayout(new GridLayout(10, 10, 5,10)); // setting up layout
				 add(text); // adding components to our gui
				 add(urltxt);
				 add(gourl);
				} 
	
	
	
	public void runClient() { // our method to invoke the browser on button click
	    SwingUtilities.invokeLater(new Runnable() {
	        @Override
	        public void run() { // calling our main openbrowserurl.java class
	            String[] args1={"10"};
	            openbrowserurl.main(args1);
	        }
	    });
	    

	
			
		
	     
	}
	
	public static String geturlxt() {
	    return urltxt.getText();
	
	}
	
	public static void main(String[] args) {
			 new browseropen(); // rendering our GUI
			
				}
	 

}


