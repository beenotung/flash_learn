package flashlearn;

import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class JPanelAddVocab extends JPanel {
	private FlashLearnSwing flashLearnSwing;

	private static String strAddLabel = "Add Label";
	private static String strAddWord = "Add Word";
	private static String strLabelDefault = "Type Label Here";
	private static String strLangDefault = "Choose Lang Here";
	private static String strWordDefault = "Type Word Here";

	private JButton btnAddLabel;
	private JButton btnAddPanelWord;
	private Vector<JPanel> panelLabels;
	private Vector<JPanel> panelWords;

	/**
	 * Create the panel.
	 * 
	 * @param flashLearnSwing
	 */

	public JPanelAddVocab(FlashLearnSwing flashLearnSwing) {
		this.flashLearnSwing = flashLearnSwing;

		setLayout(new FlowLayout());

		btnAddLabel = new JButton(strAddLabel);
		btnAddLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addLabel();
			}
		});

		btnAddPanelWord = new JButton(strAddWord);
		btnAddPanelWord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addWord();
			}
		});

		panelLabels = new Vector<JPanel>();
		panelWords = new Vector<JPanel>();

		addLabel();
		addWord();
	}

	protected void addLabel() {
		JPanel panelLabel = new JPanel();
		panelLabels.add(panelLabel);
		TextField textFieldLabel = new TextField(strLabelDefault);
		panelLabel.add(textFieldLabel);

		update();
	}

	protected void addWord() {
		// TODO Auto-generated method stub
		JPanel panelWord = new JPanel();
		panelWords.add(panelWord);
		Choice choiceLang = new Choice();
		panelWord.add(choiceLang);
		choiceLang.add(strLangDefault);

		JTextField textFieldWord = new JTextField(strWordDefault);
		panelWord.add(textFieldWord);
		textFieldWord.setColumns(10);

		update();
	}

	private void update() {
		removeAll();
		add(btnAddLabel);
		add(btnAddPanelWord);
		for (JPanel jPanel : panelLabels)
			add(jPanel);
		for (JPanel jPanel : panelWords)
			add(jPanel);
		flashLearnSwing.update();
	}

}
