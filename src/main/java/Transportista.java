public abstract class Transportista {
    protected String nombre;
    protected String color;
    protected Distancia medida;

    public Transportista(String nombre, String color, Distancia medida) {
        this.nombre = nombre;
        this.color = color;
        this.medida = medida;
    }

    public abstract double presupuestar(Punto origen, Punto destino, double peso);

}
