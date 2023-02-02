package Bibliotecaa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Visor {
	private static final String HOST = "localhost";
	private static final String BBDD = "biblioteca";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	

	
	public static ArrayList<Libro> verLibros() throws SQLException{
		Conector c=new Conector();
		c.conectar();
		
		
			ArrayList<Libro> libros =new ArrayList<Libro>();
	for (int i = 0; i < libros.size(); i++) {
		JOptionPane.showMessageDialog(null, "Estos son los Libros que tenemos en nueestra base de datos \nId:"+ libros.get(i).getId()+ "\n Titulo:"+ libros.get(i).getTitulo() + "\nAutor: " + libros.get(i).getAutor() + "\nNumero de paginas: " + libros.get(i).getNum_pag() + "\n");
	
	}
	return libros;
	
	}

	public  void   mostrarMensaje(String mensaje) {
		
	}
	
	
	//Array List Libros
	private void visualizarLibros() {
		ArrayList<Libro> libros = selectDeLaBBDD();
		imprimirLibrosEnPantalla(libros);
	}

	public static void imprimirLibrosEnPantalla(ArrayList<Libro> libros) {
		for (Libro libro : libros) {
			System.out.println(libro);
		}
	}
	
	
	
	private ArrayList<Libro> selectDeLaBBDD() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);

			String sql = "SELECT * FROM libros";

			Statement statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			

			ArrayList<Libro> libros = new ArrayList<Libro>();
			Libro libro;
			while (resultSet.next()) {
				libro = new Libro();
				libro.setId(resultSet.getString("id"));
				libro.setTitulo(resultSet.getString("titulo"));
				libro.setAutor(resultSet.getString("autor"));
				libro.setNum_pag(resultSet.getInt("num_pag"));
				
				libros.add(libro);
			}
			
			return libros;

		} catch (ClassNotFoundException e) {
			System.out.println("Driver no cargado, falta el jar");
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			System.out.println("Fallo en la conexion");
			e.printStackTrace();
			return null;
		}
	}
	


}
