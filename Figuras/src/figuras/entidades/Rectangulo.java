
package figuras.entidades;

public class Rectangulo {
    private double alto;
    private double ancho;
    
    public Rectangulo() {
    }

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public void setLargo(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }
    
    public double calcularArea() {
    return alto * ancho;
    }

    public double calcularPerimetro() {
    return alto + ancho;
    }
}
