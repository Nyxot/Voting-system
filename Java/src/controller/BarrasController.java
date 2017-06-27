package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import org.jfree.data.category.DefaultCategoryDataset;
import model.Model;
import view.BarrasView;

public class BarrasController {
	private BarrasView bview = new BarrasView();
	private Model model = new Model();
	
	private DefaultCategoryDataset datos = new DefaultCategoryDataset();
	private Timer timer = new Timer(3000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			refresh();
		}
	});

	public BarrasController(BarrasView bview, Model model){
		this.bview = bview;
		this.model = model;
		
		timer.start();
		createGraf();
	}
	
	public void createGraf(){
		datos.addValue(model.getVotosPri(), "", "Pri");
		datos.addValue(model.getVotosPan(), "", "Pan");
		datos.addValue(model.getVotosPRD(), "", "PRD");
		datos.addValue(model.getVotosMorena(), "", "Morena");
		datos.addValue(model.getVotosNulo(), "", "Nulo");
		
		bview.setDatos(datos);
		bview.setGrafica();
	}
	
	public void refresh(){
		bview.invalidate();
		createGraf();
		bview.validate();
		bview.repaint();
	}
}
