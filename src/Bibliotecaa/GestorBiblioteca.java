package Bibliotecaa;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class GestorBiblioteca {
	private static final String HOST = "localhost";
	private static final String BBDD = "biblioteca";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	public void run() throws FileNotFoundException, SQLException, ClassNotFoundException{
    
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
		
		final int OPCION_UNO = 1;
		final int OPCION_DOS = 2;
		final int OPCION_TRES = 3;
		final int SALIR = 0;
		int opcion_menu;
		do {
			opcion_menu = Integer.parseInt(JOptionPane.showInputDialog(null,
					"------MENU-------\n" + OPCION_UNO + ". Gestionar Libros\n" + OPCION_DOS + ".  Gestionar socios\n"
							+ OPCION_TRES + ". Gestionar Prestamos\n" + SALIR + ". Salir\n" + "Elije una de las opciones"));
			//fin menú
			switch (opcion_menu) {
			case OPCION_UNO:
				JOptionPane.showMessageDialog(null, "primera opcion seleccionada");
				break;
			case OPCION_DOS:
				JOptionPane.showMessageDialog(null, "segunda opcion seleccionada");
				break;
			case OPCION_TRES:
				JOptionPane.showMessageDialog(null, "tercera opcion seleccionada");
				break;
			case SALIR:
				JOptionPane.showMessageDialog(null, "Adios");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			}
		} while (opcion_menu != SALIR);	
		
}
}
