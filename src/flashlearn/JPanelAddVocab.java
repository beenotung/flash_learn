package flashlearn;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class JPanelAddVocab extends JPanel {
	private FlashLearnSwing flashLearnSwing;

	private JTextField textFieldWord;
	private static String strAddLabel = "Add Label";
	private static String strAddWord = "Add Word";
	private static String strLabelDefault = "Type Label Here";
	private static String strLangDefault = "Choose Lang Here";
	private static String strWordDefault = "Type Word Here";

	/**
	 * Create the panel.
	 * 
	 * @param flashLearnSwing
	 */
	public JPanelAddVocab(FlashLearnSwing flashLearnSwing) {
		this.flashLearnSwing = flashLearnSwing;

		setLayout(new FlowLayout());

		JButton btnAddLabel = new JButton(strAddLabel);
		add(btnAddLabel);
		btnAddLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addLabel();
			}
		});

		JButton btnAddPanelWord = new JButton(strAddWord);
		add(btnAddPanelWord);
		btnAddPanelWord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addWord();
			}
		});

		addLabel();

		addWord();
	}

	protected void addLabel() {
		// TODO Auto-generated method stub
		JPanel panelLabel = new JPanel();
		add(panelLabel);
		// panelLabels.add(panelLabel);
		TextField textFieldLabel = new TextField(strLabelDefault);
		panelLabel.add(textFieldLabel);

		flashLearnSwing.update();
	}

	protected void addWord() {
		// TODO Auto-generated method stub
		JPanel panelWord = new JPanel();
		add(panelWord);
		Choice choiceLang = new Choice();
		panelWord.add(choiceLang);
		choiceLang.add(strLangDefault);

		textFieldWord = new JTextField(strWordDefault);
		panelWord.add(textFieldWord);
		textFieldWord.setColumns(10);

		flashLearnSwing.update();
	}

}
