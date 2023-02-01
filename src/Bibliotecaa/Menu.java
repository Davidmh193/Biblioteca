package Bibliotecaa;

import javax.swing.JOptionPane;


public class Menu {
	
public static void menuPrincial(){
	

	
final int OPCION_UNO = 1;
final int OPCION_DOS = 2;
final int OPCION_TRES = 3;
final int SALIR = 0;
int opcion_menu;

do {
	opcion_menu = Integer.parseInt(JOptionPane.showInputDialog(null,
			"------MENU-------\n" + OPCION_UNO + ". Gestionar Libros\n" + OPCION_DOS + ". Gestionar socios\n" + OPCION_TRES
					+ ". Gestionar Prestamos\n" + SALIR + ". Salir\n" + "Elije una de las opciones"));
	//fin menú
	switch (opcion_menu) {
	case OPCION_UNO:
		
		Menu.mostrarMenuLibros();
		
		break;
	case OPCION_DOS:
		Menu.mostrarSocios();
		
		break;
	case OPCION_TRES:
		Menu.mostrarMenuPrestamos();
		
		break;
	case SALIR:
		JOptionPane.showMessageDialog(null, "Adios");
		break;
	default:
		JOptionPane.showMessageDialog(null, "Opcion incorrecta");
	}
} while (opcion_menu != SALIR);
}
public static void mostrarMenuLibros() {
	
final int OPCION_UNO = 1;
final int OPCION_DOS = 2;
final int OPCION_TRES = 3;
final int SALIR = 0;
int opcion_menu;

do {
	opcion_menu = Integer.parseInt(JOptionPane.showInputDialog(null,
			"------MENU-------\n" + OPCION_UNO + ". Insertar Libro\n" + OPCION_DOS + ". Eliminar Libro\n" + OPCION_TRES
					+ ". Ver libros\n" + SALIR + ". Salir De Mostrar Libros\n" + "Elije una de las opciones"));
	
	switch (opcion_menu) {
	
//Insertar Los libros
	case OPCION_UNO:
		FormularioDeDatos.insertarLibro(null);
		break;
		
//Elimina los libros
	case OPCION_DOS:
		
		GestorBBDD.eliminarLibro();
		break;
		
//Ver Libros
	case OPCION_TRES:
		
		break;
	
	case SALIR:
		JOptionPane.showMessageDialog(null, "Adios");
		break;
	default:
		JOptionPane.showMessageDialog(null, "Opcion incorrecta");
	}
} while (opcion_menu != SALIR);
}


public static void mostrarSocios() {
	
	JOptionPane.showInputDialog(null, "Elija la opcion \n 1.Ver Socios");
	
	}

public static void mostrarMenuPrestamos() {

	}




//Sirve para que funcione el programa
 public void run() {
	 menuPrincial();
}
}
 
 

