package projekatRM2;

/*import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
*/


/**
 *
 * @author mm170565d
 */

@SuppressWarnings("serial")
public class Gui extends javax.swing.JFrame {
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	//private javax.swing.JButton jButton1;
	

	public Gui(Sessija s11, Sessija s12, Sessija s21, Sessija s22, Sessija s31, Sessija s32) {
		initComponents();
		updateComponents(s11, s12, s21, s22, s31, s32);
		setVisible(true);
		
		/*jButton1.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		        //your actions
		    }
		});*/
	}


	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		//jButton1 = new javax.swing.JButton();

		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { "Br. dolaznih SMNP paketa", null }, 
										{ "Br. odlaznih SMNP paketa", null },
										{ "Br. get zahteva", null }, 
										{ "Br. set zahteva", null },
										{ "Br. generisanih trapova", null }, 
										{ "Br. neispravnih com. vrednosti", null } },
						new String[] { "Ruter 2", "" }));
		jScrollPane1.setViewportView(jTable1);

		
		jTable2.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { "Br. dolaznih SMNP paketa", null }, 
										{ "Br. odlaznih SMNP paketa", null },
										{ "Br. get zahteva", null }, 
										{ "Br. set zahteva", null },
										{ "Br. generisanih trapova", null }, 
										{ "Br. neispravnih com. vrednosti", null } },
						new String[] { "Ruter 1", "" }));
		jScrollPane2.setViewportView(jTable2);

		
		jTable3.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { "Br. dolaznih SMNP paketa", null }, 
										{ "Br. odlaznih SMNP paketa", null },
										{ "Br. get zahteva", null }, 
										{ "Br. set zahteva", null },
										{ "Br. generisanih trapova", null }, 
										{ "Br. neispravnih com. vrednosti", null } },
						new String[] { "Ruter 3", "" }));
		jScrollPane3.setViewportView(jTable3);
		
		//jButton1.setText("btnbtn");

		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)))
                        //.addComponent(jButton1)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                //.addGap(34, 34, 34)
                //.addComponent(jButton1)
                .addContainerGap(44, Short.MAX_VALUE))
        );
						

		pack();
	}

	
	public void updateComponents(Sessija s11, Sessija s12, Sessija s21, Sessija s22, Sessija s31, Sessija s32) {

		jTable1.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { "Br. dolaznih SMNP paketa", s21.getPdu(".1.3.6.1.2.1.11.1.0")  }, 
										{ "Br. odlaznih SMNP paketa", s21.getPdu(".1.3.6.1.2.1.11.2.0")  },
										{ "Br. get zahteva", s21.getPdu(".1.3.6.1.2.1.11.15.0") }, 
										{ "Br. set zahteva", s21.getPdu(".1.3.6.1.2.1.11.17.0") },
										{ "Br. generisanih trapova", s21.getPdu(".1.3.6.1.2.1.11.29.0") }, 
										{ "Br. neispravnih com. vrednosti", s21.getPdu(".1.3.6.1.2.1.11.4.0") } },
						new String[] { "Ruter 2", "" }));
		
		jTable2.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { "Br. dolaznih SMNP paketa", s11.getPdu(".1.3.6.1.2.1.11.1.0") }, 
										{ "Br. odlaznih SMNP paketa", s11.getPdu(".1.3.6.1.2.1.11.2.0") },
										{ "Br. get zahteva", s11.getPdu(".1.3.6.1.2.1.11.15.0") }, 
										{ "Br. set zahteva", s11.getPdu(".1.3.6.1.2.1.11.17.0") },
										{ "Br. generisanih trapova", s11.getPdu(".1.3.6.1.2.1.11.29.0") },
										{ "Br. neispravnih com. vrednosti", s11.getPdu(".1.3.6.1.2.1.11.4.0") } },
						new String[] { "Ruter 1", "" }));
		
		jTable3.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { "Br. dolaznih SMNP paketa", s31.getPdu(".1.3.6.1.2.1.11.1.0") }, 
										{ "Br. odlaznih SMNP paketa", s31.getPdu(".1.3.6.1.2.1.11.2.0") },
										{ "Br. get zahteva", s31.getPdu(".1.3.6.1.2.1.11.15.0") }, 
										{ "Br. set zahteva", s31.getPdu(".1.3.6.1.2.1.11.17.0") },
										{ "Br. generisanih trapova", s31.getPdu(".1.3.6.1.2.1.11.29.0") }, 
										{ "Br. neispravnih com. vrednosti", s31.getPdu(".1.3.6.1.2.1.11.4.0") } },
						new String[] { "Ruter 3", "" }));
		
	}

}
