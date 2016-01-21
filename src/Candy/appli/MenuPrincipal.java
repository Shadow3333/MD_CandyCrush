package Candy.appli;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import Candy.Factory.Candy_Factory;

public class MenuPrincipal {
	private final Frame frame = new Frame("Candy Menu");
	private JPanel pan = new JPanel();
	
	public void start() {
		frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
		
		//Button lancer = new Button("Lancer Candy crush");
//		Button score = new Button("Score");
//        Button exit = new Button("Exit");
//        
//        JPanel pan = new JPanel();
		JButton bouton = new JButton();
		bouton.setVisible(true);
		bouton.setSize(50, 300);
		bouton.setText("CandyCrush");
		pan.add(bouton);
		frame.add(pan);
		frame.pack();
		

		bouton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           frame.dispose();
	           MenuJeu mj = new MenuJeu(Candy_Factory.init());
	           mj.show();
	       }
	    });
		
		frame.setBounds(50, 100, 300, 200);
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		MenuPrincipal c = new MenuPrincipal();
		c.start();
	}
}
