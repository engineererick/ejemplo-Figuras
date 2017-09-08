/**
 * Ésta clase es ra repesentar las caracerísticas comúnes de muchas figuras
 * 
 * @author engineererick
 * @version 0
 * @date 8 Sept 2017
 */

public class Figura{
    protected float area; //Area de cada figura
    
    public Figura(){
        area = 0;
    }
    
    
    /**
     * Calcular el area de cada figura
     */
    public void calcArea(){
        System.out.println("No se calcular el area de la figura");
    }
    
    public void imprime(){
        System.out.println("El area de la figura es: " + area);
    }
}