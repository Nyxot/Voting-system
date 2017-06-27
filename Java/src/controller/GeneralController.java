package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import view.GeneralView;
import model.Model;

public class GeneralController {
	private GeneralView gview = new GeneralView();
	private Model model = new Model();
	
	private Timer timer = new Timer(3000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			refresh();
		}
	});
	
	public GeneralController(GeneralView gview, Model model){
		this.gview = gview;
		this.model = model;
		
		timer.start();
		getVotos();
	}
	
	public void getVotos(){
		gview.setlblvotosNulo((String.valueOf(model.getVotosNulo())));
		gview.setlblvotosPri(String.valueOf(model.getVotosPri()));
		gview.setlblvotosPan(String.valueOf(model.getVotosPan()));
		gview.setlblvotosPRD(String.valueOf(model.getVotosPRD()));
		gview.setlblvotosMorena(String.valueOf(model.getVotosMorena()));
	}
	
	public void refresh(){
		gview.invalidate();
		getVotos();
		gview.validate();
		gview.repaint();
	}
}
