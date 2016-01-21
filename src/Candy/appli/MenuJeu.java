package Candy.appli;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import Candy.Factory.Candy_Factory;

public class MenuJeu {
	private final Frame frame;
	private JPanel pan;
	private Candy_Factory F;
	
	public MenuJeu(Candy_Factory f) {
		super();
		F = f;
		pan = new JPanel();
		frame = new Frame("Choix difficulté");
	}



	public void show() {
		frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
		
		JButton bouton1 = new JButton();
		bouton1.setVisible(true);
		bouton1.setSize(50, 300);
		bouton1.setText("Easy");
		
		JButton bouton2 = new JButton();
		bouton2.setVisible(true);
		bouton2.setSize(50, 300);
		bouton2.setText("Normal");
		
		JButton bouton3 = new JButton();
		bouton3.setVisible(true);
		bouton3.setSize(50, 300);
		bouton3.setText("Hard");
		pan.add(bouton1);
		pan.add(bouton2);
		pan.add(bouton3);
		frame.add(pan);
		frame.pack();
		

		bouton1.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           frame.dispose();
	       }
	    });
		
		bouton2.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           frame.dispose();
	       }
	    });
		
		bouton3.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           frame.dispose();
	       }
	    });
		
		frame.setBounds(50, 100, 300, 450);
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
}
