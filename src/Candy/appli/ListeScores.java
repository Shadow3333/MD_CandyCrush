package Candy.appli;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Candy.level.Difficults;
import Candy.level.Score;

public class ListeScores {
	private final Frame frame;
	private JPanel pan;
	private Score times;
	JLabel label;
	
	public ListeScores(Score times) {
		super();
		this.times = times;
		pan = new JPanel();
		frame = new Frame("Scores");
		
	}



	public void show() {
		frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
		
		pan.setLayout(new GridLayout(10, 1));
		JButton bouton = new JButton();
		bouton.setVisible(true);
		bouton.setSize(50, 300);
		bouton.setText("To Game Menu");
		
		int i = 0;
		TreeMap<Integer, Difficults> liste = times.getTimes();
//		for (Integer time : liste) {
//			 label = new JLabel("Score "+i+" : " + Integer.toString(time));
//			 pan.add(label);
//			 label.setVisible(true);
//			 i++;
//		}
		Iterator entries = liste.entrySet().iterator();
		while (entries.hasNext()) {
		  Entry thisEntry = (Entry) entries.next();
		  label = new JLabel("Score "+i+" : " + thisEntry.getKey() +" " + thisEntry.getValue());
		  pan.add(label);
		  label.setVisible(true);
		  i++;
		}

		
		pan.add(bouton);
		frame.add(pan);
		pan.setVisible(true);
		
		bouton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	           frame.dispose();
	           MenuJeu c = new MenuJeu(times);
	   		   c.show();
	       }
	    });
		frame.pack();
		frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	}
}
