package flashlearn;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.SwingConstants;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FlashLearnSwing {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=112,-3
	 */
	private JPanelControl panelControl;
	private JPanel panelCard;
	private JPanelAddVocab panelAddVocab;

	public static String strAddVocab = "Add Vocab";

	/**
	 * Launch the application.
	 */
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlashLearnSwing window = new FlashLearnSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FlashLearnSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panelCard = new JPanel(new CardLayout());
		frame.getContentPane().add(panelCard, BorderLayout.CENTER);

		panelControl = new JPanelControl(panelCard);
		frame.getContentPane().add(panelControl, BorderLayout.NORTH);

		panelAddVocab = new JPanelAddVocab();
		panelCard.add(panelAddVocab, strAddVocab);
	}

}
