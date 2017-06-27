package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GeneralView extends JFrame{
	private JLabel lblNulo = new JLabel("Votos Nulos: ");
	private JLabel lblvotosNulo = new JLabel("0");
	private JLabel lblPri = new JLabel("Votos Pri: ");
	private JLabel lblvotosPri = new JLabel("0");
	private JLabel lblPan = new JLabel("Votos Pan: ");
	private JLabel lblvotosPan = new JLabel("0");
	private JLabel lblPRD = new JLabel("Votos PRD: ");
	private JLabel lblvotosPRD = new JLabel("0");
	private JLabel lblMorena = new JLabel("Votos Morena: ");
	private JLabel lblvotosMorena = new JLabel("0");
	
	public GeneralView(){
		JPanel generalPanel = new JPanel(new GridLayout(5, 3));
		this.setSize(400,200);
		
		generalPanel.add(lblNulo);
		generalPanel.add(lblvotosNulo);
		generalPanel.add(lblPri);
		generalPanel.add(lblvotosPri);
		generalPanel.add(lblPan);
		generalPanel.add(lblvotosPan);
		generalPanel.add(lblPRD);
		generalPanel.add(lblvotosPRD);
		generalPanel.add(lblMorena);
		generalPanel.add(lblvotosMorena);
		
		this.add(generalPanel);
	}
	
	public void setlblvotosNulo(String votos){
		lblvotosNulo.setText(votos);
	}
	
	public void setlblvotosPri(String votos){
		lblvotosPri.setText(votos);
	}
	
	public void setlblvotosPan(String votos){
		lblvotosPan.setText(votos);
	}
	
	public void setlblvotosPRD(String votos){
		lblvotosPRD.setText(votos);
	}
	
	public void setlblvotosMorena(String votos){
		lblvotosMorena.setText(votos);
	}
}
