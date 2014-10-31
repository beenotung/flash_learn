package flashlearn;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelControl extends JPanel {
	private JPanel panelCard;

	private JButton btnAddVocab;

	/**
	 * Create the panel.
	 */
	public JPanelControl(JPanel panelCard) {
		this.panelCard = panelCard;
		btnAddVocab = new JButton(FlashLearnSwing.strAddVocab);
		btnAddVocab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addVocab();
			}
		});
		setVisible(true);
	}

	private void addVocab() {
		CardLayout cardLayout = (CardLayout) panelCard.getLayout();
		cardLayout.show(panelCard, FlashLearnSwing.strAddVocab);
	}
}
