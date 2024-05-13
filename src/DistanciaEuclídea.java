public class DistanciaEuclídea extends Distancia {
    public DistanciaEuclídea() {
    }

    // Constructor
    public DistanciaEuclídea(double origen_x, double origen_y, double destino_x, double destino_y) {
        super(origen_x, origen_y, destino_x, destino_y);
    }

    // Implementación del método para calcular la distancia euclidiana

    double calcularDistancia(double origen_x, double origen_y, double destino_x, double destino_y) {
        return Math.sqrt(Math.pow((destino_x - origen_x), 2) + Math.pow((destino_y - origen_y), 2));
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        double origen_x = 0;
        double origen_y = 0;
        double destino_x = 3;
        double destino_y = 4;

        DistanciaEuclídea distanciaEuclidiana = new DistanciaEuclídea(origen_x, origen_y, destino_x, destino_y);
        double distancia = distanciaEuclidiana.calcularDistancia(origen_x, origen_y, destino_x, destino_y);
        System.out.println("La distancia euclidiana entre los puntos es: " + distancia);
    }

    @Override
    public double medir(Punto origen, Punto destino) {
        return 0;
    }
}