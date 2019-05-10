package com.abde.frame;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Auditeur extends JFrame 
{
	private static final long serialVersionUID = 1L;
	
////ATTRIBUTS DU MENU ACCESSIBLE DANS TOUTE LA CLASSE
	private JPanel contentPane;
	private JButton btnAdd;
	private JButton btnRes;
	private JPanel pan1;
	private JPanel pan2;
	private static int i=0;
	
	public Auditeur(String Titre)
	{
////////INITIALISATION DE LA FENETRE
		super(Titre);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null); 
		
		contentPane = (JPanel) this.getContentPane();
		
////////CREATION DE 2 PANEL ET LEUR GRILLE DE POSITION
		pan1 = new JPanel();
		pan2 = new JPanel();
		pan1.setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();
		
////////CREATION ET POSITIONNEMENT DU BOUTON ADD 
		btnAdd =new JButton("Add");
		g.gridy=0;
		g.gridx=0;	
		g.insets =new Insets(10, 10, 10, 10);
		pan1.add(btnAdd,g);

////////CREATION ET POSITIONNEMENT DU BOUTON RESET
		btnRes= new JButton("Reset");
		g.gridy=0;
		g.gridx=1;	
		g.insets =new Insets(10, 10, 10, 10);
		pan1.add(btnRes,g);
		
////////ACTION DU BOUTON ADD
		btnAdd.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JButton btn = new JButton(""+i);
				i++;
				pan2.add(btn);
				pan2.validate();
				pan2.repaint();
				
				btn.addActionListener(new ActionListener() 
				{	
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						btn.getParent().remove(btn);
						pan2.validate();
						pan2.repaint();
					}
				});
			}
		});
		
////////ACTION DU BOUTON RESET
		btnRes.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				pan2.removeAll();
				pan2.validate();
				pan2.repaint();
				i=0;
			}
		});
		
////////AJOUT DES 2 PANELS DE LE CONTENTPANE
		contentPane.add(pan1,BorderLayout.NORTH);
		contentPane.add(pan2,BorderLayout.CENTER);	
	}
}