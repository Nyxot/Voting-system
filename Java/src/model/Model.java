package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Model {
	private String message = "";
	private Connection conexion = null;
	
	public Model(){
		try{
			String servidor = "jdbc:mysql://localhost/votos";
			String usuario = "root";
			String password = "";
			conexion = DriverManager.getConnection(servidor, usuario, password);
			
		}catch (Exception ex) {
			System.out.println("Error en la conexon: "+ex.getMessage());
			conexion = null;
		}
	}
	
	public void addVoto(String voto){
		if(voto == "Votar Nulo"){
			votoNulo();
		}else if(voto == "Votar Pri"){
			votoPri();
		}else if(voto == "Votar Pan"){
			votoPan();
		}else if(voto == "Votar PRD"){
			votoPRD();
		}else if(voto == "Votar Morena"){
			votoMorena();
		}
	}
	
	private void votoNulo(){
		try{
			Statement stm;
			stm = conexion.createStatement();
			String select = "SELECT votos FROM stats WHERE id=5";
			ResultSet resultado = stm.executeQuery(select);
			resultado.next();
			int votosActuales = resultado.getInt(1);
			votosActuales = votosActuales + 1;
			String update = "UPDATE stats SET votos="+votosActuales+" WHERE id=5";
			stm.execute(update);
			message = "Voto almacenado correctamente: \n NULO";
			
		}catch (SQLException ex) {
			System.out.println("Error: "+ex.getMessage());
		}
	}
	
	private void votoPri(){
		try{
			Statement stm;
			stm = conexion.createStatement();
			String select = "SELECT votos FROM stats WHERE id=1";
			ResultSet resultado = stm.executeQuery(select);
			resultado.next();
			int votosActuales = resultado.getInt(1);
			votosActuales = votosActuales + 1;
			String update = "UPDATE stats SET votos="+votosActuales+" WHERE id=1";
			stm.execute(update);
			message = "Voto almacenado correctamente: \n PRI";
			
		}catch (SQLException ex) {
			System.out.println("Error: "+ex.getMessage());
		}
	}
	
	private void votoPan(){
		try{
			Statement stm;
			stm = conexion.createStatement();
			String select = "SELECT votos FROM stats WHERE id=2";
			ResultSet resultado = stm.executeQuery(select);
			resultado.next();
			int votosActuales = resultado.getInt(1);
			votosActuales = votosActuales + 1;
			String update = "UPDATE stats SET votos="+votosActuales+" WHERE id=2";
			stm.execute(update);
			message = "Voto almacenado correctamente: \n PAN";
			
		}catch (SQLException ex) {
			System.out.println("Error: "+ex.getMessage());
		}
	}
	
	private void votoPRD(){
		try{
			Statement stm;
			stm = conexion.createStatement();
			String select = "SELECT votos FROM stats WHERE id=4";
			ResultSet resultado = stm.executeQuery(select);
			resultado.next();
			int votosActuales = resultado.getInt(1);
			votosActuales = votosActuales + 1;
			String update = "UPDATE stats SET votos="+votosActuales+" WHERE id=4";
			stm.execute(update);
			message = "Voto almacenado correctamente: \n PRD";
			
		}catch (SQLException ex) {
			System.out.println("Error: "+ex.getMessage());
		}
	}
	
	private void votoMorena(){
		try{
			Statement stm;
			stm = conexion.createStatement();
			String select = "SELECT votos FROM stats WHERE id=3";
			ResultSet resultado = stm.executeQuery(select);
			resultado.next();
			int votosActuales = resultado.getInt(1);
			votosActuales = votosActuales + 1;
			String update = "UPDATE stats SET votos="+votosActuales+" WHERE id=3";
			stm.execute(update);
			message = "Voto almacenado correctamente: \n MORENA";
			
		}catch (SQLException ex) {
			System.out.println("Error: "+ex.getMessage());
		}
	}
	
	public int getVotosNulo(){
		try{
			Statement stm;
			stm = conexion.createStatement();
			String select = "SELECT votos FROM stats WHERE id=5";
			ResultSet resultado = stm.executeQuery(select);
			resultado.next();
			int votosActuales = resultado.getInt(1);
			return votosActuales;
			
		}catch (SQLException ex) {
			System.out.println("Error: "+ex.getMessage());
		}
		return 0;
	}
	
	public int getVotosPri(){
		try{
			Statement stm;
			stm = conexion.createStatement();
			String select = "SELECT votos FROM stats WHERE id=1";
			ResultSet resultado = stm.executeQuery(select);
			resultado.next();
			int votosActuales = resultado.getInt(1);
			return votosActuales;
			
		}catch (SQLException ex) {
			System.out.println("Error: "+ex.getMessage());
		}
		return 0;
	}
	
	public int getVotosPan(){
		try{
			Statement stm;
			stm = conexion.createStatement();
			String select = "SELECT votos FROM stats WHERE id=2";
			ResultSet resultado = stm.executeQuery(select);
			resultado.next();
			int votosActuales = resultado.getInt(1);
			return votosActuales;
			
		}catch (SQLException ex) {
			System.out.println("Error: "+ex.getMessage());
		}
		return 0;
	}
	
	public int getVotosPRD(){
		try{
			Statement stm;
			stm = conexion.createStatement();
			String select = "SELECT votos FROM stats WHERE id=4";
			ResultSet resultado = stm.executeQuery(select);
			resultado.next();
			int votosActuales = resultado.getInt(1);
			return votosActuales;
			
		}catch (SQLException ex) {
			System.out.println("Error: "+ex.getMessage());
		}
		return 0;
	}
	
	public int getVotosMorena(){
		try{
			Statement stm;
			stm = conexion.createStatement();
			String select = "SELECT votos FROM stats WHERE id=3";
			ResultSet resultado = stm.executeQuery(select);
			resultado.next();
			int votosActuales = resultado.getInt(1);
			return votosActuales;
			
		}catch (SQLException ex) {
			System.out.println("Error: "+ex.getMessage());
		}
		return 0;
	}
	
	public String getMessage(){
		return message;
	}
}
