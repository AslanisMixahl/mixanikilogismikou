package mix1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;


import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JPasswordField;


public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton button;
	private JRadioButton radioButton1;
	private JRadioButton radioButton;
	private JLabel label1;
	private JPasswordField passwordField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		super("Διαχείριση Θεάτρου");
		setTitle("Διαχείριση Θεάτρου");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 414, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0395\u03AF\u03C3\u03BF\u03B4\u03BF\u03C2 \u03C9\u03C2:");
		label.setBounds(24, 65, 81, 22);
		contentPane.add(label);
		radioButton = new JRadioButton("\u0394\u03B9\u03B1\u03C7\u03B5\u03B9\u03C1\u03B9\u03C3\u03C4\u03AE\u03C2");
		
		radioButton.setBounds(192, 65, 96, 23);
		contentPane.add(radioButton);
		
		radioButton1 = new JRadioButton("\u03A4\u03B1\u03BC\u03AF\u03B1\u03C2");
		radioButton1.setSelected(true);
		
		radioButton1.setBounds(117, 65, 73, 23);
		contentPane.add(radioButton1);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton);
		group.add(radioButton1);
		
		label1 = new JLabel("\u0395\u03B9\u03C3\u03AC\u03B3\u03B5\u03C4\u03B1\u03B9 \u03C4\u03BF\u03BD \u03BA\u03C9\u03B4\u03B9\u03BA\u03CC \u03C3\u03B1\u03C2:");
		label1.setBounds(24, 110, 166, 22);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("\u03A5\u03C0\u03BF\u03BA\u03B1\u03C4\u03AC\u03C3\u03C4\u03B7\u03BC\u03B1:");
		label2.setBounds(24, 31, 144, 22);
		contentPane.add(label2);
		
		final JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerListModel(new String[] {"\u03A5\u03C0\u03BF\u03BA\u03B1\u03C4\u03AC\u03C3\u03C4\u03B7\u03BC\u03B1 3", "\u03A5\u03C0\u03BF\u03BA\u03B1\u03C4\u03AC\u03C3\u03C4\u03B7\u03BC\u03B1 2", "\u03A5\u03C0\u03BF\u03BA\u03B1\u03C4\u03AC\u03C3\u03C4\u03B7\u03BC\u03B1 1"}));
		spinner.setBounds(118, 32, 145, 20);
		contentPane.add(spinner);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(184, 111, 104, 20);
		contentPane.add(passwordField);
	
		button = new JButton("\u0395\u03AF\u03C3\u03BF\u03B4\u03BF\u03C2");
		button.addActionListener(new ActionListener() {					
			public void actionPerformed(ActionEvent e) {
				if ((String)spinner.getValue()=="Υποκατάστημα 1")
				{
					ApplicationState.selectedLocation="1";
				}
				else if((String)spinner.getValue()=="Υποκατάστημα 2")
				{
					ApplicationState.selectedLocation="2";
				}
				else
				{
					ApplicationState.selectedLocation="3";
				}
				if(radioButton1.isSelected()){
					Login.this.setVisible(false);
					EpilogiParastasis epara= new EpilogiParastasis();
					epara.setVisible(true);					
				}			
				else if(radioButton.isSelected()){
				
						
						Login.this.setVisible(false);
				    Diaxiristis dia= new Diaxiristis();
				    dia.setVisible(true);
						
					}
				
				}
			   
			}
		);
		
		button.setBounds(24, 152, 327, 38);
		contentPane.add(button);
	    
	    
	}
}
