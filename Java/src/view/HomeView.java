package view;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HomeView extends JFrame{
	private JLabel lblNulo = new JLabel("Nulo");
	private JLabel lblPri = new JLabel("Pri");
	private JLabel lblPan = new JLabel("Pan");
	private JLabel lblPRD = new JLabel("PRD");
	private JLabel lblMorena = new JLabel("Morena");
	
	private JButton btnNulo = new JButton("Votar Nulo");
	private JButton btnPri = new JButton("Votar Pri");
	private JButton btnPan = new JButton("Votar Pan");
	private JButton btnPRD = new JButton("Votar PRD");
	private JButton btnMorena = new JButton("Votar Morena");
	
	private JMenuBar barraMenu;
	private JMenu menuVotos;
	private JMenuItem itmGeneral, itmBarras, itmPastel;
	
	public HomeView(){
		JPanel homePanel = new JPanel();
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setSize(800, 200);
    	
    	this.barraMenu = new JMenuBar();
    	this.menuVotos = new JMenu("Conteo");
    	this.itmGeneral = new JMenuItem("General");
    	this.itmBarras = new JMenuItem("Grafica Barras");
    	this.itmPastel = new JMenuItem("Grafica Pastel");
    	this.barraMenu.add(menuVotos);
    	this.menuVotos.add(itmGeneral);
    	this.menuVotos.add(itmBarras);
    	this.menuVotos.add(itmPastel);
    	this.setJMenuBar(this.barraMenu);
    	
    	homePanel.add(lblNulo);
    	homePanel.add(btnNulo);
    	homePanel.add(lblPri);
    	homePanel.add(btnPri);
    	homePanel.add(lblPan);
    	homePanel.add(btnPan);
    	homePanel.add(lblPRD);
    	homePanel.add(btnPRD);
    	homePanel.add(lblMorena);
    	homePanel.add(btnMorena);
    	
    	this.add(homePanel);
    	setVisible(true);
	}
	
	public void addNuloListener(ActionListener listenForNulo){
        btnNulo.addActionListener(listenForNulo);
    }
	
	public void addPriListener(ActionListener listenForPri){
		btnPri.addActionListener(listenForPri);
	}
	
	public void addPanListener(ActionListener listenForPan){
		btnPan.addActionListener(listenForPan);
	}
	
	public void addPRDListener(ActionListener listenForPRD){
		btnPRD.addActionListener(listenForPRD);
	}
	
	public void addMorenaListener(ActionListener listenForMorena){
		btnMorena.addActionListener(listenForMorena);
	}
	
	public void addItemGeneralListener(ActionListener listenForGeneral){
		itmGeneral.addActionListener(listenForGeneral);
	}
	
	public void addItemBarrasListener(ActionListener listenForBarras){
		itmBarras.addActionListener(listenForBarras);
	}
	
	public void addItemPastelListener(ActionListener listenForPastel){
		itmPastel.addActionListener(listenForPastel);
	}

    public void Message(String message){
        JOptionPane.showMessageDialog(this, message);
    }
    
    public String getButton(JButton btn){
    	return btn.getText();
    }
}
