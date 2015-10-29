package T9_P1;

import static java.lang.Math.PI;



class Circle {
    private Ponto centro;
    private float raio;

    public Circle() {
    }
  
    public Circle(Ponto centro, float raio) {
        this.centro = centro;
        this.raio = raio;
    }
    
    public float getDiameter(){
        return raio * 2;
    }
    
    public float getArea(){
        return (float) (raio * raio * PI);
    }
    
    public Ponto getCentro() {
        return centro;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }


}
