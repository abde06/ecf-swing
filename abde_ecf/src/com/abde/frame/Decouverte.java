package com.abde.frame;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Decouverte extends JFrame
{
	private static final long serialVersionUID = 1L;

////ATTRIBUTS DU MENU ACCESSIBLE DANS TOUTE LA CLASSE

	private JPanel contentPane;
	private JButton btn;
	private JTextField txt;
	private JTextArea txtArea;
	public Decouverte(String Titre)
	{
////////INITIALISATION DE LA FENETRE		
		super(Titre);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null); 

////////MISE EN PLACE DE LA GRILLE DE POSITION DANS LE PANEL
		contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();
		
////////CREATION ET POSITIONNEMENT DU CHAMP DE TEXTE
		txt = new JTextField("on a droit qu'a une ligne ... mais ce n'est pas éditable !!!");
		txt.setEditable(false);
		txt.setBorder(BorderFactory.createLineBorder(Color.BLUE,6));
		
		g.gridy=0;
		g.gridx=0;	
		g.insets =new Insets(20,20, 20, 20);
		contentPane.add(txt,g);
		
////////CREATION ET POSITIONNEMENT DE LA ZONE DE TEXTE
		txtArea = new JTextArea("Ici on peut s'exprimer !!!!\nEn plus sur plusieur lignes ...");
		txtArea.setColumns(40);
		txtArea.setRows(10);
		JScrollPane sPan = new JScrollPane(txtArea);
		
		g.gridy=1;
		g.gridx=0;	
		g.insets =new Insets(20,20, 20, 20);
		contentPane.add(sPan,g);
		
////////CREATION ET POSITIONNEMENT DU BOUTON
		btn = new JButton("Bouton en panne");
		btn.setToolTipText("Cliquez !!!!");
		btn.setEnabled(false);
		btn.setBackground(Color.BLUE);
		btn.setForeground(Color.WHITE);
		
		g.gridy=2;
		g.gridx=0;	
		g.insets =new Insets(20,20, 20, 20);
		contentPane.add(btn,g);
	}
}