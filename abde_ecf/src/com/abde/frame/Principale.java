package com.abde.frame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Principale extends JFrame
{
	private static final long serialVersionUID = 1L;

////ATTRIBUTS DU MENU ACCESSIBLE DANS TOUTE LA CLASSE
	private JPanel contentPane;
	private JLabel lbl;
	private JButton btnOK;
	private JMenuBar mnuBar;
	private JMenu mnuCAS;
	private JMenuItem mnuDecouverte;
	private JMenuItem mnuTest;
	private JMenuItem mnuTestAbstract;
	private JMenuItem mnuAudit;
	private JMenuItem mnuFacto;

	public Principale(String Titre) 
	{

////////INITIALISATION DE LA FENETRE 
		super(Titre);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,400);
		this.setLocationRelativeTo(null); 
		this.setJMenuBar(createMenuBar());

		contentPane = (JPanel) this.getContentPane();
		contentPane.setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();
		
////////CREATION DU LABEL		
		lbl = new JLabel("ici le label");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		g.gridy=0;
		g.gridx=0;	
		g.insets =new Insets(20,20, 20, 20);
		contentPane.add(lbl,g);
		
////////CREATION DU BOUTON		
		btnOK = new JButton("OK");
		g.gridy=1;
		g.gridx=0;	
		g.insets =new Insets(20,20, 20, 20);
		contentPane.add(btnOK,g);
	}

	public JMenuBar createMenuBar()
	{

////////BARRE DE MENU
		mnuBar = new JMenuBar();

////////ELEMENT DU MENU
		mnuCAS = new JMenu("CAS");
		mnuBar.add(mnuCAS);

////////ITEMS DU MENU
		mnuDecouverte = new JMenuItem("Decouverte 2.2");
		mnuDecouverte.addActionListener(this::mnuDecouverteListener);
		mnuCAS.add(mnuDecouverte);

		mnuTest = new JMenuItem("Test 2.3");
		mnuTest.addActionListener(this::mnuTestListener);
		mnuCAS.add(mnuTest);

		mnuTestAbstract = new JMenuItem("Test Abstract 2.4");
		mnuTestAbstract.addActionListener(this::mnuTestAbstractListener);
		mnuCAS.add(mnuTestAbstract);

		mnuAudit = new JMenuItem("Auditeur 2.5");
		mnuAudit.addActionListener(this::mnuAuditListener);
		mnuCAS.add(mnuAudit);

		mnuFacto = new JMenuItem("Factorielle 2.6");
		mnuFacto.addActionListener(this::mnuFactoListener);
		mnuCAS.add(mnuFacto);

		return mnuBar;
	}

	////////ACTION DES ITEMS DU MENU

	public void mnuDecouverteListener(ActionEvent e)
	{
////////APPEL FENETRE		
		Decouverte decouv = new Decouverte("Decouverte 2.2");
		decouv.setVisible(true);
	}

	public void mnuTestListener(ActionEvent e)
	{
////////APPEL FENETRE
		Test test = new Test("Test 2.3");
		test.setVisible(true);
	}

	public void mnuTestAbstractListener(ActionEvent e)
	{
////////APPEL FENETRE
		TestAbstract taf = new TestAbstract("Test Abstract 2.4");
		taf.setVisible(true);
	}

	public void mnuAuditListener(ActionEvent e)
	{
////////APPEL FENETRE		
		Auditeur audit = new Auditeur("Audit 2.5");
		audit.setVisible(true);
	}

	public void mnuFactoListener(ActionEvent e)
	{
////////APPEL FENETRE		
		Factorielle facto = new Factorielle("Factorielle 2.6");
		facto.setVisible(true);
	}
}