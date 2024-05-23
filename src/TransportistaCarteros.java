public class TransportistaCarteros extends Transportista {
    public TransportistaCarteros() {
        super("Carteros", "amarillo", new DistanciaCrane());
    }

    @Override
    public double presupuestar(Punto origen, Punto destino, double peso) {
        double distancia = medida.medir(origen, destino);
        double costoEnvio;

        if (distancia > peso) {
            costoEnvio = distancia * 3;
        }else{
            costoEnvio = peso * 2;
        }if (costoEnvio <= 25) {
            throw new RuntimeException("El servicio de envío debe tener un coste mínimo de 25 €.");
        }
        return costoEnvio;
    }
}