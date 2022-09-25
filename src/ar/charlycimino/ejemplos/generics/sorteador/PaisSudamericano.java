package ar.charlycimino.ejemplos.generics.sorteador;

public enum PaisSudamericano {
    ARGENTINA, BRASIL, URUGUAY, PARAGUAY, CHILE, BOLIVIA,
    ECUADOR, PERU, COLOMBIA, VENEZUELA, GUYANA, SURINAME;

    private PaisSudamericano() {
    } // Evita que se creen instancias de PaisSudamericano

    @Override
    public String toString() {
        // Retorna el nombre capitalizado. "ARGENTINA" --> "Argentina"
        return this.name().substring(0, 1).toUpperCase() + this.name().substring(1).toLowerCase();
    }
}
