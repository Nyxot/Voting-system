package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import org.jfree.data.general.DefaultPieDataset;

import model.Model;
import view.PastelView;

public class PastelController {
	private PastelView pview = new PastelView();
	private Model model = new Model();
	
	private DefaultPieDataset datos = new DefaultPieDataset();
	private Timer timer = new Timer(3000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			refresh();
		}
	});
	
	public PastelController(PastelView pview, Model model){
		this.pview = pview;
		this.model = model;
		
		timer.start();
		createGraf();
	}
	
	public void createGraf(){
		datos.setValue("Pri",new Double(model.getVotosPri()));
		datos.setValue("Pan", new Double(model.getVotosPan()));
		datos.setValue("PRD", new Double(model.getVotosPRD()));
		datos.setValue("Morena", new Double(model.getVotosMorena()));
		datos.setValue("Nulo", new Double(model.getVotosNulo()));
		
		pview.setDatos(datos);
		pview.setGrafica();
	}
	
	public void refresh(){
		pview.invalidate();
		createGraf();
		pview.validate();
		pview.repaint();
	}
}
