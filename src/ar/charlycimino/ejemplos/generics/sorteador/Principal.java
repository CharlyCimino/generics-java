package ar.charlycimino.ejemplos.generics.sorteador;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Sorteador<Club> sorteo = new Sorteador<Club>();

        System.out.println("Sorteador recién creado");
        retardo(1);
        System.out.println("¿Sorteador vacío? " + sorteo.isEmpty());
        retardo(1);
        System.out.println("Comienza la inserción de elementos");
        retardo(1);
        sorteo.add(new Club("Boca Juniors", PaisSudamericano.ARGENTINA));
        sorteo.add(new Club("River Plate", PaisSudamericano.ARGENTINA));
        sorteo.add(new Club("Flamengo", PaisSudamericano.BRASIL));
        sorteo.add(new Club("Palmeiras", PaisSudamericano.BRASIL));
        sorteo.add(new Club("Atlético Mineiro", PaisSudamericano.BRASIL));
        sorteo.add(new Club("Athlético Paranaense", PaisSudamericano.BRASIL));
        sorteo.add(new Club("Nacional", PaisSudamericano.URUGUAY));
        sorteo.add(new Club("Peñarol", PaisSudamericano.URUGUAY));
        retardo(1);
        System.out.println("Fin de la inserción de elementos");
        retardo(1);
        System.out.println("¿Está vacío? " + sorteo.isEmpty());
        retardo(1);
        System.out.println("\n*** Comienza el sorteo... ***");
        retardo(1);
        while (!sorteo.isEmpty()) {
            System.out.println(sorteo.remove());
            retardo(1);
        }
        System.out.println("*** Fin del sorteo ***\n");
        retardo(1);
        System.out.println("¿Sorteador vacío? " + sorteo.isEmpty());
    }

    public static void retardo(int s) {
        try {
            Thread.sleep(s * 1000); // Pausa de s segundos
        } catch (InterruptedException ex) {
            System.out.println("Error de concurrencia: " + ex.getMessage());
        }
    }
}
