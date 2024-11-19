/**
 *
 * @author Víctor Davó Antón
 */

public class Triangulo implements Figura{
    private int base, altura;

    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa=Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return (base + altura + hipotenusa);
    }
    
    /**
     * Constructor 
     */
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    /* Getters & Setters */

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
