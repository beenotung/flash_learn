package flashlearn;

import javax.swing.JPanel;

import java.awt.TextField;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class JPanelAddVocab extends JPanel {
	private JFrame frame;
	
	private JTextField textFieldWord;
	private static String strAddLabel = "Add Label";
	private static String strAddWord = "Add Word";
	private static String strLabelDefault = "Type Label Here";
	private static String strLangDefault = "Choose Lang Here";
	private static String strWordDefault = "Type Word Here";

	private JPanel panelLabel;
	private JPanel panelWord;

	/**
	 * Create the panel.
	 * @param frame 
	 */
	public JPanelAddVocab(JFrame frame) {
		this.frame=frame;

		panelLabel = new JPanel();
		add(panelLabel);

		TextField textFieldLabel = new TextField(strLabelDefault);
		panelLabel.add(textFieldLabel);

		JButton btnAddLabel = new JButton(strAddLabel);
		panelLabel.add(btnAddLabel);
		btnAddLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addLabel();
			}
		});

		panelWord = new JPanel();
		add(panelWord);

		Choice choiceLang = new Choice();
		panelWord.add(choiceLang);
		choiceLang.add(strLangDefault);

		textFieldWord = new JTextField(strWordDefault);
		panelWord.add(textFieldWord);
		textFieldWord.setColumns(10);

		JButton btnAddPanelWord = new JButton(strAddWord);
		panelWord.add(btnAddPanelWord);
		btnAddPanelWord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addWord();
			}
		});
	}

	protected void addLabel() {
		// TODO Auto-generated method stub
		TextField textFieldLabel = new TextField(strLabelDefault);
		panelLabel.add(textFieldLabel);		
		frame.pack();
	}

	protected void addWord() {
		// TODO Auto-generated method stub
		Choice choiceLang = new Choice();
		panelWord.add(choiceLang);
		choiceLang.add(strLangDefault);

		textFieldWord = new JTextField(strWordDefault);
		panelWord.add(textFieldWord);
		textFieldWord.setColumns(10);
		frame.pack();
	}

}
