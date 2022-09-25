package ar.charlycimino.ejemplos.generics.sorteador;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Sorteador<String> sorteo = new Sorteador<>();
        
        sorteo.add("UNO");
        sorteo.add("DOS");
        sorteo.add("TRES");
        
        while (!sorteo.isEmpty()) {
            System.out.println("El próximo sorteado es: " + sorteo.remove());
        }        
        
        System.out.println(sorteo.remove());
    }

    public static void retardo(int s) {
        try {
            Thread.sleep(s * 1000); // Pausa de s segundos
        } catch (InterruptedException ex) {
            System.out.println("Error de concurrencia: " + ex.getMessage());
        }
    }
}
