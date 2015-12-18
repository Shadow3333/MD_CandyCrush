package Candy.appli;

import  javax.swing.*;
import  java.awt.*;
import  java.awt.event.*;

public class Bouton  extends JPanel implements ActionListener{

	
	/** Constructeur de test */
    public Bouton()
    {    	
    	//panel
        JPanel  pan=new JPanel();
        pan.setLayout(new BorderLayout());
        
        //bouton ici
        JButton play=new JButton("Jouer");
        JButton exit = new JButton("exit");
        JButton score = new JButton("score");
        
        //ajoute un listener : ici le listener est cette classe
        play.addActionListener(this);
        
        //ajoute le boutton dans le panel
        pan.add(play,BorderLayout.CENTER);
        pan.add(score, BorderLayout.AFTER_LAST_LINE);
        pan.add(exit, BorderLayout.EAST);
        
        //
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setContentPane(pan);
//        pack(); //permet de mettre une bonne dimension a la fenetre
        setVisible(true);
    }
    
    /**
     * obligatoire car test implémente l'interface ActionListener
     */
    public  void    actionPerformed(ActionEvent e)
    {
        //quand on a cliqué sur le bouton ici
        System.out.println("Ici !");
    }
    

}
