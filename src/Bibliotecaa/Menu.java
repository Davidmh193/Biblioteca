package Bibliotecaa;

import java.io.FileNotFoundException;
import java.sql.SQLException;



public class Menu {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {
		GestorBiblioteca gf = new GestorBiblioteca();
		gf.run();
	}
}

