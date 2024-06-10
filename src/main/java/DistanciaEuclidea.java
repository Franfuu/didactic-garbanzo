/**
 * La clase DistanciaEuclidea calcula la distancia entre origen y destino
 * @author Santiago Garcia Ruiz
 */
class DistanciaEuclidea extends Distancia {
    public DistanciaEuclidea() {
    }
    /**
     * El metodo DistanciaEuclidea
     * @param origen_x Punto x de origen
     * @param origen_y Punto y de origen
     * @param destino_x Punto x de destino
     * @param destino_y Punto y de destino
     */

    public DistanciaEuclidea(double origen_x, double origen_y, double destino_x, double destino_y) {
        super(origen_x, origen_y, destino_x, destino_y);
    }

    /**
     * El metodo calcularDistancia
     * @param origen_x Punto x de origen
     * @param origen_y Punto y de origen
     * @param destino_x Punto x de destino
     * @param destino_y Punto y de destino
     * @return La distancia euclidiana entre el punto de origen y el punto de destino.
     */
    double calcularDistancia(double origen_x, double origen_y, double destino_x, double destino_y) {
        return Math.sqrt(Math.pow((destino_x - origen_x), 2) + Math.pow((destino_y - origen_y), 2));
    }
    
    public static void main(String[] args) {
        double origen_x = 0;
        double origen_y = 0;
        double destino_x = 3;
        double destino_y = 4;

        DistanciaEuclidea distanciaEuclidiana = new DistanciaEuclidea(origen_x, origen_y, destino_x, destino_y);
        double distancia = distanciaEuclidiana.calcularDistancia(origen_x, origen_y, destino_x, destino_y);
        System.out.println("La distancia euclidiana entre los puntos es: " + distancia);
    }

    /**
     *  El metodo medir mide entre origen y destino
     * @param origen Punto origen
     * @param destino Punto destino
     * @returnm El punto de origen y el punto de destino
     */
    @Override
    public double medir(Punto origen, Punto destino) {
        return 0;
    }
}