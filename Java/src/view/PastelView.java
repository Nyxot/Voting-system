package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class PastelView extends JFrame{
	private JFreeChart pastel;
	private DefaultPieDataset datos;
	
	public PastelView(){
//		JPanel pastelPanel = new JPanel();
//		this.setSize(800,600);
//		
//		this.add(pastelPanel);
	}
	
	public void setDatos(DefaultPieDataset datos){
		this.datos = datos;
	}
	
	public void setGrafica(){
		JPanel barrasPanel = new JPanel();
		this.setSize(700,500);
		
		pastel = ChartFactory.createPieChart("Votos", datos, true, true, false);
		ChartPanel chartPanel = new ChartPanel(pastel);
		barrasPanel.add(chartPanel);
		
		this.add(barrasPanel);
	}
}
