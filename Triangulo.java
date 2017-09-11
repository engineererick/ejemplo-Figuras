public class Triangulo extends Figura{
    private float base;
    
    /**
     * Constructor 
     */
    public Triangulo(float B){
        base = B;
    }
    
    /** 
     * Método para el área de un triángulo
     */
    @Override //Avisa al compilador si se escribe mal el método
    public void calcularArea(){
        area = .433f * (base * base);
    }
    
    /** 
     * Método para el perímetro de un triángulo
     */
    @Override
    public void calcularPerimetro(){
        perimetro = 3 * base;
    }
    
    
}