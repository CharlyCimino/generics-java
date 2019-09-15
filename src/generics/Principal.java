package generics;

/**
 * Prueba de la colección <code>Sorteador</code>
 *
 * @author Carlos E. Cimino
 * @see <a href="http://www.github.com/caemci"/>http://www.github.com/caemci</a>
 */
public class Principal {

    public static void main(String[] args) {
        // Puede sortear cualquier tipo de dato
        Sorteador<Club> sorteo = new Sorteador<Club>();

        System.out.println("Sorteador recién creado");
        System.out.println("¿Sorteador vacío? " + sorteo.estaVacio());

        System.out.println("Comienza la inserción de elementos");

        sorteo.insertar(new Club("Boca Juniors", PaisSudamericano.ARGENTINA));
        sorteo.insertar(new Club("River Plate", PaisSudamericano.ARGENTINA));
        sorteo.insertar(new Club("Santos", PaisSudamericano.BRASIL));
        sorteo.insertar(new Club("Colo Colo", PaisSudamericano.CHILE));
        sorteo.insertar(new Club("Peñarol", PaisSudamericano.URUGUAY));
        sorteo.insertar(new Club("Cerro Porteño", PaisSudamericano.PARAGUAY));
        sorteo.insertar(new Club("Deportivo Cali", PaisSudamericano.COLOMBIA));
        sorteo.insertar(new Club("Emelec", PaisSudamericano.ECUADOR));

        System.out.println("Fin de la inserción de elementos");
        System.out.println("¿Está vacío? " + sorteo.estaVacio());

        System.out.println("\n*** Comienza el sorteo... ***");
        while (!sorteo.estaVacio()) {
            System.out.println(sorteo.proximoSorteado());
        }
        System.out.println("*** Fin del sorteo ***\n");

        System.out.println("¿Sorteador vacío? " + sorteo.estaVacio());
    }
}
