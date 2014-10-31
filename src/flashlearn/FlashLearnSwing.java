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
	private JPanel panelControl;
	private JPanel panelCard;
	private JPanel panelAddVocab;
	
	private String strAddVocab="Add Vocab";

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

		panelControl = new JPanel();
		frame.getContentPane().add(panelControl, BorderLayout.NORTH);
		
		panelCard=new JPanel(new CardLayout());
		frame.getContentPane().add(panelCard,BorderLayout.CENTER);
		

		JButton btnAddVocab = new JButton(strAddVocab);
		btnAddVocab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVocab();
			}
		});
		panelControl.add(btnAddVocab);

		panelAddVocab = new JPanel();
		panelCard.add(panelAddVocab,strAddVocab);
		}

	protected void addVocab() {
		// TODO Auto-generated method stub
		CardLayout cardLayout=(CardLayout) panelCard.getLayout();
		cardLayout.show(panelCard, strAddVocab);
	}
}
