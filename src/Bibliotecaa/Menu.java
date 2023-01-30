package Bibliotecaa;

import javax.swing.JOptionPane;



public class Menu {

	
	public static void menuPrincial(){
	JOptionPane.showInputDialog(null, "Elije Una opcion \n 1. Gestionar Libros \n 2.Gestionar socios \n 3.Gestionar Prestamos");	

	}
	public static void mostrarMenuLibros() {
		
		String OpcionesMenu;

		do {
			OpcionesMenu = JOptionPane.showInputDialog(null,
					" Introduzca el numero de la izquierda del menu a seleccionar: \n 1.Insertar Libro  \n 2.Eliminar Libro  \n 3. Ver libros \n 4. Salir");

			switch (OpcionesMenu) {

			case "1":
				JOptionPane.showMessageDialog(null, "Has elegido Insertar un Libro");
				
				break;

			case "2":
				JOptionPane.showMessageDialog(null, "Has elegido Eliminar id libro");
				GestorBBDD hh = new GestorBBDD();
				hh.eliminarLibro();
				
				break;

			case "3":
				JOptionPane.showMessageDialog(null, "Has elegido Ver los libros");
				
				
				break;

			case "4":
				JOptionPane.showMessageDialog(null, "Saliendo...");

				System.exit(0);

			default:
				JOptionPane.showMessageDialog(null, "Error, Vuelve a seleccionar\\n");
				System.exit(0);
			}
		} while (OpcionesMenu != "4");
		
	}
	public static void mostrarSocios() {
		JOptionPane.showInputDialog(null, "Elija la opcion \n 1.Ver Socios");
	}
	public static void mostrarMenuPrestamos() {
		JOptionPane.showInputDialog(null, "Elija la opcion \n 1.Realizar prestamo");
	}
	
	
	
	
	
	
	
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
