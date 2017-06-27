package main;

import view.PastelView;
import view.BarrasView;
import view.GeneralView;
import view.HomeView;
import model.Model;
import controller.BarrasController;
import controller.GeneralController;
import controller.HomeController;
import controller.PastelController;

public class Main{
	
	public static void main(String[] args){
		Model model = new Model();
		HomeView hview = new HomeView();
		GeneralView gview = new GeneralView();
		BarrasView bview = new BarrasView();
		PastelView pview = new PastelView();
		HomeController hcontrol = new HomeController(hview, model);
		GeneralController gcontrol = new GeneralController(gview, model);
		BarrasController bcontrol = new BarrasController(bview, model);
		PastelController pcontrol = new PastelController(pview, model);
	}
}
