package mix1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;


public class EpilogiParastasis extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JList<String> list;
	private JButton button;

	Connection conn = null;
	ResultSet rs = null;
	

	public EpilogiParastasis() {
		setTitle("\u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7 \u0398\u03B5\u03AC\u03C4\u03C1\u03BF\u03C5");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				Login log= new Login();
			    log.setVisible(true);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 434, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		conn=Helpers.connectDatatbase();
		rs=Helpers.getResults(conn, "SELECT * FROM par WHERE location="+ApplicationState.selectedLocation);
		DefaultListModel<String> listModel = new DefaultListModel<String>();
		try {
			while (rs.next())
			{
				
			
			String onoma = rs.getString("name");
			
			listModel.addElement(onoma);
			list = new JList<String>(listModel);
			

			}
		} 
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		
		JLabel label = new JLabel("\u0395\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03A0\u03B1\u03C1\u03AC\u03C3\u03C4\u03B1\u03C3\u03B7:");
		label.setBounds(24, 11, 400, 22);
		contentPane.add(label);
		
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setBounds(24, 44, 212, 158);
		contentPane.add(list);
		
	    
		button = new JButton("\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EpilogiParastasis.this.setVisible(false);
				ApplicationState.selectedParastasi = list.getSelectedValue().toString();
			    EpilogiWras epwr= new EpilogiWras();
			    epwr.setVisible(true);
			   
			}
		});
		
		button.setBounds(80, 241, 226, 35);
		contentPane.add(button);
		button.setEnabled(false);
		
		
		MyListListener listener = new MyListListener();
	    list.addListSelectionListener(listener);
	    
	    
	}
	public class MyListListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent event) {
		if (event.getValueIsAdjusting() == false) {
			
		
	
		button.setEnabled(true);
		
				}
			}
		}

}
