package Bibliotecaa;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class GestorPrestamos {
	
	public static void MenuPrestamos(){
	final int REALIZAR_PRESTAMO = 1;
	final int OPCION_DOS = 2;
	final int SALIR = 0;
	int opcion_menu;
	
	do {
		opcion_menu = Integer.parseInt(JOptionPane.showInputDialog(null,
				"------MENU-------\n" + REALIZAR_PRESTAMO + ". primera opcion\n" + OPCION_DOS + ". segunda opcion\n"
					 + SALIR + ". Salir\n" + "Elije una de las opciones"));
		//fin menú
		switch (opcion_menu) {
		case REALIZAR_PRESTAMO:
			Prestamo prestamo = FormularioDeDatos.
			gestorBBDD.conectar();
			gestorBBDD.insertPrestamo(prestamo);
			gestorBBDD.cerrar();

			System.out.println("prestamo realizado correctamente");
			
			JOptionPane.showMessageDialog(null, "Prestamo realizado");
			break;
		case OPCION_DOS:
			JOptionPane.showMessageDialog(null, "Opcion incorrecta");
			int idLibro = FormulariosDeDatos.getIdLibro(scan);
			gestorBBDD.conectar();
			gestorBBDD.devolverLibro(idLibro);
			gestorBBDD.cerrar();
			break;
		
		case SALIR:
			JOptionPane.showMessageDialog(null, "Saliendo de Prestamos");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opcion incorrecta, Vuelve a introducir");
		}
	} while (opcion_menu != SALIR);

	}
}
