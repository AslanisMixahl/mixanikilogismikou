package mix1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Diaxiristis extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4384087044585835363L;
	private JPanel contentPane;
	private JButton button;
	private JTextField titlospar;
	private JTextField wrpar;

	private Connection conn;
	private ResultSet rs;
	
	public Diaxiristis() {		
		setTitle("\u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7 \u0398\u03B5\u03AC\u03C4\u03C1\u03BF\u03C5");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				Login log= new Login();
			    log.setVisible(true);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 514, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel label = new JLabel("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u03A4\u03AF\u03C4\u03BB\u03BF\u03C5 \u03A0\u03B1\u03C1\u03AC\u03C3\u03C4\u03B1\u03C3\u03B7\u03C2:");
		label.setBounds(24, 11, 354, 22);
		contentPane.add(label);
		
		
		
	    
		button = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				conn=Helpers.connectDatatbase();
				
				String strpar= titlospar.getText();
				String strwr= wrpar.getText();
				
							
				String sql1 = "INSERT INTO par (name,location) values('"+strpar+"','"+ApplicationState.selectedLocation+"')";	
				Helpers.executeUpdate(conn, sql1);			
				
							
				rs = Helpers.getResults(conn, "SELECT id FROM par WHERE name='"	+ strpar + "'");
				String id = "";
				try 
				{
					while (rs.next()) {
						id = rs.getString("id");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				
				String sql2 = "INSERT INTO wres (wra,parid) values('"+strwr+"','"+id+"')";
						
				Helpers.executeUpdate(conn, sql2);
				
				titlospar.setText("");
				wrpar.setText("");				
			}
		});
		
		
		button.setBounds(24, 201, 222, 63);
		contentPane.add(button);
		button.setEnabled(false);
		
		titlospar = new JTextField();
		titlospar.setBounds(24, 44, 232, 30);
		contentPane.add(titlospar);
		titlospar.setColumns(10);
		
		Document document1 = titlospar.getDocument();
	    document1.addDocumentListener(new JButtonStateController(button));
	    
	
		
		JLabel lblNewLabel = new JLabel("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u038F\u03C1\u03B1\u03C2 \u03A0\u03B1\u03C1\u03AC\u03C3\u03C4\u03B1\u03C3\u03B7\u03C2:");
		lblNewLabel.setBounds(24, 85, 354, 22);
		contentPane.add(lblNewLabel);
		
		wrpar = new JTextField();
		wrpar.setBounds(24, 118, 232, 30);
		contentPane.add(wrpar);
		wrpar.setColumns(10);
		
		JButton button1 = new JButton("\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE");
		button1.setEnabled(false);
		button1.setBounds(256, 201, 222, 63);
		contentPane.add(button1);
	
		
		document1.addDocumentListener(new JButtonStateController(button1));
		
		
		
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				conn=Helpers.connectDatatbase();
				
				String strpar= titlospar.getText();		
								
				rs = Helpers.getResults(conn, "SELECT id FROM par WHERE name='"	+ strpar + "'");
				String id = "";
				try 
				{
					while (rs.next()) {
						id = rs.getString("id");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				
				String sql2 = "DELETE from wres where parid='"+id+"'";
				Helpers.executeUpdate(conn, sql2);
				
				titlospar.setText("");
				wrpar.setText("");
				
				String sql1 = "DELETE from par where name='"+strpar+"'";
				Helpers.executeUpdate(conn, sql1);

			}
		});
		
	    
	    
	}
	
	class JButtonStateController implements DocumentListener {
		 JButton button;
		  
		  JButtonStateController(JButton button) {
		     this.button = button ;
		  }

		  public void changedUpdate(DocumentEvent e) {
		    disableIfEmpty(e);
		  }

		  public void insertUpdate(DocumentEvent e) {
		    disableIfEmpty(e);
		  }

		  public void removeUpdate(DocumentEvent e) {
		    disableIfEmpty(e);
		  }

		  public void disableIfEmpty(DocumentEvent e) {
		    button.setEnabled(e.getDocument().getLength() > 0);
		  }
		  
	}
}
