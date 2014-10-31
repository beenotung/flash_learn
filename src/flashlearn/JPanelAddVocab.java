package flashlearn;

import javax.swing.JPanel;

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

	private JPanel panelLabels;
	// private Vector<E>
	private JPanel panelWords;

	/**
	 * Create the panel.
	 * 
	 * @param flashLearnSwing
	 */
	public JPanelAddVocab(FlashLearnSwing flashLearnSwing) {
		this.flashLearnSwing = flashLearnSwing;
		
		setLayout(new FlowLayout());

		panelLabels = new JPanel(new FlowLayout());
		add(panelLabels);

		JButton btnAddLabel = new JButton(strAddLabel);
		panelLabels.add(btnAddLabel);
		btnAddLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addLabel();
			}
		});

		addLabel();

		panelWords = new JPanel(new FlowLayout());
		add(panelWords);

		JButton btnAddPanelWord = new JButton(strAddWord);
		panelWords.add(btnAddPanelWord);
		btnAddPanelWord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addWord();
			}
		});

		addWord();

	}

	protected void addLabel() {
		// TODO Auto-generated method stub
		JPanel panelLabel = new JPanel();
		panelLabels.add(panelLabel);
		TextField textFieldLabel = new TextField(strLabelDefault);
		panelLabel.add(textFieldLabel);

		flashLearnSwing.update();
	}

	protected void addWord() {
		// TODO Auto-generated method stub
		JPanel panelWord = new JPanel();
		panelWords.add(panelWord);
		Choice choiceLang = new Choice();
		panelWord.add(choiceLang);
		choiceLang.add(strLangDefault);

		textFieldWord = new JTextField(strWordDefault);
		panelWord.add(textFieldWord);
		textFieldWord.setColumns(10);

		flashLearnSwing.update();
	}

}
