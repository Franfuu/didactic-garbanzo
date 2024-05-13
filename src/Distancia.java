public abstract class Distancia {
    public Distancia(double origenX, double origenY, double destinoX, double destinoY) {
    }

    public Distancia() {
    }

    public abstract double medir(Punto origen, Punto destino);

    public double medir(double x, double y, double x1, double y1) {
        return 0;
    }
}