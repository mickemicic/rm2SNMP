package projekatRM2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;



//TODO PODESI RUTERE I COMM VREDNOSTI I TRAPOVE



public class Main {
	
	public static void main(String[] args) {
		Sessija s11 = new Sessija("192.168.10.1");
		Sessija s12 = new Sessija("192.168.13.1");
		Sessija s21 = new Sessija("192.168.20.1");
		Sessija s22 = new Sessija("192.168.23.2");
		Sessija s31 = new Sessija("192.168.30.1");
		Sessija s32 = new Sessija("192.168.23.3");
		
        
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		
		Gui g = new Gui(s11, s12, s21, s22, s31, s32);
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                g.setVisible(true);
            }
        });
        
        
        int delay = 10000; // milliseconds

		ActionListener taskPerformer = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				g.updateComponents(s11, s12, s21, s22, s31, s32);
			}
		};
		new Timer(delay, taskPerformer).start();

	}

}
