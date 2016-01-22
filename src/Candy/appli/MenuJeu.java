package Candy.appli;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JPanel;

import Candy.Factory.Candy_Factory;
import Candy.level.Score;
import Candy.strategy.LevelEasyStrategy;
import Candy.strategy.LevelHardStrategy;
import Candy.strategy.LevelMediumStrategy;
import Candy.strategy.Strategy;

public class MenuJeu {
	private final Frame frame;
	private JPanel pan;
	private Candy_Factory F;
	private Score times;
	
	public MenuJeu(Candy_Factory f) {
		super();
		F = f;
		pan = new JPanel();
		frame = new Frame("Choix difficult");
		times = new Score();
	}
	
	public MenuJeu(Score times) {
		super();
		F = Candy_Factory.init();
		pan = new JPanel();
		frame = new Frame("Choix difficult");
		if (this.times == null) {
			this.times = new Score();			
		}
		this.times = times;
	}



	public void show() {
		frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
		
		JButton bouton0 = new JButton();
		bouton0.setVisible(true);
		bouton0.setSize(50, 300);
		bouton0.setText("Scores");
		
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
		
		JButton bouton4 = new JButton();
		bouton4.setVisible(true);
		bouton4.setSize(50, 300);
		bouton4.setText("to Main Menu");
		
		
		if (times.getTimes() != null) {
			pan.add(bouton0);			
		}
		pan.add(bouton1);
		pan.add(bouton2);
		pan.add(bouton3);
		pan.add(bouton4);
		frame.add(pan);
		frame.pack();
		
		bouton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MenuPrincipal c = new MenuPrincipal();
				c.start();
			}
		});

		bouton1.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           frame.dispose();
	           Strategy St = new LevelEasyStrategy();
	           Game cc = F.Create_Game(St, times);
	           cc.start();
	       }
	    });
		
		bouton2.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           frame.dispose();
	           Strategy St = new LevelMediumStrategy();
	           Game cc = F.Create_Game(St, times);
	           cc.start();
	       }
	    });
		
		bouton3.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           frame.dispose();
	           Strategy St = new LevelHardStrategy();
	           Game cc = F.Create_Game(St, times);
	           cc.start();
	       }
	    });
		
		bouton0.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           frame.dispose();
	           ListeScores ls= new ListeScores(times);
	           ls.show();
	       }
	    });
		
		frame.pack();
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
}
