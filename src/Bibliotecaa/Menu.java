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
		GestorBBDD.insertarLibro(null);
		break;
		
//Elimina los libros
	case OPCION_DOS:
		GestorBBDD.eliminarLibro();
		break;
		
//Get Libros
	case OPCION_TRES:
		GestorBBDD.getLibro();
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
	JOptionPane.showInputDialog(null, "Elija la opcion \n 1.Realizar prestamo");
	}


/*
 do {
	 
	 echo=JOptionPane.showInputDialog(null, "Elije Una opcion \n 1. Gestionar Libros \n 2.Gestionar socios \n 3.Gestionar Prestamos");	
	 
	 switch (echo){
	 
	 case "1":
		 
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
					break;
			}
		}
			}while (OpcionesMenu != "4");
		
		
		
	 case "2":
		public static void mostrarSocios() {
		
		JOptionPane.showInputDialog(null, "Elija la opcion \n 1.Ver Socios");
		
		}
		
	 case "3":
		public static void mostrarMenuPrestamos() {
		JOptionPane.showInputDialog(null, "Elija la opcion \n 1.Realizar prestamo");
		}
		
	 case"4";
	 JOptionPane.showMessageDialog(null, "Saliendo....");
	 

	 }	
}while (echo != "4");	 
}*/
 public void run() {
	 menuPrincial();
}
}
 
 

