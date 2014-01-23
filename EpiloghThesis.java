package mix1;

import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class EpiloghThesis extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5595125102613921146L;
	private JPanel contentPanet;
	private JList<Integer> list1;
	private JButton buttont;
	private JList<Integer> list2;
	private JList<Integer> list3;
	private JList<Integer> list4;
	private JList<Integer> list5;
	private JList<Integer> list6;
	private JList<Integer> list7;
	private JList<Integer> list8;
	private JList<Integer> list9;
	private JList<Integer> list10;
	private JList<Integer> list13;
	private JList<Integer> list14;
	private JList<Integer> list15;
	private JList<Integer> list16;
	private JList<Integer> list17;
	private JList<Integer> list11;
	private JList<Integer> list12;

	
	public EpiloghThesis() {
		setTitle("Διαχείριση Θεάτρου");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				EpilogiWras epwr= new EpilogiWras();
			    epwr.setVisible(true);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 238);
		contentPanet = new JPanel();
		contentPanet.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanet);
		contentPanet.setLayout(null);
		
		JLabel labelt = new JLabel("Επιλεγμένη Παράσταση: "+ApplicationState.selectedParastasi+" Επιλεγμένη Ώρα "+ApplicationState.selectedWra+":");
		labelt.setBounds(24, 11, 380, 22);
		contentPanet.add(labelt);
		
		DefaultListModel<Integer> listModel1 = new DefaultListModel<Integer>();
		for(int i=1; i<86; i+=17){
		listModel1.addElement(i);
		}
		list1 = new JList<Integer>(listModel1);
		list1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list1.setBounds(10, 60, 21, 93);
		contentPanet.add(list1);
		
		list1.setSelectionModel(new DefaultListSelectionModel() {	
		    /**
			 * 
			 */
			private static final long serialVersionUID = -6608533826370472289L;

			public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		
		buttont = new JButton("\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AE");
		buttont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EpiloghThesis.this.setVisible(false);
				
				List<Integer> l1= list1.getSelectedValuesList();
				List<Integer> l2= list2.getSelectedValuesList();
				List<Integer> l3= list3.getSelectedValuesList();				
				List<Integer> l4= list4.getSelectedValuesList();
				List<Integer> l5= list5.getSelectedValuesList();
				List<Integer> l6= list6.getSelectedValuesList();
				List<Integer> l7= list7.getSelectedValuesList();
				List<Integer> l8= list8.getSelectedValuesList();
				List<Integer> l9= list9.getSelectedValuesList();
				List<Integer> l10= list10.getSelectedValuesList();
				List<Integer> l11= list11.getSelectedValuesList();
				List<Integer> l12= list12.getSelectedValuesList();
				List<Integer> l13= list13.getSelectedValuesList();
				List<Integer> l14= list14.getSelectedValuesList();
				List<Integer> l15= list15.getSelectedValuesList();
				List<Integer> l16= list16.getSelectedValuesList();
				List<Integer> l17= list17.getSelectedValuesList();
				ApplicationState.selectedTheseis = new ArrayList<Integer>();
			    ApplicationState.selectedTheseis.addAll(l1);
			    ApplicationState.selectedTheseis.addAll(l2);
			    ApplicationState.selectedTheseis.addAll(l3);
			    ApplicationState.selectedTheseis.addAll(l4);
			    ApplicationState.selectedTheseis.addAll(l5);
			    ApplicationState.selectedTheseis.addAll(l6);
			    ApplicationState.selectedTheseis.addAll(l7);
			    ApplicationState.selectedTheseis.addAll(l8);
			    ApplicationState.selectedTheseis.addAll(l9);
			    ApplicationState.selectedTheseis.addAll(l10);
			    ApplicationState.selectedTheseis.addAll(l11);
			    ApplicationState.selectedTheseis.addAll(l12);
			    ApplicationState.selectedTheseis.addAll(l13);
			    ApplicationState.selectedTheseis.addAll(l14);
			    ApplicationState.selectedTheseis.addAll(l15);
			    ApplicationState.selectedTheseis.addAll(l16);
			    ApplicationState.selectedTheseis.addAll(l17);
			    Collections.sort(ApplicationState.selectedTheseis);
				Epibaibaiosi epek= new Epibaibaiosi();
			    epek.setVisible(true);			
			}
		});
		buttont.setBounds(10, 164, 414, 28);
		contentPanet.add(buttont);
		buttont.setEnabled(false);
		
		DefaultListModel<Integer> listModel2 = new DefaultListModel<Integer>();
		for(int i=2; i<86; i+=17){
		listModel2.addElement(i);
		}
		list2 = new JList<Integer>(listModel2);
		list2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list2.setBounds(30, 60, 21, 93);
		contentPanet.add(list2);
		
		
		list2.setSelectionModel(new DefaultListSelectionModel() {
		   
			private static final long serialVersionUID = 3155084040807353666L;

		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		}); 
		
		
		
		
		DefaultListModel<Integer> listModel3 = new DefaultListModel<Integer>();
		for(int i=3; i<86; i+=17){
		listModel3.addElement(i);
		}
		list3 = new JList<Integer>(listModel3);
		list3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list3.setBounds(50, 60, 21, 93);
		contentPanet.add(list3);
		
		list3.setSelectionModel(new DefaultListSelectionModel() {		   
			private static final long serialVersionUID = -2680810599045865481L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel4 = new DefaultListModel<Integer>();
		for(int i=4; i<86; i+=17){
		listModel4.addElement(i);
		}
		list4 = new JList<Integer>(listModel4);
		list4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list4.setBounds(70, 60, 21, 93);
		contentPanet.add(list4);
		
		list4.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 8999366739633298323L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel5 = new DefaultListModel<Integer>();
		for(int i=5; i<86; i+=17){
		listModel5.addElement(i);
		}
		list5 = new JList<Integer>(listModel5);
		list5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list5.setBounds(90, 60, 21, 93);
		contentPanet.add(list5);
		
		list5.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 1787945808254410108L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel6 = new DefaultListModel<Integer>();
		for(int i=6; i<86; i+=17){
		listModel6.addElement(i);
		}
		list6 = new JList<Integer>(listModel6);
		list6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list6.setBounds(146, 60, 21, 93);
		contentPanet.add(list6);
		
		list6.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 6626200298581947602L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel7 = new DefaultListModel<Integer>();
		for(int i=7; i<86; i+=17){
		listModel7.addElement(i);
		}
		list7 = new JList<Integer>(listModel7);
		list7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list7.setBounds(166, 60, 21, 93);
		contentPanet.add(list7);
		
		list7.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = -8674113412831176554L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel8 = new DefaultListModel<Integer>();
		for(int i=8; i<86; i+=17){
		listModel8.addElement(i);
		}
		list8 = new JList<Integer>(listModel8);
		list8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list8.setBounds(186, 60, 21, 93);
		contentPanet.add(list8);
		
		list8.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 1761660172875892512L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel9 = new DefaultListModel<Integer>();
		for(int i=9; i<86; i+=17){
		listModel9.addElement(i);
		}
		list9 = new JList<Integer>(listModel9);
		list9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list9.setBounds(206, 60, 21, 93);
		contentPanet.add(list9);
		
		list9.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 218327829711900571L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel10 = new DefaultListModel<Integer>();
		for(int i=10; i<86; i+=17){
		listModel10.addElement(i);
		}
		list10 = new JList<Integer>(listModel10);
		list10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list10.setBounds(226, 60, 21, 93);
		contentPanet.add(list10);
		
		list10.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 4000581521663465279L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel13 = new DefaultListModel<Integer>();
		for(int i=13; i<86; i+=17){
		listModel13.addElement(i);
		}
		list13 = new JList<Integer>(listModel13);
		list13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list13.setBounds(323, 60, 21, 93);
		contentPanet.add(list13);
		
		list13.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 7663106056031496666L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel14 = new DefaultListModel<Integer>();
		for(int i=14; i<86; i+=17){
		listModel14.addElement(i);
		}
		list14 = new JList<Integer>(listModel14);
		list14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list14.setBounds(343, 60, 21, 93);
		contentPanet.add(list14);
		
		list14.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = -5797458801624670049L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel15 = new DefaultListModel<Integer>();
		for(int i=15; i<86; i+=17){
		listModel15.addElement(i);
		}
		list15 = new JList<Integer>(listModel15);
		list15.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list15.setBounds(363, 60, 21, 93);
		contentPanet.add(list15);
		
		list15.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 8533111506893955174L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel16 = new DefaultListModel<Integer>();
		for(int i=16; i<86; i+=17){
		listModel16.addElement(i);
		}
		list16 = new JList<Integer>(listModel16);
		list16.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list16.setBounds(383, 60, 21, 93);
		contentPanet.add(list16);
		
		list16.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = -7415984868008394708L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel17 = new DefaultListModel<Integer>();
		for(int i=17; i<86; i+=17){
		listModel17.addElement(i);
		}
		list17 = new JList<Integer>(listModel17);
		list17.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list17.setBounds(403, 60, 21, 93);
		contentPanet.add(list17);
		
		list17.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = -1247141330581539039L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel11 = new DefaultListModel<Integer>();
		for(int i=11; i<86; i+=17){
		listModel11.addElement(i);
		}
		list11 = new JList<Integer>(listModel11);
		list11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list11.setBounds(246, 60, 21, 93);
		contentPanet.add(list11);
		
		list11.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 5059813171148022113L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel<Integer> listModel12 = new DefaultListModel<Integer>();
		for(int i=12; i<86; i+=17){
		listModel12.addElement(i);
		}
		list12 = new JList<Integer>(listModel12);
		list12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list12.setBounds(266, 60, 21, 93);
		contentPanet.add(list12);
		
		list12.setSelectionModel(new DefaultListSelectionModel() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 6095036970765875070L;

			@Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		JLabel lbla = new JLabel("\u0391\u03C1\u03B9\u03C3\u03C4\u03B5\u03C1\u03AC");
		lbla.setBounds(35, 40, 51, 14);
		contentPanet.add(lbla);
		
		JLabel lblk = new JLabel("\u039A\u03AD\u03BD\u03C4\u03C1\u03BF");
		lblk.setBounds(201, 40, 46, 14);
		contentPanet.add(lblk);
		
		JLabel lbld = new JLabel("\u0394\u03B5\u03BE\u03B9\u03AC");
		lbld.setBounds(362, 40, 46, 14);
		contentPanet.add(lbld);
		
		MyListListener listenert = new MyListListener();
	    list1.addListSelectionListener(listenert);
	    list2.addListSelectionListener(listenert);
	    list3.addListSelectionListener(listenert);
	    list4.addListSelectionListener(listenert);
	    list5.addListSelectionListener(listenert);
	    list6.addListSelectionListener(listenert);
	    list7.addListSelectionListener(listenert);
	    list8.addListSelectionListener(listenert);
	    list9.addListSelectionListener(listenert);
	    list10.addListSelectionListener(listenert);
	    list11.addListSelectionListener(listenert);
	    list12.addListSelectionListener(listenert);
	    list13.addListSelectionListener(listenert);
	    list14.addListSelectionListener(listenert);
	    list15.addListSelectionListener(listenert);
	    list16.addListSelectionListener(listenert);
	    list17.addListSelectionListener(listenert);
	    
	    
	    
	}
	private class MyListListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent eventw) {
		if (eventw.getValueIsAdjusting() == false) {
			
		
		buttont.setEnabled(true);
		
				}
			}
		}
}
