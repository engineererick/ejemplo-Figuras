/**
 * Ésta clase representa todo lo relacionado con el radio del Círculo
 */

public class Circulo extends Figura {
    private float radio;
    
    public Circulo(float Rad){
        radio = Rad;
    }
    
    @Override
    public void calcArea(){
        area = 3.14159f * radio * radio;
    }
}