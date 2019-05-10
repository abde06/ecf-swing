package com.abde.frame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.DefaultFormatter;

public class Factorielle extends JFrame
{
	private static final long serialVersionUID = 1L;

////ATTRIBUTS DU MENU ACCESSIBLE DANS TOUTE LA CLASSE
	private JPanel contentPane;
	private JLabel lbl;
	private JTextField txt;
	private JLabel lbl2;
	private JButton btnFacto;
	
	public Factorielle(String Titre)
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
		
////////CREATION D'UN LABEL
		lbl= new JLabel("Entrez votre chiffre >>>>");
		g.gridy=0;
		g.gridx=0;	
		g.insets =new Insets(10, 10, 10, 10);
		contentPane.add(lbl,g);
		
////////CREATION D'UN CHAMP TEXTE
		txt = new JTextField();
		txt.setColumns(10);
		g.gridy=0;
		g.gridx=1;	
		g.insets =new Insets(10, 10, 10, 10);
		contentPane.add(txt,g);

////////CREATION D'UN BOUTON
		btnFacto= new JButton("Calcul Factorielle");
		btnFacto.addActionListener(this::btnFactoListener);
		g.gridy=1;
		g.gridx=0;	
		g.insets =new Insets(10, 10, 10, 10);
		contentPane.add(btnFacto,g);

////////CREATION D'UN LABEL
		lbl2= new JLabel("Resultat");
		g.gridy=1;
		g.gridx=1;	
		g.insets =new Insets(10, 10, 10, 10);
		contentPane.add(lbl2,g);
	}
	
////METHODE ET ACTION DU CALCUL DE LA FACTORIELLE
	public void btnFactoListener(ActionEvent e)
	{
		try
		{
////////////TRAITEMENT DE LA SAISIE D'aUTRE CARACTERE QUE LES CHIFFRES			
			NumberFormat nf = NumberFormat.getNumberInstance();
			nf.setParseIntegerOnly(true);
			JFormattedTextField jf = new JFormattedTextField(nf);
			((DefaultFormatter)jf.getFormatter()).setAllowsInvalid(false);
		
////////////ALGORITHME DE LA FACTORIELLE		
			int i = Integer.parseInt(txt.getText());
			int resultat=1;
			int cpt=i;
		
			if(i<17)
			{
				while(cpt>1)
				{
					resultat=resultat*cpt;
					cpt=cpt-1;
				}
				btnFacto.setText("La factorielle de "+txt.getText()+" est >>>> ");
				lbl2.setText(""+resultat+"");
			}
			else
////////////MESSAGE D'ERREUR SI LE CHIFFRE EST >17				
			{
				JOptionPane.showMessageDialog(null, "veuillez saisir un CHIFFRE entre 0 et 16", "ERROR CHIFFRE", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		catch (Exception e1)
////////////MESSAGE D'ERREUR SI LA SAISE EST UN AUTRE CARACTERE QU4UN CHIFFRE		
		{
			JOptionPane.showMessageDialog(null, "veuillez saisir un CHIFFRE ", "ERROR CARACTERE", JOptionPane.ERROR_MESSAGE);
		}
		
	}
}