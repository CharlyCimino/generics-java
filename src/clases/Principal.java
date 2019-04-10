package clases;

/**
 * Prueba de la colección <code>Sorteador</code>
 * @author Carlos E. Cimino
 * @see <a href="http://www.github.com/caemci"/>http://www.github.com/caemci</a>
 */

public class Principal {

	public static void main(String[] args) {
		int cantPaises = 5;
		Sorteador<String> miSorteador = new Sorteador<String>(cantPaises);
		
		System.out.println("Sorteador reci�n creado");
		System.out.println("�Est� vac�o? " + miSorteador.estaVacio());
		
		System.out.println("Comienza la inserci�n de elementos");
		miSorteador.insertar("Argentina");
		miSorteador.insertar("Brasil");
		miSorteador.insertar("Per�");
		miSorteador.insertar("Bolivia");
		miSorteador.insertar("Argentina"); // Ya existe
		miSorteador.insertar("Venezuela");
		miSorteador.insertar("Colombia"); // Ya est� lleno
		System.out.println("Fin de la inserci�n de elementos");
		
		System.out.println("Comienza la muestra de elementos");
		while (!miSorteador.estaVacio()) {
			System.out.println( miSorteador.obtener() );
		}
		System.out.println("Termina la muestra de elementos");
		System.out.println("�Est� vac�o? " + miSorteador.estaVacio());
	}
}
