public class Cuadrado extends Figura{
    private float lado;
    
    public Cuadrado(float L){
        lado = L;
    }
    
    public void calcArea(){
        area = lado * lado;
    }
}