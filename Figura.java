/**
 * Ésta clase es ra repesentar las caracerísticas comúnes de muchas figuras
 * 
 * @author engineererick
 * @version 5.0
 * @date 8 Sept 2017
 * MODIFICADO 10 Sept 2017 
 */

public class Figura{
    protected float area;
    protected float perimetro;
    
    /**
     * Constructor
     */
    public Figura(){
        area =0;
        perimetro=0;
    }
    
    /**
     * Calcula el area
     */
    public void calcularArea(){
        System.out.println("No se calcular el area porque no se de que figura se trata");
    }
    
    public void imprimirArea(){
        System.out.println("El area de la figura es: " + area);
    }
    
    /**
     * Calcula el perimetro
     */
    public void calcularPerimetro(){
        System.out.println("No se calcular el perimetro porque no se de que figura se trata");
    }
    
    public void imprimirPerimetro(){
        System.out.println("El perimetro de la figura es: " + perimetro);
    }
}