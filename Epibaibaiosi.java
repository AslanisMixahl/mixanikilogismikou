package mix1;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Epibaibaiosi extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 531063532154207382L;
	private JPanel contentPanet;
	private JList<Integer> list1;
	private JButton buttont;
	private JLabel label;

	
	
	public Epibaibaiosi() {
		setTitle("Διαχείριση Θεάτρου");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				EpiloghThesis epth= new EpiloghThesis();
			    epth.setVisible(true);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 229);
		contentPanet = new JPanel();
		contentPanet.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanet);
		contentPanet.setLayout(null);
		
		DefaultListModel<Integer>  lm = new DefaultListModel<Integer>();
		for (Integer i : ApplicationState.selectedTheseis) {
			   lm.addElement(i);
			}
		list1 = new JList<Integer>(lm);
		list1.setEnabled(false);
		list1.setVisibleRowCount(1);
		list1.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list1.setBounds(22, 48, 361, 27);
		contentPanet.add(list1);
		
		
		
		buttont = new JButton("\u0395\u03BA\u03C4\u03CD\u03C0\u03C9\u03C3\u03B7");
		buttont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Epibaibaiosi.this.setVisible(false);
							
				EpilogiParastasis epar= new EpilogiParastasis();
			    epar.setVisible(true);
				
				
			}
		});
		buttont.setBounds(242, 93, 141, 82);
		contentPanet.add(buttont);
		buttont.setEnabled(true);
		
		JLabel lbld = new JLabel("Επιλεγμένες Θέσεις");
		lbld.setBounds(24, 23, 138, 14);
		contentPanet.add(lbld);
		
		label = new JLabel("\u0393\u03B9\u03B1 \u03C4\u03B7\u03BD \u03C0\u03B1\u03C1\u03AC\u03C3\u03C4\u03B1\u03C3\u03B7: ");
		label.setBounds(22, 81, 150, 22);
		contentPanet.add(label);
		
		JLabel label1 = new JLabel(""+ApplicationState.selectedParastasi);
		label1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label1.setBounds(22, 101, 200, 22);
		contentPanet.add(label1);
		
		JLabel label2 = new JLabel("T\u03B7\u03BD \u03CE\u03C1\u03B1: ");
		label2.setBounds(22, 134, 138, 22);
		contentPanet.add(label2);
		
		JLabel label3 = new JLabel(""+ApplicationState.selectedWra);
		label3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label3.setBounds(22, 153, 138, 22);
		contentPanet.add(label3);
		
	    
	}
	
}
