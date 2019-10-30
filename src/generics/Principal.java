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
        retardo();
        System.out.println("¿Sorteador vacío? " + sorteo.estaVacio());
        retardo();
        System.out.println("Comienza la inserción de elementos");
        retardo();
        sorteo.insertar(new Club("Boca Juniors", PaisSudamericano.ARGENTINA));
        sorteo.insertar(new Club("River Plate", PaisSudamericano.ARGENTINA));
        sorteo.insertar(new Club("Santos", PaisSudamericano.BRASIL));
        sorteo.insertar(new Club("Colo Colo", PaisSudamericano.CHILE));
        sorteo.insertar(new Club("Peñarol", PaisSudamericano.URUGUAY));
        sorteo.insertar(new Club("Cerro Porteño", PaisSudamericano.PARAGUAY));
        sorteo.insertar(new Club("Deportivo Cali", PaisSudamericano.COLOMBIA));
        sorteo.insertar(new Club("Emelec", PaisSudamericano.ECUADOR));
        retardo();
        System.out.println("Fin de la inserción de elementos");
        retardo();
        System.out.println("¿Está vacío? " + sorteo.estaVacio());
        retardo();
        System.out.println("\n*** Comienza el sorteo... ***");
        retardo();
        while (!sorteo.estaVacio()) {
            System.out.println(sorteo.proximoSorteado());
            retardo();
        }
        System.out.println("*** Fin del sorteo ***\n");
        retardo();
        System.out.println("¿Sorteador vacío? " + sorteo.estaVacio());
    }

    public static void retardo() {
        try {
            Thread.sleep(1000L); // Pausa el hilo 1 segundo
        } catch (InterruptedException ex) {
            System.out.println("Error de concurrencia: " + ex.getMessage());
        }
    }
}
