public class Triangulo extends Figura{
    private float base;
    private float altura;
    
    /**
     * Constructor 
     */
    public Triangulo(float B, float H){
        base = B;
        altura = H;
    }
    
    /** 
     * Método para el área de un triángulo
     */
    @Override //Avisa al compilador si se escribe mal el método
    public void calcularArea(){
        area= (base * altura) / 2;
    }
    
    /** 
     * Método para el perímetro de un triángulo
     */
    @Override
    public void calcularPerimetro(){
        perimetro = (2 * altura) + base;
    }
    
    
}