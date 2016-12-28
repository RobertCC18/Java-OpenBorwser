/*
 * Project Created By Robert Crawford 12/19/16 
 * Project Goal Is To Open My Web Browser For A Java App
 */
import java.lang.*;
import javax.swing.*;
import javax.swing.Spring;
import java.awt.*;
import java.awt.event.*;
import java.awt.Desktop;
import java.net.*;


public class openbrowserurl extends browseropen {
	 
	public static void main(String[] args)  {
		Desktop desktop = Desktop.getDesktop();
		
		if( !java.awt.Desktop.isDesktopSupported() ) {
			System.err.println("Desktop Not Supported");
			System.exit(1);
		}
		if (args.length == 0) {
			  System.out.println( "Usage: OpenURI [URI [URI ... ]]" );
	            System.exit( 0 );
		}
		
		if(!desktop.isSupported( java.awt.Desktop.Action.BROWSE ) ) {

            System.err.println( "Desktop doesn't support the browse action (fatal)" );
            System.exit( 1 );
        }
		
		for ( String arg : args ) {

            try {

                java.net.URI uri = new java.net.URI( geturlxt() );
                desktop.browse( uri );
            }
            catch ( Exception e ) {

                System.err.println( e.getMessage() );
            }
	}

}
}
