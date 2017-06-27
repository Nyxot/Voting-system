package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarrasView extends JFrame{
	private JFreeChart barras;
	private DefaultCategoryDataset datos;

	public BarrasView(){
		/*JPanel barrasPanel = new JPanel();
		this.setSize(800,600);
		
		barras = ChartFactory.createBarChart("Votos", "Partidos", "Totales", datos);
		ChartPanel chartPanel = new ChartPanel(barras);
		barrasPanel.add(chartPanel);
		
		this.add(barrasPanel); */
	}
	
	public void setDatos(DefaultCategoryDataset datos){
		this.datos = datos;
	}
	
	public void setGrafica(){
		JPanel barrasPanel = new JPanel();
		this.setSize(700,500);
		
		barras = ChartFactory.createBarChart("Votos", "Partidos", "Totales", datos);
		ChartPanel chartPanel = new ChartPanel(barras);
		barrasPanel.add(chartPanel);
		
		this.add(barrasPanel);
	}
}
