/*
 *  JFLAP - Formal Languages and Automata Package
 * 
 * 
 *  Susan H. Rodger
 *  Computer Science Department
 *  Duke University
 *  August 27, 2009

 *  Copyright (c) 2002-2009
 *  All rights reserved.

 *  JFLAP is open source software. Please see the LICENSE for terms.
 *
 */





package gui;

import gui.ImageDisplayComponent;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

// import java.applet.Applet;
// import java.applet.AudioClip;

/**
 * The <TT>AboutBox</TT> is the about box for JFLAP.
 * 
 * @author Thomas Finley
 */

public class AboutBox extends JWindow {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new <TT>AboutBox</TT>.
	 *
	 * @param owner
	 *            the owner of this about box
	 */
	public AboutBox(Frame owner) {
		super(owner);
		getContentPane().setLayout(new BorderLayout());

		// Create a simple panel to display the image
		JPanel panel = new JPanel(new BorderLayout());
		panel.setOpaque(false);
		panel.setBorder(new EmptyBorder(2, 2, 2, 2));

		// Add the image display component with scaled image
		if (IMAGE != null) {
			ImageDisplayComponent imageComponent = new ImageDisplayComponent(IMAGE);
			// Scale the image to make the window even smaller
			Image scaledImage = IMAGE.getScaledInstance(324, 97, Image.SCALE_SMOOTH);
			imageComponent.setImage(scaledImage);
			panel.add(imageComponent, BorderLayout.CENTER);
		} else {
			// Fallback: display text if image can't be loaded
			JLabel textLabel = new JLabel("JFLAP - Formal Languages and Automata Package", JLabel.CENTER);
			textLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
			textLabel.setForeground(Color.BLACK);
			panel.add(textLabel, BorderLayout.CENTER);
		}

		// Create bottom panel with version and close button
		JPanel bottomPanel = new JPanel(new BorderLayout());
		bottomPanel.setOpaque(false);

		// Add version information
		JLabel versionLabel = new JLabel("JFLAP Version " + VERSION, JLabel.CENTER);
		versionLabel.setForeground(Color.BLACK);
		versionLabel.setFont(new Font("SansSerif", Font.BOLD, 9));
		bottomPanel.add(versionLabel, BorderLayout.CENTER);

		// Add close button
		JButton closeButton = new JButton("Close");
		closeButton.setFont(new Font("SansSerif", Font.PLAIN, 8));
		closeButton.addActionListener(e -> setVisible(false));
		bottomPanel.add(closeButton, BorderLayout.EAST);

		panel.add(bottomPanel, BorderLayout.SOUTH);

		getContentPane().add(panel, BorderLayout.CENTER);

		// Set appropriate size
		pack();

		// Add mouse listener for click-to-close (preserve original behavior)
		addMouseListener(new BoxDismisser());
	}

	/**
	 * Returns a label with the appropriate string.
	 * 
	 * @param string
	 *            the string to display
	 * @return a properly created JLabel visible on this frame
	 */
	private static JLabel getLabel(String string) {
		JLabel label = new JLabel(string);
		if (IMAGE != null)
			label.setForeground(Color.black);
		return label;
	}

	/**
	 * Instantiates a new <TT>AboutBox</TT> with no specified owner.
	 */
	public AboutBox() {
		this((Frame) null);
	}

	/**
	 * Displays this about box, and plays the clip.
	 */
	public void displayBox() {
		boolean toPlay = !isVisible();
		pack();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension boxSize = getPreferredSize();
		setLocation((screenSize.width - boxSize.width) >> 1,
				(screenSize.height - boxSize.height) >> 1);
		toFront();
		setVisible(true);
	}

	/**
	 * Dismisses this about box, and stops the clip.
	 */
	public void dismissBox() {
		dispose();
		// CLIP.stop();
	}

	/**
	 * This listens for clicks on the box. When it receives them, the box is
	 * dismissed.
	 */
	private class BoxDismisser extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			dismissBox();
		}
	}

	/** A simple object to get the class off for resource reading. */
	private static Object OBJECT = new Object();

	/** The image to display in the about box. */
	private static Image IMAGE = null;

	/** The version string. */
	    public static final String VERSION = "8.0";

	/**
	 * Some simple test code for the about box.
	 */
	public static void main(String args[]) {
		AboutBox box = new AboutBox();
		box.displayBox();
	}

	static {
		try {
			java.net.URL url = gui.ResourceLoader.getResource("MEDIA/about.png");
			if (url != null) {
				IMAGE = Toolkit.getDefaultToolkit().getImage(url);
				// Wait for image to load
				MediaTracker tracker = new MediaTracker(new JPanel());
				tracker.addImage(IMAGE, 0);
				tracker.waitForID(0);
			} else {
				System.err.println("Warning: Could not find about image: MEDIA/about.png");
			}
		} catch (Exception e) {
			System.err.println("Warning: Could not load about image: MEDIA/about.png - " + e.getMessage());
		}
	}
}
