

// Clase TransportistaSeul que hereda de Transportista
public class TransportistaSeul extends Transportista {

    // Constructor
    public TransportistaSeul() {
        super("Seul", "naranja", new DistanciaEuclídea());
    }

    // Método para calcular el costo del envío, con un peso específico
    @Override
    public double presupuestar(Punto origen, Punto destino, double peso) {
        double distancia = medida.medir(origen.getX(), origen.getY(), destino.getX(), destino.getY());
        if (peso <= 5) {
            return distancia * 1.20;
        } else if (peso > 5 && peso < 10) {
            return distancia * 2.40;
        } else {
            throw new UnsupportedOperationException("El peso no está soportado");
        }
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        TransportistaSeul transportistaSeul = new TransportistaSeul();

        // Ejemplo de presupuestar con peso entre 0 y 5 Kg
        Punto origen1 = new Punto(599, 700);
        Punto destino1 = new Punto(10000, 2000);
        double costoEnvio1 = transportistaSeul.presupuestar(origen1, destino1, 3);
        System.out.println("Costo del envío 1: " + costoEnvio1);

        // Ejemplo de presupuestar con peso entre 5 y 10 Kg
        Punto origen2 = new Punto(0, 0);
        Punto destino2 = new Punto(3, 4);
        double costoEnvio2 = transportistaSeul.presupuestar(origen2, destino2, 8);
        System.out.println("Costo del envío 2: " + costoEnvio2);

        // Ejemplo de presupuestar con peso mayor o igual a 10 Kg
        Punto origen3 = new Punto(0, 0);
        Punto destino3 = new Punto(3, 4);
        try {
            double costoEnvio3 = transportistaSeul.presupuestar(origen3, destino3, 12);
            System.out.println("Costo del envío 3: " + costoEnvio3);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
