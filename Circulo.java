/**
 *
 * @author Víctor Davó Antón
 */

public class Circulo implements Figura{
    private int radio;

    @Override
    public double calcularArea() {
        return (Math.PI*Math.pow(radio, 2));
    }

    @Override
    public double calcularPerimetro() {
        return (2*Math.PI*radio);
    }
    
    /**
     * Constructor
     */
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    /* Getters & Setters */

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    
}
