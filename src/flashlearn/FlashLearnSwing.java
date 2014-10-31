package flashlearn;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import com.sun.java.swing.plaf.windows.resources.windows;

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
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panelCard = new JPanel(new CardLayout());
		frame.getContentPane().add(panelCard, BorderLayout.CENTER);

		panelControl = new JPanelControl(panelCard);
		frame.getContentPane().add(panelControl, BorderLayout.NORTH);

		panelAddVocab = new JPanelAddVocab(this);
		panelCard.add(panelAddVocab, strAddVocab);
	}

	public void update() {
		frame.pack();
		frame.setBounds(100, 100, 800, 600);
	}

	public JFrame getFrame() {
		return frame;
	}
}
