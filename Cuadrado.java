public class Cuadrado extends Figura{
    private float lado;
    
    /**
     * Constructor 
     */
    public Cuadrado(float L){
        lado = L;
    }
    
    /** 
     * metodo para el área de un cuadrado
     */
    @Override //Avisa al compilador si se escribe mal el método
    public void calcularArea(){
        area = lado * lado;
    }
    
    /** 
     * Método para el perimetro de un cuadrado
     */
    @Override 
    public void calcularPerimetro(){
        perimetro = 4 * lado;
    }
}