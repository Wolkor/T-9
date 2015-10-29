package T9_P1;
import static java.lang.Math.*;

class Ponto {

    private float myX;
    private float myY;
    
    public Ponto(){
        myX = (float) 0.0;
        myY = (float) 0.0;
    }
    
    public Ponto(float myX, float myY) {
        this.myX = myX;
        this.myY = myY;
    }
    
    public void desloca(float dx, float dy){
        myX = myX + dx;
        myY = myY + dy;
    }
    
    public float distancia(float x1, float y1, float x2, float y2){
        float dx, dy, distancia;
        dx = x2 - x1;
        dy = y2 - y1;
        distancia = (float) sqrt(dx*dx + dy*dy);
        return distancia;
    }

    public float getMyX(){
        return myX;
    }

    public void setMyX(float myX){
        this.myX = myX;
    }

    public float getMyY(){
        return myY;
    }

    public void setMyY(float myY){
        this.myY = myY;
    }   
}