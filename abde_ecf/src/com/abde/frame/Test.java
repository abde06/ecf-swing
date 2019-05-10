package com.abde.frame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame
{
	private static final long serialVersionUID = 1L;

////ATTRIBUTS DU MENU ACCESSIBLE DANS TOUTE LA CLASSE	
	private JPanel contentPane;
	private JButton btnTest;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	
	public Test(String Titre)
	{
////////INITIALISATION DE LA FENETRE
		super(Titre);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null); 
		
////////MISE EN PLACE DE LA GRILLE DE POSTION DANS LE PANEL
		contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();
		
////////CREATION-ACTION-POSITION DES BOUTONS
		btnTest = new JButton("Test");
		btnTest.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
			System.out.println("Test clic");	
			}
		});
		
		g.gridy=0;
		g.gridx=1;	
		g.insets =new Insets(10, 10, 10, 10);
		contentPane.add(btnTest,g);

////////CREATION-ACTION-POSITION DES BOUTONS		
		btn1 = new JButton("UN");
		btn1.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setTitle("*UN*");	
			}
		});
		
		g.gridy=1;
		g.gridx=0;
		g.insets =new Insets(10, 10, 10, 10);
		contentPane.add(btn1,g);

////////CREATION-ACTION-POSITION DES BOUTONS		
		btn2 = new JButton("DEUX");
		btn2.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setTitle("*DEUX*");	
			}
		});
		g.gridy=1;
		g.gridx=1;
		g.insets =new Insets(10, 10, 10, 10);
		contentPane.add(btn2,g);
		
////////CREATION-ACTION-POSITION DES BOUTONS		
		btn3 = new JButton("TROIS");		
		btn3.addActionListener(new ActionListener() 
		{	
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				setTitle("*TROIS*");
			}
		});
		g.gridy=1;
		g.gridx=2;
		g.insets =new Insets(10, 10, 10, 10);
		contentPane.add(btn3,g);
	}
}