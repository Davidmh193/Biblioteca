package Bibliotecaa;

import java.io.FileNotFoundException;
import java.sql.SQLException;


public class GestorBiblioteca {
	

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {
		GestorBBDD gf = new GestorBBDD();
		gf.run();
	}
}

