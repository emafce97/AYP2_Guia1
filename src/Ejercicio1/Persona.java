package Ejercicio1;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public boolean equals(Persona p){
        return p.nombre.equals(p.getNombre()) && p.edad == p.getEdad();
    }

    private int getEdad() {
        return this.edad;
    }

    private String getNombre() {
        return this.nombre;
    }
}

class Demo {

    public static void main(String[] args){
        Persona p1 = new Persona("Jose Ramirez Mota", 32);
        Persona p2 = new Persona("Lucas Gómez", 53);
        Persona p3 = new Persona("José Ramírez Mota", 32);
        System.out.println("p1 y p3 son iguales: " + (p1.equals(p3)));
    }

}
