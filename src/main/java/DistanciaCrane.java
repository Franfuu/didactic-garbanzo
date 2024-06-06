public class DistanciaCrane extends Distancia {
    public DistanciaCrane() {
        super();
    }

    @Override
    public double medir(Punto origen, Punto destino) {
        int distancia_x = Math.abs(destino.getX() - origen.getX());
        int distancia_y = Math.abs(destino.getY() - origen.getY());
        return Math.max(distancia_x, distancia_y);
    }
}