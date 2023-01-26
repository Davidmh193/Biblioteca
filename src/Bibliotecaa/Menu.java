package Bibliotecaa;

import javax.swing.JOptionPane;



public class Menu {

	
	public static void menuPrincial(){
	JOptionPane.showInputDialog(null, "Elije Una opcion \n 1. Gestionar Libros \n 2.Gestionar socios \n 3.Gestionar Prestamos");	

	}
	public static void mostrarMenuLibros() {
		JOptionPane.showInputDialog(null, "Que deseas hacer \n 1.Insertar libro \n 2.Elimiar Libro \n 3. Ver libros");
	}
	public static void mostrarSocios() {
		JOptionPane.showInputDialog(null, "Elija la opcion \n 1.Ver Socios");
	}
	public static void mostrarMenuPrestamos() {
		JOptionPane.showInputDialog(null, "Elija la opcion \n 1.Realizar prestamo");
	}
}
