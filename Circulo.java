/**
 * Ésta clase representa todo lo relacionado con el radio del Círculo
 */

public class Circulo extends Figura{
    private float radio;
    /**
     * Constructor 
     */
    public Circulo(float unRadio){
        radio = unRadio;
    }
    
    /** 
     * Método para el área de un círculo
     */
    @Override //Avisa al compilador si se escribe mal el metodo
    public void calcularArea(){
        area = 3.14f * radio * radio;
    }
    
    /** 
     * Método para el perimetro de un círculo
     */
    @Override
    public void calcularPerimetro() {
        perimetro = 2 * 3.14f * radio;
    }
}