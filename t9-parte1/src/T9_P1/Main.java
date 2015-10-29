package T9_P1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Circle cir = new Circle();
        Circle cir2 = new Circle();
        cir.setRaio(aleatorio.nextFloat());
        cir2.setRaio(aleatorio.nextFloat());
        System.out.println("diametro1:" + cir.getDiameter() + ",Area1:" + cir.getArea()+ "");
        System.out.println("diametro2:" + cir2.getDiameter() + ",Area2:" + cir2.getArea()+ "");
    }
    
}
