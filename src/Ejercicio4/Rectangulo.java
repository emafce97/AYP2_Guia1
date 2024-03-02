package Ejercicio4;

public class Rectangulo {

    private int ancho, alto, x, y;

    public Rectangulo(int ancho, int alto, int x, int y){
        this.ancho = ancho;
        this.alto = alto;
        this.x = x;
        this.y = y;
    }

    public int calcularArea(){
        return this.ancho * this.alto;
    }

    public void trasladar(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean contienePunto(int x, int y){
        return ((x >= this.x && x <= (this.x+this.ancho)) && (y >= this.y && y <= (this.y+this.alto)));
    }
}

class Demo{

    public static void main(String[] args){
        Rectangulo r = new Rectangulo(5,5,0,0);
        System.out.println(r.contienePunto(6, 3));
    }
}
