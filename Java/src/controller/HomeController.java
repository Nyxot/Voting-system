package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import view.BarrasView;
import view.GeneralView;
import view.PastelView;
import view.HomeView;
import controller.GeneralController;
import controller.BarrasController;
import controller.PastelController;
import model.Model;

public class HomeController implements ActionListener{
	private HomeView hview;
	private Model model;
	
	public HomeController(HomeView hview, Model model){
		this.hview = hview;
		this.model = model;
		
		this.hview.addNuloListener(this);
		this.hview.addPriListener(this);
		this.hview.addPanListener(this);
		this.hview.addPRDListener(this);
		this.hview.addMorenaListener(this);
		
		this.hview.addItemGeneralListener(actionGeneral);
		this.hview.addItemBarrasListener(actionBarras);
		this.hview.addItemPastelListener(actionPastel);
	}
	
	public void actionPerformed(ActionEvent e){
		String voto = "";
		try{
			voto = hview.getButton( (JButton) e.getSource());
			model.addVoto(voto);
			
			hview.Message(model.getMessage());
			
		}catch (Exception ex) {
			System.out.println(ex);
			hview.Message("Error");
		}
	}
	
	ActionListener actionGeneral = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			GeneralView gview = new GeneralView();
			GeneralController gcontrol = new GeneralController(gview, model);
			gview.setVisible(true);
		}
	};
	
	ActionListener actionBarras = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			BarrasView bview = new BarrasView();
			BarrasController bcontrol = new BarrasController(bview, model);
			bview.setVisible(true);
		}
	};
	
	ActionListener actionPastel = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			PastelView pview = new PastelView();
			PastelController pcontrol = new PastelController(pview, model);
			pview.setVisible(true);
		}
	};
}
