package mix1;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ListSelectionModel;

public class EpilogiWras extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPanew;
	private JList<String> listw;
	private JButton buttonw;

	private Connection conn = null;
	private ResultSet rs = null;

	public EpilogiWras() {
		setTitle("\u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7 \u0398\u03B5\u03AC\u03C4\u03C1\u03BF\u03C5");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				EpilogiParastasis epar = new EpilogiParastasis();
				epar.setVisible(true);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 376, 271);
		contentPanew = new JPanel();
		contentPanew.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanew);
		contentPanew.setLayout(null);

		conn = Helpers.connectDatatbase();

		rs = Helpers.getResults(conn, "SELECT id FROM par WHERE name='"	+ ApplicationState.selectedParastasi + "'");
		String id = "";
		try 
		{
			while (rs.next()) {
				id = rs.getString("id");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		rs = Helpers.getResults(conn, "SELECT * FROM wres WHERE parid='" + id+ "'");
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		try 
		{
			while (rs.next()) {

				String wra = rs.getString("wra");

				listModel.addElement(wra);
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		listw = new JList<String>(listModel);

		JLabel labelw = new JLabel("Επιλέξτε Ώρα "
				+ ApplicationState.selectedParastasi + ":");
		labelw.setBounds(24, 11, 400, 22);
		contentPanew.add(labelw);

		listw.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listw.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null,
				null));
		listw.setBounds(24, 44, 155, 158);
		contentPanew.add(listw);

		buttonw = new JButton("\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AE");
		buttonw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EpilogiWras.this.setVisible(false);
				ApplicationState.selectedWra = listw.getSelectedValue().toString();
				EpiloghThesis epth= new EpiloghThesis();
				epth.setVisible(true);
			}
		});
		buttonw.setBounds(213, 78, 115, 85);
		contentPanew.add(buttonw);
		buttonw.setEnabled(false);

		listw.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				if (arg0.getValueIsAdjusting() == false) {
					buttonw.setEnabled(true);
				}
			}

		}

		);

	}
}
