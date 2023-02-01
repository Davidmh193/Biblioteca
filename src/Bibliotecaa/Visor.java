package Bibliotecaa;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Visor {
	public static void mostrarLibros() {
		
		Iterator<String> libro = libro.iterator();
		while(libro.hasNext()){
			String elemento = libro.next();
			JOptionPane.showInputDialog(null, elemento+" estos son todos los libros que hay");
		
		}
		
	}
	
	//Muestra los libros
	public static void mostrarlibro(Libro libro) {
	
}
	
	public  void   mostrarMensaje(String mensaje) {
		
	}

}
